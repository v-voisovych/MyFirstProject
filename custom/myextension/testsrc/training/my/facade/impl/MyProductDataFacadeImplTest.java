package training.my.facade.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import training.my.facade.product.data.ProductData;


import javax.annotation.Resource;

@IntegrationTest
public class MyProductDataFacadeImplTest extends ServicelayerTransactionalTest {

    @Resource
    MyProductDataFacadeImpl myProductDataFacadeImpl;

    @Before
    public void setUp() throws ImpExException {
        importCsv("/impex/init.impex", "utf-8");
    }

    @Test
    public void getProductDataTest() throws Exception {
        ProductData productData = myProductDataFacadeImpl.getProductData("carOne");
        String[] s = productData.getCodeWithPK().split(" ");
        Assert.assertEquals("carOne", s[0]);
    }

}