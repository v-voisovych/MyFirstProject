package training.my.service.impl;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class MyOrderServiceImplIntegrationTest extends ServicelayerTransactionalTest {

    @Resource
    MyOrderServiceImpl myOrderService;

    @Before
    public void setUp() throws ImpExException {
        importCsv("/impex/init.impex", "utf-8");
    }

    @Test
    public void totalOrdersTest() {
        int totalOrders = myOrderService.totalOrders();
        Assert.assertEquals(6, totalOrders);
    }

    @Test
    public void latestOrder() {
        OrderModel orderModel = myOrderService.latestOrder();
        Assert.assertEquals("my6", orderModel.getName());
        Assert.assertEquals("my 6 order", orderModel.getDescription());
    }

    @Test
    public void finUserWithMaxOrderTest() {
        List<UserModel> userModel = myOrderService.finUserWithMaxOrder();
        Assert.assertEquals("Stepan", userModel.get(1).getName());
        Assert.assertEquals("Ivan", userModel.get(0).getName());
        Assert.assertEquals(2, userModel.size());
    }
}