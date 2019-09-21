package ac.za.cput.Domain.Member;

public class Report {

    int reportId;
    String reportDescription;

    public Report(Builder builder) {
        this.reportId = builder.reportId;
        this.reportDescription = builder.reportDescription;
    }

    public int getReportId() {
        return reportId;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public static class Builder
    {
        int reportId;
        String reportDescription;

        public Builder reportId(int reportId)
        {
            this.reportId = reportId;
            return this;
        }
        public Builder reportDescription(String reportDescription)
        {
            this.reportDescription = reportDescription;
            return this;
        }

        public Report build()
        {
            return new Report(this);
        }

    }

    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", reportDescription='" + reportDescription + '\'' +
                '}';
    }
}
