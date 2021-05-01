/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 1 трав. 2021 р., 11:43:05                   ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import training.my.constants.UiextensionConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Courses}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCourses extends GenericItem
{
	/** Qualifier of the <code>Courses.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Courses.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Courses.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>Courses.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.amount</code> attribute.
	 * @return the amount
	 */
	public String getAmount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.amount</code> attribute.
	 * @return the amount
	 */
	public String getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final String value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.duration</code> attribute.
	 * @return the duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Courses.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Courses.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
