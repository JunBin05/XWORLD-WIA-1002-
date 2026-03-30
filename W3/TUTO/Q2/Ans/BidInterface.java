/**
 * An interface representing a single bid for an air conditioning installation.
 */
public interface BidInterface {

    /**
     * Returns the name of the company making this bid.
     * * @return A String representing the company name.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> The company name is returned; the state of the bid is unchanged.</p>
     */
    public String getName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     * * @return A String description of the AC unit.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> The unit description is returned; the state of the bid is unchanged.</p>
     */
    public String getDescription();

    /**
     * Returns the capacity of this bid's AC in tons.
     * Note: 1 ton = 12,000 BTU.
     * * @return The capacity of the unit as a double.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns the capacity in tons; the state of the bid is unchanged.</p>
     */
    public double getCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * * @return The SEER rating as a double.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns the efficiency rating; the state of the bid is unchanged.</p>
     */
    public double getEfficiency();

    /**
     * Returns the cost of this bid's AC unit.
     * * @return The cost of the unit as a double.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns the unit cost; the state of the bid is unchanged.</p>
     */
    public double getAcCost();

    /**
     * Returns the cost of installing this bid's AC.
     * * @return The installation cost as a double.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns the installation cost; the state of the bid is unchanged.</p>
     */
    public double getInstallationCost();

    /**
     * Returns the yearly cost of operating this bid's AC.
     * * @return The estimated yearly operating cost as a double.
     * * <p><b>Precondition:</b> None.</p>
     * <p><b>Postcondition:</b> Returns the operating cost; the state of the bid is unchanged.</p>
     */
    public double getYearlyCost();
}