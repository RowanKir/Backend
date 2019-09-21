package ac.za.cput.Domain.Store;

public class Admin {

    int adminId;
    String adminName, adminLogin;

    public Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.adminName = builder.adminName;
        this.adminLogin = builder.adminLogin;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminLogin() {
        return adminLogin;
    }

    public static class Builder
    {
        int adminId;
        String adminName, adminLogin;

        public Builder adminId(int adminId)
        {
            this.adminId = adminId;
            return this;
        }

        public Builder adminName(String adminName)
        {
            this.adminName = adminName;
            return this;
        }

        public Builder adminLogin(String adminLogin)
        {
            this.adminLogin = adminLogin;
            return this;
        }

        public Admin build()
        {
            return new Admin(this);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminLogin='" + adminLogin + '\'' +
                '}';
    }
}
