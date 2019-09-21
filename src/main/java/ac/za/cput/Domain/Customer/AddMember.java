package ac.za.cput.Domain.Customer;

public class AddMember {

    int addId, addPhone;
    String addName, addSurname, addEmail, addAddress;

    public AddMember(Builder builder) {
        this.addId = builder.addId;
        this.addPhone = builder.addPhone;
        this.addName = builder.addName;
        this.addSurname = builder.addSurname;
        this.addEmail = builder.addEmail;
        this.addAddress = builder.addAddress;
    }

    public int getAddId() {
        return addId;
    }

    public int getAddPhone() {
        return addPhone;
    }

    public String getAddName() {
        return addName;
    }

    public String getAddSurname() {
        return addSurname;
    }

    public String getAddEmail() {
        return addEmail;
    }

    public String getAddAddress() {
        return addAddress;
    }

    public static class Builder
    {
        int addId, addPhone;
        String addName, addSurname, addEmail, addAddress;

        public Builder addId(int addId)
        {
            this.addId = addId;
            return this;
        }

        public Builder addPhone(int addPhone)
        {
            this.addPhone = addPhone;
            return this;
        }

        public Builder addName(String addName)
        {
            this.addName = addName;
            return this;
        }

        public Builder addSurname(String addSurname)
        {
            this.addSurname = addSurname;
            return this;
        }

        public Builder addEmail(String addEmail)
        {
            this.addEmail = addEmail;
            return this;
        }

        public Builder addAddress(String addAddress)
        {
            this.addAddress = addAddress;
            return this;
        }

        public AddMember build()
        {
            return new AddMember(this);
        }
    }

    @Override
    public String toString() {
        return "AddMember{" +
                "addId=" + addId +
                ", addPhone=" + addPhone +
                ", addName='" + addName + '\'' +
                ", addSurname='" + addSurname + '\'' +
                ", addEmail='" + addEmail + '\'' +
                ", addAddress='" + addAddress + '\'' +
                '}';
    }
}
