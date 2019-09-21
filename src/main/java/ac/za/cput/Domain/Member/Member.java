package ac.za.cput.Domain.Member;

public class Member {

    private String firstName, lastName, id;
    private int age;

    private Member()
    {

    }

    private Member(Builder builder)
    {
     this.firstName = builder.firstName;
     this.lastName = builder.lastName;
     this.age = builder.age;
     this.id = builder.id;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public String getId()
    {
        return id;
    }

    public static class Builder
    {
        private String firstName, lastName, id;
        private int age;

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }
        public Builder id(String id)
        {
            this.id = id;
            return this;
        }
        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

        public Member build()
        {
            return new Member(this);
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
