package uk.co.bmrtest.bridgemethodresolvertest;

public enum BMREnum
{
  
  BMR_TEST("BMR Test");
  
  private String description;

  public String getDescription()
  {
    return description;
  }

  private BMREnum(String aDescription)
  {
    description = aDescription;
  }
}
