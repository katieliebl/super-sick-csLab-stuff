/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/


import java.util.*;

// line 8 "main.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String accNumber;
  private String date;
  private String accountHolder;
  private String ordersComing;

  //Account Associations
  private List<Order> orders;
  private Customer e;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aAccNumber, String aDate, String aAccountHolder, String aOrdersComing)
  {
    accNumber = aAccNumber;
    date = aDate;
    accountHolder = aAccountHolder;
    ordersComing = aOrdersComing;
    orders = new ArrayList<Order>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccNumber(String aAccNumber)
  {
    boolean wasSet = false;
    accNumber = aAccNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(String aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccountHolder(String aAccountHolder)
  {
    boolean wasSet = false;
    accountHolder = aAccountHolder;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrdersComing(String aOrdersComing)
  {
    boolean wasSet = false;
    ordersComing = aOrdersComing;
    wasSet = true;
    return wasSet;
  }

  public String getAccNumber()
  {
    return accNumber;
  }

  public String getDate()
  {
    return date;
  }

  public String getAccountHolder()
  {
    return accountHolder;
  }

  public String getOrdersComing()
  {
    return ordersComing;
  }

  public Order getOrder(int index)
  {
    Order aOrder = orders.get(index);
    return aOrder;
  }

  public List<Order> getOrders()
  {
    List<Order> newOrders = Collections.unmodifiableList(orders);
    return newOrders;
  }

  public int numberOfOrders()
  {
    int number = orders.size();
    return number;
  }

  public boolean hasOrders()
  {
    boolean has = orders.size() > 0;
    return has;
  }

  public int indexOfOrder(Order aOrder)
  {
    int index = orders.indexOf(aOrder);
    return index;
  }

  public Customer getE()
  {
    return e;
  }

  public boolean hasE()
  {
    boolean has = e != null;
    return has;
  }

  public static int minimumNumberOfOrders()
  {
    return 0;
  }

  public Order addOrder(String aProductKey, String aProductName, String aShipped, String aValidOrder)
  {
    return new Order(aProductKey, aProductName, aShipped, aValidOrder, this);
  }

  public boolean addOrder(Order aOrder)
  {
    boolean wasAdded = false;
    if (orders.contains(aOrder)) { return false; }
    Account existingAccount = aOrder.getAccount();
    boolean isNewAccount = existingAccount != null && !this.equals(existingAccount);
    if (isNewAccount)
    {
      aOrder.setAccount(this);
    }
    else
    {
      orders.add(aOrder);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOrder(Order aOrder)
  {
    boolean wasRemoved = false;
    //Unable to remove aOrder, as it must always have a account
    if (!this.equals(aOrder.getAccount()))
    {
      orders.remove(aOrder);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addOrderAt(Order aOrder, int index)
  {  
    boolean wasAdded = false;
    if(addOrder(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOrderAt(Order aOrder, int index)
  {
    boolean wasAdded = false;
    if(orders.contains(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOrderAt(aOrder, index);
    }
    return wasAdded;
  }

  public boolean setE(Customer aE)
  {
    boolean wasSet = false;
    Customer existingE = e;
    e = aE;
    if (existingE != null && !existingE.equals(aE))
    {
      existingE.removeA(this);
    }
    if (aE != null)
    {
      aE.addA(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    for(int i=orders.size(); i > 0; i--)
    {
      Order aOrder = orders.get(i - 1);
      aOrder.delete();
    }
    if (e != null)
    {
      Customer placeholderE = e;
      this.e = null;
      placeholderE.removeA(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "accNumber" + ":" + getAccNumber()+ "," +
            "date" + ":" + getDate()+ "," +
            "accountHolder" + ":" + getAccountHolder()+ "," +
            "ordersComing" + ":" + getOrdersComing()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "e = "+(getE()!=null?Integer.toHexString(System.identityHashCode(getE())):"null");
  }
}