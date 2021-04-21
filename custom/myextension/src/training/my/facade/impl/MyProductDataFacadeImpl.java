package training.my.facade.impl;


import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import training.my.facade.MyProductDataFacade;
import training.my.facade.product.data.ProductData;

public class MyProductDataFacadeImpl implements MyProductDataFacade {

    private Converter<ProductModel, ProductData> productDataConverter;
    private ProductService productService;

    @Override
    public ProductData getProductData(String s) throws Exception {
        if(productService.getProductForCode(s) == null) {
            throw new Exception();
        }
        ProductData productData = productDataConverter.convert(productService.getProductForCode(s));
        return productData;
    }

    public Converter<ProductModel, ProductData> getProductDataConverter() {
        return productDataConverter;
    }

    public void setProductDataConverter(Converter<ProductModel, ProductData> productDataConverter) {
        this.productDataConverter = productDataConverter;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
