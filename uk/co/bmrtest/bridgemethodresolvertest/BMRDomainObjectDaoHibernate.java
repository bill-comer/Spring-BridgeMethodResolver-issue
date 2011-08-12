package uk.co.bmrtest.bridgemethodresolvertest;

import org.springframework.stereotype.Repository;

import uk.co.utilisoft.parms.domain.Audit.TYPE;


@Repository("parms.BMRDomainObjectDao")
public class BMRDomainObjectDaoHibernate extends BMRGenericDaoPGD<BMRDomainObject, Long> 
    implements BMRDomainObjectDao
{
  @Override
  //@BMRAudit(auditType = BMREnum.BMR_TEST)
  public String helloWorld(BMRDomainObject entity)
  {
    return "hello world";
  }

}
