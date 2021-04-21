package training.my.facade;


import training.my.facade.product.data.ProductData;

public interface MyProductDataFacade {
    ProductData getProductData(String s) throws Exception;
}
