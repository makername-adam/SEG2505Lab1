public class Client extends Utilisateur 
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public String InfoBancaire;
  public String Nborders;
  public double Wallet;


  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Client(String Courriel, String Password)
  {
    super(Courriel,Passwoed);
  }
 
  
  //Instance methods **************************************************
 
 
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
    return "Votre Info Bancaire est: " + InfoBancaire + " nb d'ordres effectués est:" + Nborders +" et votre wallet est de :" + Wallet;
  }
}