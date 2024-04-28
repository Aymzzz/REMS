package realestate;
import user.Buyer;
import java.util.ArrayList;
import java.util.Date;


/**
 * The `Auction` class represents an auction sale type for real estate properties.
 * It includes information such as the starting price, the current price, the auction deadline,
 * and a list of bids made during the auction. The class provides methods to manage and retrieve
 * the auction details and bids, as well as methods to declare the winner of the auction.
 * 
 * Author: SBAI Aymane
 */
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

    
    /** 
     * @return float
     */
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

    /**
     * Displays the list of bids with bidder names and bid amounts.
     *
     * @param bids The list of bids to be displayed.
     */
    public void displayBids(ArrayList<Bid> bids) {
        for (int i = 0; i < bids.size(); i++) {
            System.out.println(bids.get(i).getBidder().getName() + " bid " + bids.get(i).getAmount());
        }
    }

    public void addBid(Bid bid) {
        this.bids.add(bid);
    }
    
    /**
     * Declares the winner of the auction based on the highest bid.
     *
     * @return The winner of the auction (Buyer object).
     */
    public Buyer declareWinner() {
        float maxBid = 0;
        Buyer winner = null;
        for (int i = 0; i < bids.size(); i++) {
            if (bids.get(i).getAmount() > maxBid) {
                maxBid = bids.get(i).getAmount();
                winner = bids.get(i).getBidder();
            }
        }
        return winner;
    }
}