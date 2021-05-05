/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5 трав. 2021 р., 15:36:15                   ---
 * ----------------------------------------------------------------
 */
package training.my.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
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
import training.my.constants.MyextensionConstants;
import training.my.jalo.Film;

/**
 * Generated class for type Actor.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Actor extends GenericItem
{
	/** Qualifier of the <code>Actor.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Actor.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Actor.film</code> attribute **/
	public static final String FILM = "film";
	/** Relation ordering override parameter constants for Film2Actor from ((myextension))*/
	protected static String FILM2ACTOR_SRC_ORDERED = "relation.Film2Actor.source.ordered";
	protected static String FILM2ACTOR_TGT_ORDERED = "relation.Film2Actor.target.ordered";
	/** Relation disable markmodifed parameter constants for Film2Actor from ((myextension))*/
	protected static String FILM2ACTOR_MARKMODIFIED = "relation.Film2Actor.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.film</code> attribute.
	 * @return the film - Film
	 */
	public Set<Film> getFilm(final SessionContext ctx)
	{
		final List<Film> items = getLinkedItems( 
			ctx,
			false,
			MyextensionConstants.Relations.FILM2ACTOR,
			"Film",
			null,
			false,
			false
		);
		return new LinkedHashSet<Film>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.film</code> attribute.
	 * @return the film - Film
	 */
	public Set<Film> getFilm()
	{
		return getFilm( getSession().getSessionContext() );
	}
	
	public long getFilmCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			MyextensionConstants.Relations.FILM2ACTOR,
			"Film",
			null
		);
	}
	
	public long getFilmCount()
	{
		return getFilmCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.film</code> attribute. 
	 * @param value the film - Film
	 */
	public void setFilm(final SessionContext ctx, final Set<Film> value)
	{
		setLinkedItems( 
			ctx,
			false,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.film</code> attribute. 
	 * @param value the film - Film
	 */
	public void setFilm(final Set<Film> value)
	{
		setFilm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to film. 
	 * @param value the item to add to film - Film
	 */
	public void addToFilm(final SessionContext ctx, final Film value)
	{
		addLinkedItems( 
			ctx,
			false,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to film. 
	 * @param value the item to add to film - Film
	 */
	public void addToFilm(final Film value)
	{
		addToFilm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from film. 
	 * @param value the item to remove from film - Film
	 */
	public void removeFromFilm(final SessionContext ctx, final Film value)
	{
		removeLinkedItems( 
			ctx,
			false,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from film. 
	 * @param value the item to remove from film - Film
	 */
	public void removeFromFilm(final Film value)
	{
		removeFromFilm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.firstName</code> attribute.
	 * @return the firstName - Actor's name
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "firstName".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.firstName</code> attribute.
	 * @return the firstName - Actor's name
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.firstName</code> attribute. 
	 * @param value the firstName - Actor's name
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "firstName".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.firstName</code> attribute. 
	 * @param value the firstName - Actor's name
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Film");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.lastName</code> attribute.
	 * @return the lastName - Actor's last name
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "lastName".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Actor.lastName</code> attribute.
	 * @return the lastName - Actor's last name
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.lastName</code> attribute. 
	 * @param value the lastName - Actor's last name
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "lastName".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Actor.lastName</code> attribute. 
	 * @param value the lastName - Actor's last name
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
}
