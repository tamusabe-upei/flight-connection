public class PremiumBooking  extends Booking {
    private int baggageCount;
    private double baggageWeight;

    public PremiumBooking(Flight flight, String date, String passengerName, double price, int baggageCount, double baggageWeight){
        super(flight, passengerName, date, price);
        this.baggageCount = baggageCount;
        this.baggageWeight = baggageWeight;
    }
}
