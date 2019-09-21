package ac.za.cput.Domain.Member;

public class Inventory {
    int inventoryId;

    public Inventory(Builder builder) {
        this.inventoryId = builder.inventoryId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public static class Builder
    {
        int inventoryId;

        public Builder inventoryId(int inventoryId)
        {
            this.inventoryId = inventoryId;
            return this;
        }

        public Inventory build()
        {
            return new Inventory(this);

        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                '}';
    }
}
