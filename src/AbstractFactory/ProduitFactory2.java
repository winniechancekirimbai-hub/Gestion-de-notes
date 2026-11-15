package AbstractFactory;

public class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA(){
        return new ProduitA2();
    }
    public ProduitB getProduit(){
        return  new ProduitB2();
    }


    
}
 
    

