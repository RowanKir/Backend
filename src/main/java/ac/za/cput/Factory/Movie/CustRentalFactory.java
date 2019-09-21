package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.CustRental;

public class CustRentalFactory {

    public static CustRental buildCustRental(int itemRentalId, String customerId, int movieId, int rentalStatusCode)
    {
        return new CustRental.Builder()
                .itemRentalId(itemRentalId)
                .customerId(customerId)
                .movieId(movieId)
                .rentalStatusCode(rentalStatusCode)
                .build();
    }



}
