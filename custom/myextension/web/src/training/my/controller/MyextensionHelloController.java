/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package training.my.controller;

import static training.my.constants.MyextensionConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import training.my.service.MyextensionService;


@Controller
public class MyextensionHelloController
{
	@Autowired
	private MyextensionService myextensionService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", myextensionService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
