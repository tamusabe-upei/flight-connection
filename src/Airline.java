public class Airline {
    private String code;
    private String name;

    public Airline(String code, String name) {
        this.code = code.toUpperCase();
        this.name = name;
    }

    public String getCode() { return this.code; }
    public String getName() { return this.name; }
}
