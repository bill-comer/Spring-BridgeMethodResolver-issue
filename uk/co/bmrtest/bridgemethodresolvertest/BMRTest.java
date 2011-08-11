package uk.co.bmrtest.bridgemethodresolvertest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/uk/co/bmrtest/bridgemethodresolvertest/bmr-config.xml"})
@SuppressWarnings("unchecked")
public class BMRTest
{
  @Test
  public void testHelloWorld() throws Exception
  { 
    assertTrue(true);
  }
}
