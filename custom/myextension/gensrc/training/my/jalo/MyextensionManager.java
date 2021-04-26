/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26 квіт. 2021 р., 16:53:20                  ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import training.my.constants.MyextensionConstants;
import training.my.jalo.Actor;
import training.my.jalo.CarProduct;
import training.my.jalo.Film;

/**
 * Generated class for type <code>MyextensionManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class MyextensionManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("age", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final SessionContext ctx, final User item)
	{
		return (Integer)item.getProperty( ctx, MyextensionConstants.Attributes.User.AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.age</code> attribute.
	 * @return the age
	 */
	public Integer getAge(final User item)
	{
		return getAge( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx, final User item)
	{
		Integer value = getAge( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.age</code> attribute. 
	 * @return the age
	 */
	public int getAgeAsPrimitive(final User item)
	{
		return getAgeAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final User item, final Integer value)
	{
		item.setProperty(ctx, MyextensionConstants.Attributes.User.AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final User item, final Integer value)
	{
		setAge( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final User item, final int value)
	{
		setAge( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final User item, final int value)
	{
		setAge( getSession().getSessionContext(), item, value );
	}
	
	public Actor createActor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Actor");
			return (Actor)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Actor : "+e.getMessage(), 0 );
		}
	}
	
	public Actor createActor(final Map attributeValues)
	{
		return createActor( getSession().getSessionContext(), attributeValues );
	}
	
	public CarProduct createCarProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CarProduct");
			return (CarProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CarProduct : "+e.getMessage(), 0 );
		}
	}
	
	public CarProduct createCarProduct(final Map attributeValues)
	{
		return createCarProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Film createFilm(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Film");
			return (Film)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Film : "+e.getMessage(), 0 );
		}
	}
	
	public Film createFilm(final Map attributeValues)
	{
		return createFilm( getSession().getSessionContext(), attributeValues );
	}
	
	public static final MyextensionManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MyextensionManager) em.getExtension(MyextensionConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return MyextensionConstants.EXTENSIONNAME;
	}
	
}
