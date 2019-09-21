package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.FormatType;

public class FormatTypeFactory {

    public static FormatType getFormatType(int formatTypeCode, String formatTypeDescription)
    {
        return new FormatType.Builder()
                .formatTypeCode(formatTypeCode)
                .formatTypeDescrion(formatTypeDescription)
                .build();
    }
}
