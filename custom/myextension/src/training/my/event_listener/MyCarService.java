package training.my.event_listener;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;


import javax.annotation.Resource;


public class MyCarService {

    @Resource
    EventService eventService;

    @Resource
    ModelService modelService;

    public void addCartModel(CartModel cartModel) {
        modelService.save(cartModel);
        eventService.publishEvent(new MyEvent());
    }
}
