/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package training.my.setup;

import static training.my.constants.ModulefourConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import training.my.constants.ModulefourConstants;
import training.my.service.ModulefourService;


@SystemSetup(extension = ModulefourConstants.EXTENSIONNAME)
public class ModulefourSystemSetup
{
	private final ModulefourService modulefourService;

	public ModulefourSystemSetup(final ModulefourService modulefourService)
	{
		this.modulefourService = modulefourService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		modulefourService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ModulefourSystemSetup.class.getResourceAsStream("/modulefour/sap-hybris-platform.png");
	}
}
