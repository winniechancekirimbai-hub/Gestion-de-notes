package AbstractFactory;

public class Client {
    public static  void main(String[] args) {
        IProduitFactory produitFactory1 =new ProduitFactory1();
        IProduitFactory produitFactory2 =new ProduitFactory2();
        produitA produitA = null;
        produitB produitB = null;
        System.out.println("Utilisation de la premiere fabrique");
        ProduitA =produitFactory1.getProduitA();
        ProduitB =produitFactory1.getProduitB();
        produitA.methode();
        produitB.methode();


    
}
}