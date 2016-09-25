package io.lattengineer.LattEngineerAPI.annotations;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ METHOD, CONSTRUCTOR, LOCAL_VARIABLE, TYPE })
public @interface LattEngineerData
{
	public int priorityNumber() default 0;
	
	public PriorityParameter ReferanceType() default PriorityParameter.REFERANCE;

}
