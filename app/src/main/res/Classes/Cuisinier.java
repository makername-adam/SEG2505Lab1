public class Cuisinier extends Utilisateur
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public String description;
  public String voidcheque;
  public double Rating;
  public Integer nbrepasvendus;
  public boolean actif;

  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Cuisinier(String Courriel, String Password)
  {
    super(Courriel,Passwoed);
  }
 
  
  //Instance methods **************************************************
 
 public Meals CreateMeal(String NomRepas, String TypeRepas, String TypeCuisine)
 {
   Meals M= new Meals(NomRepas, TypeRepas, TypeCuisine);
   return M;
 }
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
      String o="actif";
    if(!actif)
      o="NonActif";
    return "Votre voidcheque est " + getNomRepas() + "votre rating est " + getTypeRepas() + "le nb de repas que vous avez vendus est" + getTypeCuisine()+ "et votre compte:" + o;
  }
}