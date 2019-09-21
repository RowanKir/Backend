package ac.za.cput.Domain.Movie;

public class Rental {

    int rentalDate, dueDate;

    public Rental(Builder builder) {

        this.rentalDate = builder.rentalDate;
        this.dueDate = builder.dueDate;
    }

    public int getRentalDate() {
        return rentalDate;
    }

    public int getDueDate() {
        return dueDate;
    }

    public static class Builder
    {
        int rentalDate, dueDate;

        public Builder rentalDate(int rentalDate)
        {
            this.rentalDate = rentalDate;
            return this;
        }

        public Builder dueDate(int dueDate)
        {
            this.dueDate = dueDate;
            return this;
        }

        public Rental build()
        {
            return new Rental(this);
        }
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalDate=" + rentalDate +
                ", dueDate=" + dueDate +
                '}';
    }
}
