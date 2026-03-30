/**
 * An interface representing a collection of air conditioner installation bids.
 * This ADT allows for managing multiple bids and searching for the best 
 * options based on cost and performance.
 * * @param <T> The type of bid object stored in the collection (expected to implement BidInterface).
 */
public interface BidCollectionInterface<T> {

    /**
     * Adds a new bid to this collection.
     * * @param newBid The bid to be added to the collection.
     * @return True if the addition was successful, false otherwise.
     * <p><b>Precondition:</b> newBid is not null.</p>
     * <p><b>Postcondition:</b> The collection contains the new bid, and the number 
     * of items has increased by one.</p>
     */
    public boolean addBid(T newBid);

    /**
     * Returns the bid in this collection with the best (lowest) yearly operating cost.
     * * @return The bid with the lowest yearly cost.
     * <p><b>Precondition:</b> The collection is not empty.</p>
     * <p><b>Postcondition:</b> The bid with the minimum yearly cost is returned; 
     * the collection remains unchanged.</p>
     */
    public T getBestYearlyCost();

    /**
     * Returns the bid in this collection with the best (lowest) initial cost.
     * Initial cost is defined as (unit cost + installation cost).
     * * @return The bid with the lowest combined unit and installation cost.
     * <p><b>Precondition:</b> The collection is not empty.</p>
     * <p><b>Postcondition:</b> The bid with the minimum initial cost is returned; 
     * the collection remains unchanged.</p>
     */
    public T getBestInitialCost();

    /**
     * Removes all bids from this collection.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> The collection is empty and the number of items is zero.</p>
     */
    public void clear();

    /**
     * Gets the current number of bids in this collection.
     * * @return An integer representing the number of bids.
     * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> The count of items is returned; the collection is unchanged.</p>
     */
    public int getNumberOfItems();

    /**
     * Checks whether this collection contains any bids.
     * * @return True if the collection is empty, false otherwise.
     * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns true if size is 0; the collection is unchanged.</p>
     */
    public boolean isEmpty();
}