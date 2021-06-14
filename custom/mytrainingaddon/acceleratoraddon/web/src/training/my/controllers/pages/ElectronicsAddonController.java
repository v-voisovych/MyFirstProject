package training.my.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.annotation.Resource;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import training.my.facade.impl.MyProductDataFacadeImpl;
import training.my.facade.product.data.ProductData;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping(value = "/addon")
public class ElectronicsAddonController
{
    @Resource
    private MyProductDataFacadeImpl myProductDataFacadeImpl;
    @Resource
    private FlexibleSearchService flexibleSearchService;

    private static final Logger LOG = Logger.getLogger(ElectronicsAddonController.class);

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProductDetails(final Model model) throws CMSItemNotFoundException
    {
        LOG.info("########## ProductDetailsController updateOldPassword() method #####");
        List<ProductData> productDataList = new ArrayList<>();
        String query = "select {pk} from {Product} order by {gb_size}";
        SearchResult<ProductModel> searchResult = flexibleSearchService.search(query);
        List<ProductModel> list = searchResult.getResult();
        for (ProductModel productModel : list) {
            productDataList.add(myProductDataFacadeImpl.getProductDataConverter().convert(productModel, new ProductData()));
        }

        model.addAttribute("ProductData", productDataList);

        return "addon:/mytrainingaddon/pages/electronicsproductdetails";
    }
}
