public class Main {
    Airport yvr = new Airport("YVR", "Vancouver", "BC","Vancouver International");
    Airport yhz = new Airport("YHZ", "Halifax", "NS","Halifax Stanfield");
    Airport yyc = new Airport("YYC", "Calgary", "AB","Calgary Intl");
    Airport yeg = new Airport("YEG", "Edmonton", "AB","Edmonton Intl");
    Airport yyz = new Airport("YYZ", "Toronto", "ON","Pearson Intl");
    Airport ywg = new Airport("YWG", "Winnipeg", "MB","Winnipeg Richardson Intl");

    Airline aircanada = new Airline("AC", "Air Canada");
    Airline westjet = new Airline("WS", "WestJet");
    Airline porter = new Airline("PD", "Porter");
    Airline flair = new Airline("F8", "Flair");

    // Create Flights
    Flight f1 = new Flight("AC101", aircanada, yvr, yyz, 299.99, "Tue, 14:00", 12);
    Flight f2 = new Flight("AC102", aircanada, yyz, yvr, 289.50, "Wed, 10:30", 12);
    Flight f3 = new Flight("WS200", westjet, yvr, yyc, 199.99, "Mon, 09:45", 5);
    Flight f4 = new Flight("WS201", westjet, yyc, yvr, 189.99, "Thu, 16:20", 5);
    Flight f5 = new Flight("AC150", aircanada, yhz, yvr, 399.00, "Fri, 12:00", 5);
    Flight f6 = new Flight("WS250", westjet, yvr, yhz, 409.00, "Sat, 18:30", 5);
    Flight f7 = new Flight("AC103", aircanada, yvr, yyc, 279.99, "Mon, 07:30", 5);
    Flight f8 = new Flight("AC104", aircanada, yyc, yvr, 269.50, "Tue, 15:00", 5);
    Flight f9 = new Flight("WS251", westjet, yhz, yyc, 359.00, "Wed, 11:20", 5);
    Flight f10 = new Flight("WS252", westjet, yyc, yhz, 349.50, "Thu, 13:45", 5);
    Flight f11 = new Flight("PD300", porter, yyz, ywg, 179.99, "Fri, 09:00", 4);
    Flight f12 = new Flight("PD301", porter, ywg, yyz, 174.50, "Sat, 14:15", 4);
    Flight f13 = new Flight("F800", flair, yeg, yvr, 219.99, "Mon, 12:40", 8);
    Flight f14 = new Flight("F801", flair, yvr, yeg, 229.50, "Tue, 17:10", 8);
    Flight f15 = new Flight("AC105", aircanada, ywg, yhz, 399.99, "Wed, 08:00", 5);
    Flight f16 = new Flight("WS253", westjet, yhz, ywg, 389.50, "Thu, 18:30", 5);
}
