package ac.za.cput.Domain.Customer;

public class Customer {

    String custName, custPhone, custId, custSurname;


    public Customer(Builder builder) {
        this.custId = builder.custId;
        this.custPhone = builder.custPhone;
        this.custName = builder.custName;
        this.custSurname = builder.custSurname;

    }

    public String getCustId() {
        return custId;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustSurname() {
        return custSurname;
    }

    public static class Builder
    {
        String custName, custPhone, custId, custSurname;

        public Builder custId(String custId)
        {
            this.custId = custId;
            return this;
        }

        public Builder custPhone(String custPhone)
        {
            this.custPhone = custPhone;
            return this;
        }

        public Builder custName(String custName)
        {
            this.custName = custName;
            return this;
        }

        public Builder custSurname(String custSurname)
        {
            this.custSurname = custSurname;
            return this;
        }



        public Builder copy(Customer customer){
            this.custId = customer.custId;
            this.custName = customer.custName;

            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }


    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custPhone=" + custPhone +
                ", custName='" + custName + '\'' +
                ", custSurname='" + custSurname + '\'' +
                '}';
    }
}
