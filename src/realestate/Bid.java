package realestate;
import user.Buyer;
public class Bid {
    private Buyer bidder;
    private float amount;

    public Bid(Buyer bidder, float amount) {
        this.bidder = bidder;
        this.amount = amount;
    }

    
    /** 
     * @return Buyer
     */
    public Buyer getBidder() {
        return bidder;
    }

    public void setBidder(Buyer bidder) {
        this.bidder = bidder;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}