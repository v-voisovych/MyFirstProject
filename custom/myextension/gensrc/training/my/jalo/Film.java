/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26 квіт. 2021 р., 16:53:20                  ---
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
import training.my.jalo.Actor;

/**
 * Generated class for type Film.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Film extends GenericItem
{
	/** Qualifier of the <code>Film.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Film.actor</code> attribute **/
	public static final String ACTOR = "actor";
	/** Relation ordering override parameter constants for Film2Actor from ((myextension))*/
	protected static String FILM2ACTOR_SRC_ORDERED = "relation.Film2Actor.source.ordered";
	protected static String FILM2ACTOR_TGT_ORDERED = "relation.Film2Actor.target.ordered";
	/** Relation disable markmodifed parameter constants for Film2Actor from ((myextension))*/
	protected static String FILM2ACTOR_MARKMODIFIED = "relation.Film2Actor.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Film.actor</code> attribute.
	 * @return the actor - Actor
	 */
	public Set<Actor> getActor(final SessionContext ctx)
	{
		final List<Actor> items = getLinkedItems( 
			ctx,
			true,
			MyextensionConstants.Relations.FILM2ACTOR,
			"Actor",
			null,
			false,
			false
		);
		return new LinkedHashSet<Actor>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Film.actor</code> attribute.
	 * @return the actor - Actor
	 */
	public Set<Actor> getActor()
	{
		return getActor( getSession().getSessionContext() );
	}
	
	public long getActorCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			MyextensionConstants.Relations.FILM2ACTOR,
			"Actor",
			null
		);
	}
	
	public long getActorCount()
	{
		return getActorCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Film.actor</code> attribute. 
	 * @param value the actor - Actor
	 */
	public void setActor(final SessionContext ctx, final Set<Actor> value)
	{
		setLinkedItems( 
			ctx,
			true,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Film.actor</code> attribute. 
	 * @param value the actor - Actor
	 */
	public void setActor(final Set<Actor> value)
	{
		setActor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actor. 
	 * @param value the item to add to actor - Actor
	 */
	public void addToActor(final SessionContext ctx, final Actor value)
	{
		addLinkedItems( 
			ctx,
			true,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to actor. 
	 * @param value the item to add to actor - Actor
	 */
	public void addToActor(final Actor value)
	{
		addToActor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actor. 
	 * @param value the item to remove from actor - Actor
	 */
	public void removeFromActor(final SessionContext ctx, final Actor value)
	{
		removeLinkedItems( 
			ctx,
			true,
			MyextensionConstants.Relations.FILM2ACTOR,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from actor. 
	 * @param value the item to remove from actor - Actor
	 */
	public void removeFromActor(final Actor value)
	{
		removeFromActor( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Actor");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(FILM2ACTOR_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Film.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "title".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Film.title</code> attribute.
	 * @return the title - Title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Film.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "title".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Film.title</code> attribute. 
	 * @param value the title - Title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
