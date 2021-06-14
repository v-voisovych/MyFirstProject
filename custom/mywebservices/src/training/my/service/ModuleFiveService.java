package training.my.service;

import de.hybris.platform.commercewebservicescommons.dto.user.UserWsDTO;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import training.my.facade.impl.MyProductDataFacadeImpl;
import training.my.facade.product.data.ProductData;
import training.my.returns.data.MyProductListWsDTO;
import training.my.returns.data.UserListWsDTO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class ModuleFiveService {
    @Resource
    FlexibleSearchService flexibleSearchService;

    @Resource
    MyProductDataFacadeImpl myProductDataFacadeImpl;

    public UserListWsDTO allUsersRegistered24Hours() {
        String query = "select {pk} from {User} where {creationTime} >= DATE_SUB(NOW(), INTERVAL 1 DAY)";
        SearchResult<UserModel> searchResult = flexibleSearchService.search(query);
        List<UserModel> list = searchResult.getResult();
        List<UserWsDTO> listUserWsDTO = new ArrayList<>();
        for (UserModel userModel : list) {
            UserWsDTO userWsDTO = new UserWsDTO();
            userWsDTO.setName(userModel.getName());
            userWsDTO.setUid(userModel.getUid());
            listUserWsDTO.add(userWsDTO);
        }
        UserListWsDTO userListWsDTO = new UserListWsDTO();
        userListWsDTO.setUserList(listUserWsDTO);
        return userListWsDTO;
    }

    public MyProductListWsDTO allProductsOrderedByGBSize() {
        List<ProductData> productDataList = new ArrayList<>();
        String query = "select {pk} from {Product} order by {gb_size}";
        SearchResult<ProductModel> searchResult = flexibleSearchService.search(query);
        List<ProductModel> list = searchResult.getResult();
        for (ProductModel productModel : list) {
            productDataList.add(myProductDataFacadeImpl.getProductDataConverter().convert(productModel, new ProductData()));
        }
        MyProductListWsDTO productListWsDTO = new MyProductListWsDTO();
        productListWsDTO.setProductList(productDataList);
        return productListWsDTO;
    }
}
