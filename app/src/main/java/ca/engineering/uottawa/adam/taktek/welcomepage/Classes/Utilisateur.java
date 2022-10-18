public class Utilisateur extends Account 
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public String Prenom;
  public String Nom;
  public String Adresse;


  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Utilisateur(String Prenom, String Nom, String Adresse, String Courriel, String Password)
  {
    this.Prenom = Prenom;
    this.Nom = Nom;
    this.Adresse=Adresse;
    super(Courriel,Password);
  }
 
  
  //Instance methods **************************************************
 
  public void setPrenom(String S)
  {
    this.Prenom= S;
  }
   public void setNom(String S)
  {
    this.Nom= S;
  }
   public void setAdresse(String S)
  {
    this.Adresse= S;
  }
   public String getPrenom()
  {
    return Prenom;
  }
   
   public String getNom()
  {
    return Nom;
  }
    public String getAdresse()
  {
    return Adresse;
  }
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
    return "Votre Prenom est: " + getPrenom() + " votre Nom est:" + getNom()+ " et votre Adresse est:" + getAdresse();
  }
}
