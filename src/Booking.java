public class Booking {
    private Flight flight;
    private String passengerName;
    private double price;
    private String date;

    public Booking(Flight flight, String date, String passengerName, double price) {
        this.flight = flight;
        this.passengerName = passengerName;
        this.price = price;
        this.date = date;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDate() {
        return this.date;
    }

    public String toString() {
         return  "Passenger: " + this.passengerName +
                "\nDate: " + this.date +
                "\nFlight: " + this.flight.getFlightNumber() + " (" + this.flight.getAirline().getName() + ")" +
                "\nRoute: " + this.flight.getSource().getCode() + " → " + this.flight.getDestination().getCode() +
                "\nTotal Price: $" + this.price;
    }
}
