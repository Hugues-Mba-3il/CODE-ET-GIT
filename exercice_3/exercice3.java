public class StockManager {

	/**
	 * Gestion du stock en ajoutant ou en retirant des produits du stock
	 * @param typeOperation permet de dire quelle action on souhaite faire
	 * @param produit le nom du produit
	 * @param quantite la quantite du produit
	 * @param stock la quantité du stock
	 */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
    	switch (typeOperation) {
    		case "ajout" : ajouterProduit(quantite, stock); // Ajout au stock
    			break;
    		case "retrait" : retirerProduit(quantite, stock); // Retrait du stock
    			break;
    		default : System.out.println("Opération inconnue."); // Si l'action est inconnu
    		
    	}
    }
    
    /**
     * Ajout d'un nouveau produit
     * @param quantite la quantite du produit
	 * @param stock la quantité du stock
     */
    public void ajouterProduit(int quantite, int stock) {
    	stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    
    
    /**
     * Supprimer un ancien produit
     * @param quantite la quantite du produit
	 * @param stock la quantité du stock
     */
    public void retirerProduit(int quantite, int stock) {
    	if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }
}
