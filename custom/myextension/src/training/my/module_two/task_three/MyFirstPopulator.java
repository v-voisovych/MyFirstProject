package training.my.module_two.task_three;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import training.my.facade.product.data.ProductData;

public class MyFirstPopulator implements Populator<ProductModel, ProductData>{

    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        productData.setCodeWithPK(productModel.getCode() + " " + productModel.getPk());
    }
}
