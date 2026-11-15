package AbstractFactory;

public class ProduitFactory1 implements IProduitFactory{
    public ProduitA getProduitA(){
        return new ProduitA1();
    }
    public ProduitB getProduit(){
        return  new ProduitB1();
    }


    
}
