/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/


import java.util.*;

// line 2 "main.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private String hasAccount;

  //Customer Associations
  private List<Account> a;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, String aHasAccount)
  {
    name = aName;
    hasAccount = aHasAccount;
    a = new ArrayList<Account>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setHasAccount(String aHasAccount)
  {
    boolean wasSet = false;
    hasAccount = aHasAccount;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getHasAccount()
  {
    return hasAccount;
  }

  public Account getA(int index)
  {
    Account aA = a.get(index);
    return aA;
  }

  public List<Account> getA()
  {
    List<Account> newA = Collections.unmodifiableList(a);
    return newA;
  }

  public int numberOfA()
  {
    int number = a.size();
    return number;
  }

  public boolean hasA()
  {
    boolean has = a.size() > 0;
    return has;
  }

  public int indexOfA(Account aA)
  {
    int index = a.indexOf(aA);
    return index;
  }

  public static int minimumNumberOfA()
  {
    return 0;
  }

  public boolean addA(Account aA)
  {
    boolean wasAdded = false;
    if (a.contains(aA)) { return false; }
    Customer existingE = aA.getE();
    if (existingE == null)
    {
      aA.setE(this);
    }
    else if (!this.equals(existingE))
    {
      existingE.removeA(aA);
      addA(aA);
    }
    else
    {
      a.add(aA);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeA(Account aA)
  {
    boolean wasRemoved = false;
    if (a.contains(aA))
    {
      a.remove(aA);
      aA.setE(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addAAt(Account aA, int index)
  {  
    boolean wasAdded = false;
    if(addA(aA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfA()) { index = numberOfA() - 1; }
      a.remove(aA);
      a.add(index, aA);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAAt(Account aA, int index)
  {
    boolean wasAdded = false;
    if(a.contains(aA))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfA()) { index = numberOfA() - 1; }
      a.remove(aA);
      a.add(index, aA);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAAt(aA, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (a.size() > 0)
    {
      Account aA = a.get(a.size() - 1);
      aA.delete();
      a.remove(aA);
    }
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "hasAccount" + ":" + getHasAccount()+ "]";
  }
}