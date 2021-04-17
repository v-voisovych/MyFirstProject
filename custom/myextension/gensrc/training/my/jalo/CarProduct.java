/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 17 квіт. 2021 р., 11:07:24                  ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type CarProduct.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CarProduct extends Product
{
	/** Qualifier of the <code>CarProduct.color</code> attribute **/
	public static final String COLOR = "color";
	/** Qualifier of the <code>CarProduct.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COLOR, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.color</code> attribute.
	 * @return the color - My Example Initial String Value
	 */
	public String getColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "color".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.color</code> attribute.
	 * @return the color - My Example Initial String Value
	 */
	public String getColor()
	{
		return getColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.color</code> attribute. 
	 * @param value the color - My Example Initial String Value
	 */
	public void setColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "color".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.color</code> attribute. 
	 * @param value the color - My Example Initial String Value
	 */
	public void setColor(final String value)
	{
		setColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.weight</code> attribute.
	 * @return the weight - Example Initial Boolean Field
	 */
	public Double getWeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, "weight".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.weight</code> attribute.
	 * @return the weight - Example Initial Boolean Field
	 */
	public Double getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.weight</code> attribute. 
	 * @return the weight - Example Initial Boolean Field
	 */
	public double getWeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getWeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarProduct.weight</code> attribute. 
	 * @return the weight - Example Initial Boolean Field
	 */
	public double getWeightAsPrimitive()
	{
		return getWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.weight</code> attribute. 
	 * @param value the weight - Example Initial Boolean Field
	 */
	public void setWeight(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, "weight".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.weight</code> attribute. 
	 * @param value the weight - Example Initial Boolean Field
	 */
	public void setWeight(final Double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.weight</code> attribute. 
	 * @param value the weight - Example Initial Boolean Field
	 */
	public void setWeight(final SessionContext ctx, final double value)
	{
		setWeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarProduct.weight</code> attribute. 
	 * @param value the weight - Example Initial Boolean Field
	 */
	public void setWeight(final double value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
}
