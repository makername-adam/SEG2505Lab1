public class Account 
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public String Courriel;
  public String Password;


  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Account(String Courriel, String Password)
  {
    this.Courriel = Courriel;
    this.Password = Password;
  }
 
  
  //Instance methods **************************************************
 
  public void setCourriel(String S)
  {
    this.Courriel= S;
  }
   public void setPassword(String S)
  {
    this.Password= S;
  }
  
   public String getCourriel()
  {
    return Courriel;
  }
   
   public String getPassword()
  {
    return Password;
  }
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
    return "Votre Courriel est: " + getCourriel() + "et votre mot de passe est:" + getPassword();
  }
}