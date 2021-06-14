package training.my.v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import training.my.returns.data.MyProductListWsDTO;
import training.my.returns.data.UserListWsDTO;
import training.my.service.ModuleFiveService;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/{baseSiteID}/module5", headers = "Accept=application/xml,application/json")
public class MyController extends BaseController {

    @Resource
    ModuleFiveService moduleFiveService;

    @RequestMapping(value = "/task3", method = RequestMethod.GET)
    @ResponseBody
    public UserListWsDTO allUsersRegistered24Hours() {
        return moduleFiveService.allUsersRegistered24Hours();
    }

    @RequestMapping(value = "/task4", method = RequestMethod.GET)
    @ResponseBody
    public MyProductListWsDTO allProductsOrderedByGBSize() {
        return moduleFiveService.allProductsOrderedByGBSize();
    }


}
