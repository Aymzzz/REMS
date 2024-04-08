package realestate;
import user.Buyer;
import java.util.ArrayList;
import java.util.Date;

public class Auction extends SaleType {
    private float startingPrice;
    private float currentPrice;
    private Date auctionDeadline;
    private ArrayList<Bid> bids;

    public Auction(float startingPrice, Date auctionDeadline) {
        this.startingPrice = startingPrice;
        this.auctionDeadline = auctionDeadline;
        this.currentPrice = startingPrice;
        this.bids = new ArrayList<>();
    }

    public float getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(float startingPrice) {
        this.startingPrice = startingPrice;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getAuctionDeadline() {
        return auctionDeadline;
    }

    public void setAuctionDeadline(Date auctionDeadline) {
        this.auctionDeadline = auctionDeadline;
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }

    public void addBid(Bid bid) {
        this.bids.add(bid);
    }

    public Buyer declareWinner() {
        return null;
    }
}