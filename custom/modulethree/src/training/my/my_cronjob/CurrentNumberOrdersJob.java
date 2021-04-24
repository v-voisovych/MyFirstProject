package training.my.my_cronjob;

import de.hybris.cronjobtutorial.model.CurrentNumberOrdersCronJobModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import training.my.service.impl.MyOrderServiceImpl;

import javax.annotation.Resource;
import java.util.logging.Logger;

public class CurrentNumberOrdersJob extends AbstractJobPerformable<CurrentNumberOrdersCronJobModel> {

    private static final Logger LOGGER = Logger.getLogger(CurrentNumberOrdersJob.class.getName());

    @Resource
    MyOrderServiceImpl myOrderService;

    @Override
    public PerformResult perform(CurrentNumberOrdersCronJobModel currentNumberOrdersCronJobModel) {
        LOGGER.info("**************************************");
        LOGGER.info("Current number of orders: " + myOrderService.totalOrders() + ".");
        LOGGER.info("**************************************");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
