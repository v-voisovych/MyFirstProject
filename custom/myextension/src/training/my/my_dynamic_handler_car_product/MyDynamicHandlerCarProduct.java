package training.my.my_dynamic_handler_car_product;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import training.my.model.CarProductModel;

public class MyDynamicHandlerCarProduct implements DynamicAttributeHandler<String, CarProductModel> {

    @Override
    public String get(CarProductModel model) {
        if (model == null) {
            throw new IllegalArgumentException("Item model is required");
        }
        return model.getCode() + model.getPk();
    }

    @Override
    public void set(CarProductModel model, String s) {
        if (model != null && s == null) {
            String [] split = s.split(" ");
            model.setCode(split[0]);
        }
    }
}
