package training.my.service.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import training.my.service.MyUserService;

import javax.annotation.Resource;

public class MyUserServiceImpl implements MyUserService {

    @Resource
    FlexibleSearchService flexibleSearchService;

    @Override
    public int currentNumberUsers() {
        String query = "select {pk} from {user}";
        SearchResult<UserModel> searchResult = flexibleSearchService.search(query);
        return searchResult.getCount();
    }
}
