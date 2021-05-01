package training.my.action;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.processengine.model.BusinessProcessModel;
import de.hybris.platform.task.RetryLaterException;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class ProductRemovedNode extends AbstractSimpleDecisionAction {

    private static final Logger LOGGER = Logger.getLogger(ProductRemovedNode.class.getName());

    @Override
    public Transition executeAction(BusinessProcessModel businessProcessModel) throws RetryLaterException, Exception {
        LOGGER.info("Order was removed from the cart: " + LocalDateTime.now());
        return Transition.OK;
    }
}
