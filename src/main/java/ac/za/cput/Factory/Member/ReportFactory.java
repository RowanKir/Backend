package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Report;

public class ReportFactory {

    public static Report getReport(int reportId, String reportDescription)
    {
        return new Report.Builder()
                .reportId(reportId)
                .reportDescription(reportDescription)
                .build();
    }
}
