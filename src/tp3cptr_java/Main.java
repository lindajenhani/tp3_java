package tp3cptr_java;

public class Main { 

    public static void main(String[] args) {
        // Création d'un tableau de coureurs avec une taille de 5
        Coureur[] coureurs = new Coureur[4];

        // Initialisation des coureurs avec leur nom et temps de sommeil en millisecondes
        coureurs[0] = new Coureur("Coureur1", 1200);
        coureurs[1] = new Coureur("Coureur2", 3000);
        coureurs[2] = new Coureur("Coureur3", 2500);
        coureurs[3] = new Coureur("Coureur4", 1600);

        // Démarrage de chaque coureur (utilisation de la méthode start qui doit être définie dans la classe Coureur)
        for (Coureur coureur : coureurs) {
            coureur.start();
        }

        try {
            // Attente de la fin de chaque coureur (utilisation de la méthode join pour attendre la fin de l'exécution)
            for (Coureur coureur : coureurs) {
                coureur.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sélection du coureur le plus rapide (gagnant)
        Coureur gagnant = coureurs[0];
        for (int i = 1; i < coureurs.length; i++) {
            // Comparaison des vitesses pour trouver le coureur le plus rapide
            if (coureurs[i].getVitesse() < gagnant.getVitesse()) {
                gagnant = coureurs[i];
            }
        }

        // Affichage du nom du gagnant
        System.out.println("Le gagnant est " + gagnant.getNom());
    }
}
