package uk.co.bmrtest.bridgemethodresolvertest;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;

@Aspect
@Configurable(autowire = Autowire.BY_NAME, dependencyCheck = true)
public class BMRAuditAspect implements BMRAuditAspectInterface
{
  private Logger mlogger = Logger.getLogger(getClass());
  
  @Override
  @AfterReturning(value="execution(@uk.co.bmrtest.bridgemethodresolvertest.BMRAudit * *(..)) && @annotation(bmrAudit)", argNames="bmrAudit")
  public void logTheAuditActivity(JoinPoint aPoint, BMRAudit bmrAudit)
  {
    mlogger.info("auditType:" + bmrAudit.auditType().getDescription());
    
  }
  
}
