package realestate;

import user.Buyer;

public class BuyNow extends SaleType {
    private float price;
    private Buyer buyer;
    
    public BuyNow(float price, Buyer buyer){
        super();
        this.buyer= buyer;
        this.price= price;   
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the buyer
     */
    public Buyer getBuyer() {
        return buyer;
    }

    /**
     * @param buyer the buyer to set
     */
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    
}
