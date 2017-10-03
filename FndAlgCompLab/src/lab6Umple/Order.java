/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 16 "main.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private String productKey;
  private String productName;
  private String shipped;
  private String validOrder;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(String aProductKey, String aProductName, String aShipped, String aValidOrder, Account aAccount)
  {
    productKey = aProductKey;
    productName = aProductName;
    shipped = aShipped;
    validOrder = aValidOrder;
    boolean didAddAccount = setAccount(aAccount);
    if (!didAddAccount)
    {
      throw new RuntimeException("Unable to create order due to account");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setProductKey(String aProductKey)
  {
    boolean wasSet = false;
    productKey = aProductKey;
    wasSet = true;
    return wasSet;
  }

  public boolean setProductName(String aProductName)
  {
    boolean wasSet = false;
    productName = aProductName;
    wasSet = true;
    return wasSet;
  }

  public boolean setShipped(String aShipped)
  {
    boolean wasSet = false;
    shipped = aShipped;
    wasSet = true;
    return wasSet;
  }

  public boolean setValidOrder(String aValidOrder)
  {
    boolean wasSet = false;
    validOrder = aValidOrder;
    wasSet = true;
    return wasSet;
  }

  public String getProductKey()
  {
    return productKey;
  }

  public String getProductName()
  {
    return productName;
  }

  public String getShipped()
  {
    return shipped;
  }

  public String getValidOrder()
  {
    return validOrder;
  }

  public Account getAccount()
  {
    return account;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    if (aAccount == null)
    {
      return wasSet;
    }

    Account existingAccount = account;
    account = aAccount;
    if (existingAccount != null && !existingAccount.equals(aAccount))
    {
      existingAccount.removeOrder(this);
    }
    account.addOrder(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Account placeholderAccount = account;
    this.account = null;
    placeholderAccount.removeOrder(this);
  }


  public String toString()
  {
    return super.toString() + "["+
            "productKey" + ":" + getProductKey()+ "," +
            "productName" + ":" + getProductName()+ "," +
            "shipped" + ":" + getShipped()+ "," +
            "validOrder" + ":" + getValidOrder()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}