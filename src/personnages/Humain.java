package personnages;

public class Humain {
	private String nom;
    private String boissonFavorite;
    private int argent;
    
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }
    
    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }
    
    public void parler(String texte) {
        System.out.println(nom + " - " + texte);
    }
    
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }
    
    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void perdreArgent(int perte) {
        argent -= perte;
    }
    
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            parler("J'ai acheté un(e) " + bien + " pour " + prix + " euros.");
        } 
        else {
            parler("Je n'ai pas assez d'argent pour acheter un(e) " + bien + ".");
        }
    }
    
    
}
