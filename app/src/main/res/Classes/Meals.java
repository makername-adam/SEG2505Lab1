public class Meals
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  public String NomRepas;
  public String TypeRepas;
  public String TypeCuisine;
  public String ListeIngred;
  public String Allergenes;
  public double Prix;
  public String Description;
  public Integer IdCuisinier;
  public boolean Offre;

  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Meals(String NomRepas, String TypeRepas, String TypeCuisine)
  {
    this.NomRepas = NomRepas;
    this.TypeRepas = TypeRepas;
    this.TypeCuisine = TypeCuisine;
  }
 
  
  //Instance methods **************************************************
 
  public void setNomRepas(String S)
  {
    this.NomRepas= S;
  }
   public void setTypeRepas(String S)
  {
    this.TypeRepas= S;
  }
    public void setTypeCuisine(String S)
  {
    this.TypeCuisine= S;
  }
     public void setListeIngred(String S)
  {
    this.ListeIngred= S;
  }
      public void setAllergenes(String S)
  {
    this.Allergenes= S;
  }
       public void setDescription(String S)
  {
    this.Description= S;
  }
        public void setPrix(double S)
  {
    this.Prix= S;
  }
         public void setIdCuisinier(Integer S)
  {
    this.IdCuisinier= S;
  }
          public void setOffre(boolean S)
  {
    this.Offre= S;
  }
  
   public String getNomRepas()
  {
    return NomRepas;
  }
   
   public String getTypeRepas()
  {
    return TypeRepas;
  }
  public String getTypeCuisine()
  {
    return TypeCuisine;
  }
   public String getListeIngred()
  {
    return ListeIngred;
  }
 public String getAllergenes()
  {
    return Allergenes;
  }
 public String getDescription()
  {
    return Description;
  }
 public double getPrix()
  {
    return Prix;
  }
 public Integer getIdcuisinier()
  {
    return IdCuisinier;
  }
 public boolean getOffre()
  {
    return Offre;
  }
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
    {
    String o="offert";
    if(!Offre)
      o="NonOffert";
      
    return "Le repas " + getNomRepas() + "de type " + getTypeRepas() + "de cuisine" + getTypeCuisine()+ "dont la liste d'ingredients est:" + getListeIngred() +"dont les allergenes sont:" + getAllergenes() + "coute:" + getPrix()+ "a ete fait par le cuisinier d'ID:" + getIdcuisinier()+ "est" + o;
  }
}