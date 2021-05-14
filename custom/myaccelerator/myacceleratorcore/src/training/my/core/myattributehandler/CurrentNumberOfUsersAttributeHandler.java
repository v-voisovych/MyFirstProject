package training.my.core.myattributehandler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import training.my.core.model.CurrentNumberOfUsersModel;
import training.my.service.impl.MyUserServiceImpl;

import javax.annotation.Resource;

public class CurrentNumberOfUsersAttributeHandler implements DynamicAttributeHandler<Long, CurrentNumberOfUsersModel> {

    @Resource
    MyUserServiceImpl myUserService;

    @Override
    public Long get(CurrentNumberOfUsersModel model) {
        return (long) myUserService.currentNumberUsers();
    }

    @Override
    public void set(CurrentNumberOfUsersModel model, Long aLong) {
        model.setCurrentNumberOfUsers(aLong);
    }
}
