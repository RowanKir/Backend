package ac.za.cput.Factory.Member;

import ac.za.cput.Domain.Member.Inventory;

public class InventoryFactory {

    public static Inventory getInventory(int inventoryId)
    {
        return new Inventory.Builder()
                .inventoryId(inventoryId)
                .build();
    }
}
