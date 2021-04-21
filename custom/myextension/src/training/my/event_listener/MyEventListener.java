package training.my.event_listener;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class MyEventListener extends AbstractEventListener<MyEvent> {
    @Override
    protected void onEvent(MyEvent myEvent) {
        System.out.println("User has added to car!!!!");
    }
}
