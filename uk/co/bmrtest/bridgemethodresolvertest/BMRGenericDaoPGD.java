package uk.co.bmrtest.bridgemethodresolvertest;


public abstract class BMRGenericDaoPGD<T extends BMRBaseVersionedDomainObject<Long>,ID >
extends BMRGenericDaoHibernate<T, ID>
{
}
