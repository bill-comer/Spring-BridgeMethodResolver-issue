package uk.co.bmrtest.bridgemethodresolvertest;


public interface BMRGenericDao<T, ID>
{
  String helloWorld(T entity);
  

  /**
   * Persist an Entity to the database.
   * @param aEntity the entity to save
   * @return the saved entity Identity
   */
  T makePersistent(T aEntity);
}
