package ac.za.cput.Factory.Customer;

import ac.za.cput.Domain.Customer.NonMember;

public class NonMemberFactory {

    public static NonMember getNonMember(int idNum, String fullName)
    {
        return new NonMember.Builder()
                .idNum(idNum)
                .fullName(fullName)
                .build();

    }
}
