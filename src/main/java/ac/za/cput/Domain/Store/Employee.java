package ac.za.cput.Domain.Store;

import ac.za.cput.Domain.Account.Account;

public class Employee {

    String empName, empId, empTitle, empAdress;

    public Employee(Builder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empTitle = builder.empTitle;
        this.empAdress = builder.empAdress;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpTitle() {
        return empTitle;
    }

    public String getEmpAdress() {
        return empAdress;
    }

    public static class Builder
    {
        String empId;
        String empName, empTitle, empAdress;

        public Builder empId(String empId)
        {
            this.empId = empId;
            return this;
        }

        public Builder empName(String empName)
        {
            this.empName = empName;
            return this;
        }

        public Builder empTitle(String empTitle)
        {
            this.empTitle = empTitle;
            return this;
        }

        public Builder empAdress(String empAdress)
        {
            this.empAdress = empAdress;
            return this;
        }

        public Builder copy(Employee employee){
            this.empId = employee.empId;
            this.empName = employee.empName;

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empTitle='" + empTitle + '\'' +
                ", empAdress='" + empAdress + '\'' +
                '}';
    }
}
