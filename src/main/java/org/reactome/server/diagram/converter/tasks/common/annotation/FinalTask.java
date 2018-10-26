package org.reactome.server.diagram.converter.tasks.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FinalTask {

    boolean mandatory() default false;

}
