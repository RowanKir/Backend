package ac.za.cput.Factory.Store;

import ac.za.cput.Domain.Store.Admin;

public class AdminFactory {

    public static Admin getAdmin(int adminId,String adminName,String adminLogin)
    {
        return new Admin.Builder()
                .adminId(adminId)
                .adminName(adminName)
                .adminLogin(adminLogin)
                .build();
    }
}
