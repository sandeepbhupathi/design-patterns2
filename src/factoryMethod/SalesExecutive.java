package factoryMethod;

public class SalesExecutive extends Employee{

    @Override
    public FlightReservation getFlight() {
        return new FirstClassFlightReservation();
    }

    @Override
    public CarReservation getCar() {
        return new LuxuryCarReservation();
    }

    @Override
    public HotelReservation getHotel() {
        return new FiveStarReservation();
    }
}
