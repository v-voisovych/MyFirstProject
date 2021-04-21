package training.my.service.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.impl.SearchResultImpl;
import de.hybris.platform.testframework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import training.my.jalo.CarProduct;
import training.my.model.CarProductModel;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@UnitTest
public class MyOrderServiceImplTest {

    @Mock
    private FlexibleSearchService flexibleSearchService;

    @Mock
    private SearchResultImpl searchResult;

    @InjectMocks
    private MyOrderServiceImpl myOrderService;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        myOrderService.setFlexibleSearchService(flexibleSearchService);

    }

    @Test
    public void latestOrderTest() {
        String query = "select {pk} from {order} where {date} in ({{select max({date}) from {order}}})";
        OrderModel order = new OrderModel();
        order.setCode("order");
        List<OrderModel> list = new ArrayList<>();
        list.add(order);
        when(flexibleSearchService.search(query)).thenReturn(searchResult);
        when(searchResult.getResult()).thenReturn(list);
        Assert.assertEquals(order.getCode(), myOrderService.latestOrder().getCode());
    }

    @Test
    public void totalOrdersTest() {
        String query = "select {pk} from {order}";
        when(flexibleSearchService.search(query)).thenReturn(searchResult);
        when(searchResult.getCount()).thenReturn(8);
        Assert.assertEquals(8, myOrderService.totalOrders());
        verify(searchResult, times(1)).getCount();
    }

    @Test
    public void finUserWithMaxOrderTest() {
        String query = "SELECT {user} FROM {order} GROUP BY {user} HAVING COUNT(*) = ({{SELECT COUNT(*) FROM {order} GROUP BY {user} ORDER BY COUNT(*) DESC LIMIT 1}})";
        List<UserModel> list = new ArrayList<>();
        UserModel user =  new UserModel();
        user.setName("Valera");
        list.add(user);
        when(flexibleSearchService.search(query)).thenReturn(searchResult);
        when(searchResult.getResult()).thenReturn(list);
        Assert.assertEquals(user.getName(), myOrderService.finUserWithMaxOrder().get(0).getName());
        verify(flexibleSearchService, times(1)).search(query);
        verify(searchResult, times(1)).getResult();

    }


}