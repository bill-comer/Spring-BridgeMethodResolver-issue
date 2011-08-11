package uk.co.bmrtest.bridgemethodresolvertest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static uk.co.utilisoft.parms.domain.Audit.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BMRAudit
{
  TYPE auditType();
}
