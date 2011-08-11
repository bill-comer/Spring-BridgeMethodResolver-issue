package uk.co.bmrtest.bridgemethodresolvertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository("parms.BMRTestService")
public class BMRTestServiceImpl implements BMRTestService
{

  @Autowired(required=true)
  @Qualifier("parms.BMRDomainObjectDao")
  private BMRDomainObjectDao bMRDomainObjectDao;
  
}
