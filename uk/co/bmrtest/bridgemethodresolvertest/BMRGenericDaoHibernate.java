package uk.co.bmrtest.bridgemethodresolvertest;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BMRGenericDaoHibernate<T extends BMRDomainObjectInterface<?>, ID>
extends HibernateDaoSupport
implements BMRGenericDao<T, ID>
{

  @Override
  public T makePersistent(T aEntity)
  {
    return null;
  }

}
