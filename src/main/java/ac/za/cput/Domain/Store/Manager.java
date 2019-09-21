package ac.za.cput.Domain.Store;

public class Manager {

    int managerId;
    String managerName;

    public Manager(Builder builder) {
        this.managerId = builder.managerId;
        this.managerName = builder.managerName;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public static class Builder
    {
        int managerId;
        String managerName;

        public Builder managerId(int managerId)
        {
            this.managerId = managerId;
            return this;
        }

        public Builder managerName(String managerName)
        {
            this.managerName = managerName;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
