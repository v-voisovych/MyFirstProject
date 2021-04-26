/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26 квіт. 2021 р., 16:53:20                  ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import training.my.constants.UiextensionConstants;
import training.my.jalo.Car;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Driver}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDriver extends GenericItem
{
	/** Qualifier of the <code>Driver.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Driver.dateOfBirth</code> attribute **/
	public static final String DATEOFBIRTH = "dateOfBirth";
	/** Qualifier of the <code>Driver.cars</code> attribute **/
	public static final String CARS = "cars";
	/** Relation ordering override parameter constants for Driver2Car from ((uiextension))*/
	protected static String DRIVER2CAR_SRC_ORDERED = "relation.Driver2Car.source.ordered";
	protected static String DRIVER2CAR_TGT_ORDERED = "relation.Driver2Car.target.ordered";
	/** Relation disable markmodifed parameter constants for Driver2Car from ((uiextension))*/
	protected static String DRIVER2CAR_MARKMODIFIED = "relation.Driver2Car.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DATEOFBIRTH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.cars</code> attribute.
	 * @return the cars
	 */
	public Set<Car> getCars(final SessionContext ctx)
	{
		final List<Car> items = getLinkedItems( 
			ctx,
			true,
			UiextensionConstants.Relations.DRIVER2CAR,
			"Car",
			null,
			false,
			false
		);
		return new LinkedHashSet<Car>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.cars</code> attribute.
	 * @return the cars
	 */
	public Set<Car> getCars()
	{
		return getCars( getSession().getSessionContext() );
	}
	
	public long getCarsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			UiextensionConstants.Relations.DRIVER2CAR,
			"Car",
			null
		);
	}
	
	public long getCarsCount()
	{
		return getCarsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.cars</code> attribute. 
	 * @param value the cars
	 */
	public void setCars(final SessionContext ctx, final Set<Car> value)
	{
		setLinkedItems( 
			ctx,
			true,
			UiextensionConstants.Relations.DRIVER2CAR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2CAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.cars</code> attribute. 
	 * @param value the cars
	 */
	public void setCars(final Set<Car> value)
	{
		setCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cars. 
	 * @param value the item to add to cars
	 */
	public void addToCars(final SessionContext ctx, final Car value)
	{
		addLinkedItems( 
			ctx,
			true,
			UiextensionConstants.Relations.DRIVER2CAR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2CAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cars. 
	 * @param value the item to add to cars
	 */
	public void addToCars(final Car value)
	{
		addToCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cars. 
	 * @param value the item to remove from cars
	 */
	public void removeFromCars(final SessionContext ctx, final Car value)
	{
		removeLinkedItems( 
			ctx,
			true,
			UiextensionConstants.Relations.DRIVER2CAR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2CAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cars. 
	 * @param value the item to remove from cars
	 */
	public void removeFromCars(final Car value)
	{
		removeFromCars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth()
	{
		return getDateOfBirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final String value)
	{
		setDateOfBirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Car");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVER2CAR_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
