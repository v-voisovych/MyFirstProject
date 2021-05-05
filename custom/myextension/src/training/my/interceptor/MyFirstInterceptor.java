package training.my.interceptor;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class MyFirstInterceptor implements ValidateInterceptor<UserModel> {

    @Override
    public void onValidate(UserModel userModel, InterceptorContext interceptorContext) throws InterceptorException {
        if(userModel.getAge() < 0) {
            throw new InterceptorException("age can not be < 0!!!!!");
        }
    }
}
