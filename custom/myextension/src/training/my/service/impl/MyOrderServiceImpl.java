package training.my.service.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.springframework.beans.factory.annotation.Required;
import training.my.service.MyOrderService;

import java.util.List;

public class MyOrderServiceImpl implements MyOrderService {

    private FlexibleSearchService flexibleSearchService;

    @Required
    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService){
        this.flexibleSearchService = flexibleSearchService;
    }

    public int totalOrders() {
        final String query = "select {pk} from {order}";
        final SearchResult searchResult = flexibleSearchService.search(query);
        return searchResult.getCount();
    }

    public OrderModel latestOrder() {
        final String query = "select {pk} from {order} where {date} in ({{select max({date}) from {order}}})";
        final SearchResult<OrderModel> searchResult = flexibleSearchService.search(query);
        List<OrderModel> list = searchResult.getResult();
        return list.get(0);
    }

    public List<UserModel> finUserWithMaxOrder() {
        String query = "SELECT {user} FROM {order} GROUP BY {user} HAVING COUNT(*) = ({{SELECT COUNT(*) FROM {order} GROUP BY {user} ORDER BY COUNT(*) DESC LIMIT 1}})";
        final SearchResult<UserModel> searchResult = flexibleSearchService.search(query);
        return searchResult.getResult();
    }










//    select distinct {u.pk}, {u.name}
//    from {
//        user as u
//        join order as c on {c.user} = {u.pk}
//    }
//    where {u.pk} = ({{select max({user}) from {order}}})



//    SELECT {user} FROM {order}
//    GROUP BY {user}
//    HAVING COUNT(*) = ({{
//        SELECT COUNT(*) FROM {order}
//        GROUP BY {user}
//        ORDER BY COUNT(*) DESC
//        LIMIT 1}}
//)
}
