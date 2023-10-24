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
    
    
}
