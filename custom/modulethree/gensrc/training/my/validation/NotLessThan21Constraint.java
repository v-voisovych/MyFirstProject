/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 7 трав. 2021 р., 11:27:07                   ---
 * ----------------------------------------------------------------
 */
package training.my.validation;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.validation.jalo.constraints.AttributeConstraint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type NotLessThan21Constraint.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class NotLessThan21Constraint extends AttributeConstraint
{
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AttributeConstraint.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
}
