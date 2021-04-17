package training.my.service;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;

import java.util.List;

public interface MyOrderService {
    int totalOrders();
    OrderModel latestOrder();
    List<UserModel> finUserWithMaxOrder();
}
