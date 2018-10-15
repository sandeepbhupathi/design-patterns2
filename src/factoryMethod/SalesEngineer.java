package factoryMethod;

public class SalesEngineer extends Employee{
    @Override
    public FlightReservation getFlight() {
        return new EconomyFlightReservation();
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
