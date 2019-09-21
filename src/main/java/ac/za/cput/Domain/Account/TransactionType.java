package ac.za.cput.Domain.Account;

public class TransactionType {

    int transCode;
    String transDescr;

    public TransactionType(Builder builder) {
        this.transCode = builder.transCode;
        this.transDescr = builder.transDescr;
    }

    public int getTransCode() {
        return transCode;
    }

    public String getTransDescr() {
        return transDescr;
    }

    public static class Builder
    {
        int transCode;
        String transDescr;

        public Builder transCode(int transCode)
        {
            this.transCode = transCode;
            return this;
        }

        public Builder transDescr(String transDescr)
        {
            this.transDescr = transDescr;
            return this;
        }

        public TransactionType build()
        {return new TransactionType(this);

        }
    }

    @Override
    public String toString() {
        return "TransactionType{" +
                "transCode=" + transCode +
                ", transDescr='" + transDescr + '\'' +
                '}';
    }
}
