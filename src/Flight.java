public class Flight {
    private String flightNumber;
    private Airline airline;
    private Airport source;
    private Airport destination;
    private double baseFare;
    private String schedule;
    private int seats;

    public Flight(String flightNumber,
                  Airline airline,
                  Airport source,
                  Airport destination,
                  double baseFare,
                  String schedule,
                  int seats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.baseFare = baseFare;
        this.schedule = schedule;
        this.seats = seats;

        source.addFlights(this);
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFlightNumber() { return this.flightNumber; }
    public Airline getAirline() { return this.airline; }
    public Airport getSource() { return this.source; }
    public Airport getDestination() { return this.destination; }
    public double getBaseFare() { return this.baseFare; }
    public int getSeats(){ return  this.seats; }

    public void information() {
        System.out.println("Flight Number: " + this.flightNumber);
        System.out.println( this.airline.getName());
        System.out.println(this.source.getLocation()+"("+this.source.getCode()
                +") --------> "
                +this.destination.getLocation()+"("+this.destination.getCode()+")");
        System.out.println( this.schedule);
    }
}
