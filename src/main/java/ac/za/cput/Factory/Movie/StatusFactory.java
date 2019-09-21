package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Status;

public class StatusFactory {

    public static Status getRentalCodeStatus(String rentalCodeStatus, String rentalStatusDescription)
    {
        return new Status.Builder()
            .rentalCodeStatus(rentalCodeStatus)
            .rentalStatusDescription(rentalStatusDescription)
            .build();
    }
}
