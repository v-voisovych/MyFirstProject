/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package training.my.setup;

import static training.my.constants.ModulethreeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import training.my.constants.ModulethreeConstants;
import training.my.service.ModulethreeService;


@SystemSetup(extension = ModulethreeConstants.EXTENSIONNAME)
public class ModulethreeSystemSetup
{
	private final ModulethreeService modulethreeService;

	public ModulethreeSystemSetup(final ModulethreeService modulethreeService)
	{
		this.modulethreeService = modulethreeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		modulethreeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ModulethreeSystemSetup.class.getResourceAsStream("/modulethree/sap-hybris-platform.png");
	}
}
