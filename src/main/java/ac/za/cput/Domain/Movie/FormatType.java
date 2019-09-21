package ac.za.cput.Domain.Movie;

public class FormatType {

    int formatTypeCode;
    String formatTypeDescription;

    public FormatType(Builder builder) {
        this.formatTypeCode = builder.formatTypeCode;
        this.formatTypeDescription = builder.formatTypeDescription;
    }

    public int getFormatTypeCode() {
        return formatTypeCode;
    }

    public String getFormatTypeDescription() {
        return formatTypeDescription;
    }

    public static class Builder
    {
        int formatTypeCode;
        String formatTypeDescription;

        public Builder formatTypeCode(int formatTypeCode)
        {
            this.formatTypeCode = formatTypeCode;
            return this;
        }

        public Builder formatTypeDescrion(String formatTypeDescription)
        {
            this.formatTypeDescription = formatTypeDescription;
            return this;
        }

        public FormatType build()
        {
            return new FormatType(this);
        }
    }

    @Override
    public String toString() {
        return "FormatType{" +
                "formatTypeCode=" + formatTypeCode +
                ", formatTypeDescription='" + formatTypeDescription + '\'' +
                '}';
    }
}
