public class Airport {
    private String code;
    private String city;
    private String province;
    private String name;
    private Flight[] flights;

    public Airport(String code, String city, String province, String name) {
        this.code = code.toUpperCase();
        this.city = city;
        this.province = province;
        this.name = name;
        this.flights = new Flight[5];
    }

    public String getCode() { return this.code; }
    public String getLocation() { return this.province +","+ this.city; }
    public String getName() { return this.name; }

    public void addFlights(Flight flight) {
        for (int i = 0; i < this.flights.length; i++) {
            if(this.flights[i] == null) {
                this.flights[i] = flight;
                return;
            }
        }

        Flight[] newFlights = new Flight[this.flights.length * 2];

        int i;
        for (i = 0; i < this.flights.length; i++) {
            newFlights[i] = this.flights[i];
        }

        newFlights[i++] = flight;
        this.flights = newFlights;
    }

    public Flight[] getFlights() { return this.flights; }
}
