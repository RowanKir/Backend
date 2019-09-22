package ac.za.cput.Domain.Member;

public class Report {

    String reportId;
    String reportDescription;
    Object report;


    public Report(String reportId, String reportDescription) {
        this.reportId = reportId;
        this.reportDescription = reportDescription;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public Object getReport() {
        return report;
    }

    public void setReport(Object report) {
        this.report = report;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }



    @Override
    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", reportDescription='" + reportDescription + '\'' +
                '}';
    }
}
