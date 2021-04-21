package training.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import training.my.facade.impl.MyOrderFacadeImpl;

import javax.annotation.Resource;

@Controller
public class OrderController {
    @Resource
    MyOrderFacadeImpl myOrderFacade;

    @RequestMapping(value = "/allOrders", method = RequestMethod.GET)
    public String allOrders(Model model) {
        model.addAttribute("allOrders", myOrderFacade.totalOrder());
        return "500";
    }
}
