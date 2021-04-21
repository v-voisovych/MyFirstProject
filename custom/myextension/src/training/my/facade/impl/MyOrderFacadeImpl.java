package training.my.facade.impl;

import training.my.facade.MyOrderFacade;
import training.my.service.impl.MyOrderServiceImpl;

import javax.annotation.Resource;

public class MyOrderFacadeImpl implements MyOrderFacade {

    @Resource
    MyOrderServiceImpl myOrderService;

    @Override
    public int totalOrder() {
        return myOrderService.totalOrders();
    }
}
