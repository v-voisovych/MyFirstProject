package training.my.task_one_and_two;

import de.hybris.platform.core.Registry;
import de.hybris.platform.tx.Transaction;
import de.hybris.platform.tx.TransactionBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import training.my.service.impl.MyCartService;

import javax.annotation.Resource;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.logging.Logger;

public class MyTransaction {

    private static final Logger LOGGER = Logger.getLogger(MyTransaction.class.getName());

    @Resource
    MyCartService myCartService;

    @Resource(name = "txManager")
    PlatformTransactionManager platformTransactionManager;
	

    public void transactionalAddingCartWithHybris(String productCode, String cartCode, Long quantity, String unitCode) {
        Transaction transaction = Transaction.current();
        transaction.begin();
        boolean trigger = false;
        try {
            myCartService.addProductToTheCart(productCode, cartCode, quantity, unitCode);
            trigger = true;
        }
        finally {
            if (trigger){
                transaction.commit();
                LOGGER.info("****************Transaction was committed!!!!!!!!!!!********************");
            }
            else {
                transaction.rollback();
                LOGGER.info("*****************Transaction was rolled back!!!!************************");
            }
        }
    }
	

    public void transactionalAddingCarWithSpring(String productCode, String cartCode, Long quantity, String unitCode) {
        TransactionTemplate template = new TransactionTemplate(platformTransactionManager);
        try {
            template.execute(new TransactionCallbackWithoutResult() {
                @Override
                protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                    myCartService.addProductToTheCart(productCode, cartCode, quantity, unitCode);
                    LOGGER.info("****************Transaction was committed!!!!!!!!!!!********************");
                }
            });
        }catch (Exception exception) {
            LOGGER.info("*****************Transaction was rolled back!!!! " + exception.getMessage() + "************************");
        }
    }
	

    public void removeProductOrCartWithTransaction(String codeProduct) throws Exception {
        Transaction.current().execute(new TransactionBody() {
            @Override
            public <T> T execute() throws Exception {
                myCartService.removeProductOrCart(codeProduct);
                return null;
            }
        });
    }

}
