package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Member;


public class MemberFactory {
    public static Member getMember(String firstName, String lastName, String id, int age)
    {
        return new Member.Builder()
                .firstName(firstName)
                .lastName(lastName)
                .id(id)
                .age(age)
                .build();
    }
}
