public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total = calculerFactureAlimentaire(quantite, prixUnitaire); 
        } else if (typeProduit.equals("Electronique")) {
            total = calculerFactureElectronique(quantite, prixUnitaire); 
        } else if (typeProduit.equals("Luxe")) {
            total = calculerFactureLuxe(quantite, prixUnitaire); 
        }

        // Reduction sur le total
        if (total > 1000) {
            total = calculerReduction(total); 
        }

        return total;
    }
 
    
    // Réduction de 5% pour les articles alimentaires
    public double calculerFactureAlimentaire (int quantite, double prixUnitaire) {
    	return (quantite * prixUnitaire) - ( (quantite * prixUnitaire) * 0.05;
    }
    
    
    // Réduction de 10% pour les articles electroniques
    public double calculerFactureElectronique (int quantite, double prixUnitaire) {
    	return (quantite * prixUnitaire) - ( (quantite * prixUnitaire) * 0.1;
    }
    
    
    // Réduction de 15% pour les articles de luxes
    public double calculerFactureLuxe (int quantite, double prixUnitaire) {
    	return (quantite * prixUnitaire) - ( (quantite * prixUnitaire) * 0.15;
    }
    
    
	// Réduction supplémentaire de 5% pour les gros montants
    public double calculerReduction (double total) {
    	total -= total * 0.05;
    }
}
