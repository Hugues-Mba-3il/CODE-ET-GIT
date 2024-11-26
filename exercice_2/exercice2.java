public class GestionnaireNotes {
	
	/**
     * Affichage des notes, du nom et de la moyenne d'un étudiant
     * @param  int[] notes contient l'ensemble des notes d'un étudiant
     * @param  String nomEtudiant représente le nom de l'étudiant
     */
	public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        afficherNote (nomEtudiant, notes);
        
        // Affichage de la moyenne
        afficherMoyenne(notes);
        
    }
    
	
	/**
     * Affichage des notes et du nom d'un étudiant
     * @param  int[] notes contient l'ensemble des notes d'un étudiant
     */
	public void afficherNote (String nomEtudiant, int[] notes) {
		System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
	}
	
	
	/**
     * Calcul du total des notes
     * @return renvoi le total des notes d'un étudiant
     */
	public int calculerSomme(int[] notes) {
		int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
	}
	
	
	/**
     * Calcul de la moyenne
     * @return renvoi la moyenne d'un étudiant
     */
	public double calculerMoyenne(int[] notes) {
		return (double) calculerSomme(notes) / notes.length;
	}
	
	
	/**
     * Affichage de la moyenne
     */
	public void afficherMoyenne(int[] notes) {
		System.out.println("Moyenne : " + calculerMoyenne(notes));
	}
}
