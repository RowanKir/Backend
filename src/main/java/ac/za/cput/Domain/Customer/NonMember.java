package ac.za.cput.Domain.Customer;

public class NonMember {

    int idNum;
    String fullName;

    public NonMember(Builder builder) {
        this.idNum = builder.idNum;
        this.fullName = builder.fullName;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getFullName() {
        return fullName;
    }

    public static class Builder
    {
        int idNum;
        String fullName;

        public Builder idNum(int idNum)
        {
            this.idNum = idNum;
            return this;
        }

        public Builder fullName(String fullName)
        {
            this.fullName = fullName;
            return this;
        }

        public NonMember build()
        {
            return new NonMember(this);
        }
    }

    @Override
    public String toString() {
        return "NonMember{" +
                "idNum=" + idNum +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
