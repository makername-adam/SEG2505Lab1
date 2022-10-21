package ca.engineering.uottawa.adam.taktek.welcomepage.Classes;

import android.accounts.Account;

public class Admin extends Account
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  


  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Admin(String Courriel, String Password)
  {
    super(Courriel,Password);
  }
 
  
  //Instance methods **************************************************
 
 
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
    return "";
  }
}
