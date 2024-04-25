package realestate;
/**
 * This is an abstract class has the methods to get the Real Estate to then specify the sale type
 * Author: SBAI Aymane
 */
public abstract class SaleType{
    private RealEstateForSale RealEstateSale;

    
    /** 
     * @return RealEstateForSale
     */
    public RealEstateForSale getRealEstateSale() {
        return RealEstateSale;
    }
    
}