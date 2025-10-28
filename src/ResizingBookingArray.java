public class ResizingBookingArray {
    private Booking[] bookings;
    private int numBookings = 0; //keeps track of the actual number of bookings in the array, not just its length


    public ResizingBookingArray(){
        bookings = new Booking[4];
    }

    //queston: what happens if we only implement this constructor?

    /**
     * @param b must not have any null entries (can we ensure this in code?)
     * */
    public ResizingBookingArray(Booking[] b){
        //why not just: bookings = b; ??
        bookings = new Booking[b.length];
        for (int i = 0; i < b.length; i++) {
            bookings[i] = b[i];
        }
        numBookings = b.length;
    }


    /**
     * Adds the booking to bookings if there is space
     * Otherwise, doubles the size of bookings and then adds the it to the new array.
     *
     * @param b the booking to be added
     * */
    public void add(Booking b){
        if(numBookings < bookings.length){
            bookings[numBookings++] = b;
        }
        else{
            Booking temp[] = new Booking[2 * bookings.length];

            for (int i = 0; i < bookings.length; i++) {
                temp[i] = bookings[i];
            }
            temp[numBookings++] = b;
            bookings = temp;
        }
    }


    /**
     * Searches the bookings array for the booking target.
     *
     * @param target the booking to be found
     * @return true if found, false otherwise
     * */
    public boolean contains(Booking target){
        for(int i = 0; i <  numBookings; i++){
            Booking booking = bookings[i];
            if(booking.equals(target)) {
                return true;
            }
        }

        return false;
    }


    /**
     * @return a new array containing the entries of bookings from 0 to numBookings-1
     * */
    public Booking[] getBookings(){
        Booking[] tightBooking = new Booking[numBookings];
        for (int i = 0; i < numBookings; i++) {
            tightBooking[i] = bookings[i];
        }
        return tightBooking;
    }

}

