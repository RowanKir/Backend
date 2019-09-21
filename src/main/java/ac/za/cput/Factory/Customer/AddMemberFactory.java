package ac.za.cput.Factory.Customer;

import ac.za.cput.Domain.Customer.AddMember;

public class AddMemberFactory {

    public static AddMember getAddMember(int addId,int addPhone, String addName,String addSurname,String addEmail,String addAddress)
    {
        return new AddMember.Builder()
                .addId(addId)
                .addPhone(addPhone)
                .addName(addName)
                .addSurname(addSurname)
                .addAddress(addAddress)
                .addEmail(addEmail)
                .build();
    }
}
