/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 1 трав. 2021 р., 11:43:05                   ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.cronjobtutorial.jalo.CurrentNumberOrdersCronJob;
import de.hybris.cronjobtutorial.jalo.CurrentNumberUsersCronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import training.my.constants.ModulethreeConstants;
import training.my.validation.NotLessThan21Constraint;

/**
 * Generated class for type <code>ModulethreeManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class ModulethreeManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CurrentNumberOrdersCronJob createCurrentNumberOrdersCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CurrentNumberOrdersCronJob");
			return (CurrentNumberOrdersCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CurrentNumberOrdersCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CurrentNumberOrdersCronJob createCurrentNumberOrdersCronJob(final Map attributeValues)
	{
		return createCurrentNumberOrdersCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CurrentNumberUsersCronJob createCurrentNumberUsersCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CurrentNumberUsersCronJob");
			return (CurrentNumberUsersCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CurrentNumberUsersCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CurrentNumberUsersCronJob createCurrentNumberUsersCronJob(final Map attributeValues)
	{
		return createCurrentNumberUsersCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public NotLessThan21Constraint createNotLessThan21Constraint(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("NotLessThan21Constraint");
			return (NotLessThan21Constraint)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NotLessThan21Constraint : "+e.getMessage(), 0 );
		}
	}
	
	public NotLessThan21Constraint createNotLessThan21Constraint(final Map attributeValues)
	{
		return createNotLessThan21Constraint( getSession().getSessionContext(), attributeValues );
	}
	
	public static final ModulethreeManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ModulethreeManager) em.getExtension(ModulethreeConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return ModulethreeConstants.EXTENSIONNAME;
	}
	
}
