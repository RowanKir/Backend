package ac.za.cput.Domain.Movie;

public class Status {

    String rentalCodeStatus, rentalStatusDescription;

    public Status(Builder builder) {
        this.rentalCodeStatus = builder.rentalCodeStatus;
        this.rentalStatusDescription = builder.rentalStatusDescription;
    }

    public String getRentalCodeStatus() {
        return rentalCodeStatus;
    }

    public String getRentalStatusDescription() {
        return rentalStatusDescription;
    }

    public static class Builder
    {
        String rentalCodeStatus, rentalStatusDescription;

        public Builder rentalCodeStatus(String rentalCodeStatus)
        {
            this.rentalCodeStatus = rentalCodeStatus;
            return this;
        }

        public Builder rentalStatusDescription(String rentalStatusDescription)
        {
            this.rentalStatusDescription = rentalStatusDescription;
            return this;
        }

        public Status build()
        {
            return new Status(this);
        }
    }

    @Override
    public String toString() {
        return "Status{" +
                "rentalCodeStatus='" + rentalCodeStatus + '\'' +
                ", rentalStatusDescription='" + rentalStatusDescription + '\'' +
                '}';
    }
}
