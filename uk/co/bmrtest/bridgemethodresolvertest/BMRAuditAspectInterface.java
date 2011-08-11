package uk.co.bmrtest.bridgemethodresolvertest;

import org.aspectj.lang.JoinPoint;

/**
 * @author Philip Lau
 * @version 1.0
 */
public interface BMRAuditAspectInterface
{
  
  /**
   * Audit parms activity.
   * 
   * @param aPoint the aspect join point
   * @param bmrAudit the audit data
   */
  void logTheAuditActivity(JoinPoint aPoint, BMRAudit bmrAudit);
}
