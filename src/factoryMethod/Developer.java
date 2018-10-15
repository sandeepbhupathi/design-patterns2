package factoryMethod;

public class Developer extends Employee {

    @Override
    public FlightReservation getFlight() {
        return new EconomyFlightReservation();
    }

    @Override
    public CarReservation getCar() {
        return new EconomyCarReservation();
    }

    @Override
    public HotelReservation getHotel() {
        return new ThreeStarReservation();
    }
}
