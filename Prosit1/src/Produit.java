import java.util.Date;
public class Produit {
    int identifiant ;
    String libellé, marque ;
    float prix ;
    Date dateexpiration;

    public Produit() {
    }

    public Produit (int identifiant, String libellé, String marque, float prix, Date dateexpiration ){
        this.identifiant=identifiant;
        this.libellé= libellé;
        this.marque=marque;
        this.prix=prix;
        this.dateexpiration=dateexpiration;
    }
    public void afficher () {
        System.out.println("identifiant:  " + identifiant +"  libellé:  " + libellé +"  marque:  " + marque+ "prix:  " + prix + "date expiration:   " + dateexpiration);
    }
    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libellé + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateexpiration=" + dateexpiration +
                '}';
    }
}
