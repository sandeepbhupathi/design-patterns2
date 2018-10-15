package factoryMethod;

public abstract class Employee {
    private HotelReservation _hotel;
    private CarReservation _car;
    private FlightReservation _flight;

    public void getReadyForTravel() {
        _hotel = getHotel();
        _car= getCar();
        _flight = getFlight();
    }

    public abstract FlightReservation getFlight();

    public abstract CarReservation getCar();

    public abstract HotelReservation getHotel();

    @Override
    public String toString() {
        return String.format("%s %s %s %s",getClass(),_hotel,_car,_flight);
    }
}
