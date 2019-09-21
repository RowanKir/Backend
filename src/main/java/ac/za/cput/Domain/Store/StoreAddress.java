package ac.za.cput.Domain.Store;

public class StoreAddress {

    String cityName, streetName;
    int addressId, streetNum;

    public StoreAddress(StoreAddress storeAddress)
    {
    }

    public StoreAddress(Builder builder) {
        this.cityName = builder.cityName;
        streetName = builder.streetName;
        this.addressId = builder.addressId;
        this.streetNum = builder.streetNum;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getAddressId() {
        return addressId;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public static class Builder
    {
        String cityName, streetName;
        int addressId, streetNum;

        public Builder cityName(String cityName)
        {
            this.cityName = cityName;
            return this;
        }

        public Builder streetName(String streetName)
        {
            this.streetName = streetName;
            return this;
        }

        public Builder addressId(int addressId)
        {
            this.addressId = addressId;
            return this;
        }

        public Builder streetNum(int streetNum)
        {
            this.streetNum = streetNum;
            return this;
        }

        public StoreAddress build()
        {
            return new StoreAddress(this);
        }
    }



    @Override
    public String toString() {
        return "StoreAddress{" +
                "cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", addressId=" + addressId +
                ", streetNum=" + streetNum +
                '}';
    }
}

