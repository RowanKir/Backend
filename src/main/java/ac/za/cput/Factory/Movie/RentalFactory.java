package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Rental;

public class RentalFactory {

    public static Rental getRental(int rentalDate,int dueDate)
    {
        return new Rental.Builder()
                .rentalDate(rentalDate)
                .dueDate(dueDate)
                .build();
    }
}
