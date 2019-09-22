package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Report;

public class ReportFactory {

    public static Report getReport(String reportId, String reportDescription)
    {
        return new Report(reportId, reportDescription);
    }
}
