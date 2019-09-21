package ac.za.cput.Domain.Movie;

public class Condition {

    int condtionCode;
    String condtionDescription;

    public Condition(Builder builder) {
        this.condtionCode = builder.condtionCode;
        this.condtionDescription = builder.condtionDescription;
    }

    public int getCondtionCode() {
        return condtionCode;
    }

    public String getCondtionDescription() {
        return condtionDescription;
    }

    public static class Builder
    {
        int condtionCode;
        String condtionDescription;

        public Builder conditionCode(int condtionCode)
        {
            this.condtionCode = condtionCode;
            return this;
        }

        public Builder conditionDescription(String condtionDescription)
        {
            this.condtionDescription = condtionDescription;
            return this;
        }

        public Condition build()
        {
            return new Condition(this);
        }
    }

    @Override
    public String toString() {
        return "Condition{" +
                "condtionCode=" + condtionCode +
                ", condtionDescription='" + condtionDescription + '\'' +
                '}';
    }
}
