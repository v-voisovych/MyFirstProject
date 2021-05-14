package training.my.storefront.controllers.cms;

import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import training.my.core.model.CurrentNumberOfUsersModel;
import training.my.service.MyUserService;
import training.my.storefront.controllers.ControllerConstants;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller("MyCurrentNumberOfUsersController")
@RequestMapping(value = ControllerConstants.Actions.Cms.MyCurrentNumberOfUsersComponent)
public class MyCurrentNumberOfUsersController extends AbstractAcceleratorCMSComponentController<CurrentNumberOfUsersModel>{

    @Override
    protected void fillModel(HttpServletRequest request, Model model, CurrentNumberOfUsersModel component) {
        model.addAttribute("userHeader", component.getUserHeader());
        model.addAttribute("currentNumberOfUsers", component.getCurrentNumberOfUsers());
    }
}
