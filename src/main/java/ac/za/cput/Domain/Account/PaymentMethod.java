package ac.za.cput.Domain.Account;

public class PaymentMethod {

    int payCode;
    String payMethod;

    public PaymentMethod(Builder builder) {
        this.payCode = builder.payCode;
        this.payMethod = builder.payMethod;
    }

    public int getPayCode() {
        return payCode;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public static class Builder
    {
        int payCode;
        String payMethod;

        public Builder payCode(int payCode)
        {
            this.payCode = payCode;
            return this;
        }

        public Builder payMethod(String payMethod)
        {
            this.payMethod = payMethod;
            return this;
        }

        public PaymentMethod build()
        {
            return new PaymentMethod(this);
        }
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "payCode=" + payCode +
                ", payMethod='" + payMethod + '\'' +
                '}';
    }
}
