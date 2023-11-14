package tp3cptr_java;

// Déclaration de la classe Coureur qui étend la classe Thread
class Coureur extends Thread {
    private String nom; 
    private int vitesse; 

    // Constructeur de la classe Coureur
    public Coureur(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
    }

    //obtenir la vitesse du coureur
    public int getVitesse() {
        return vitesse;
    }

    //obtenir le nom du coureur
    public String getNom() {
        return nom;
    }

    // Méthode exécutée lorsqu'un coureur est démarré (appel à la méthode start)
    @Override
    public void run() {
        System.out.println(nom + " a commencé la course.");

        // Simulation de la course en faisant dormir le thread pendant un certain temps (vitesse)
        try {
            Thread.sleep(vitesse);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(nom + " a terminé la course.");
    }
}


