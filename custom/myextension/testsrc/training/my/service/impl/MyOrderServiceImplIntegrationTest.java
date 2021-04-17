package training.my.service.impl;


import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.user.Title;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;


import de.hybris.platform.servicelayer.search.SearchResult;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
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