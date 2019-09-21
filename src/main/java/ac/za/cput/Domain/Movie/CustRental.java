package ac.za.cput.Domain.Movie;

import ac.za.cput.Domain.Account.Account;

public class CustRental {

    int itemRentalId,  movieId, rentalStatusCode;
    String customerId;

    public CustRental(Builder builder) {
        this.itemRentalId = builder.itemRentalId;
        this.customerId = builder.customerId;
        this.movieId = builder.movieId;
        this.rentalStatusCode = builder.rentalStatusCode;
    }

    public int getItemRentalId() {
        return itemRentalId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getRentalStatusCode() {
        return rentalStatusCode;
    }

    public static class Builder
    {
        int itemRentalId;
        String customerId;
        int movieId;
        int rentalStatusCode;

        public Builder itemRentalId (int itemRentalId)
        {
            this.itemRentalId = itemRentalId;
            return this;
        }

        public Builder customerId (String customerId)
        {
            this.customerId = customerId;
            return this;
        }

        public Builder movieId (int movieId)
        {
            this.movieId = movieId;
            return this;
        }

        public Builder rentalStatusCode (int rentalStatusCode)
        {
            this.rentalStatusCode = rentalStatusCode;
            return this;
        }

        public Builder copy(CustRental custRental){
            this.customerId = custRental.customerId;
            this.movieId = custRental.movieId;

            return this;
        }

        public CustRental build()
        {
            return new CustRental(this);
        }


    }
}
