package training.my.core.myattributehandler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import training.my.core.model.CurrentNumberOfOrdersModel;
import training.my.service.impl.MyOrderServiceImpl;

import javax.annotation.Resource;

public class CurrentNumberOfOrdersAttributeHandler implements DynamicAttributeHandler<Long, CurrentNumberOfOrdersModel> {

    @Resource
    MyOrderServiceImpl myOrderService;

    @Override
    public Long get(CurrentNumberOfOrdersModel model) {
        return (long) myOrderService.totalOrders();
    }

    @Override
    public void set(CurrentNumberOfOrdersModel model, Long aLong) {
        model.setCurrentNumberOfOrders(aLong);
    }
}
