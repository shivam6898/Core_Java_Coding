package corejava.OOPS;

interface PropertyI {
    void displayInfo();
}

class HouseI implements PropertyI {
    private String type;
    private int bedrooms;
    private int bathrooms;

    public HouseI(String type, int bedrooms, int bathrooms) {
        this.type = type;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}

class ApartmentI implements PropertyI {
    private String type;
    private int numberOfRooms;
    private boolean hasBalcony;

    public ApartmentI(String type, int numberOfRooms, boolean hasBalcony) {
        this.type = type;
        this.numberOfRooms = numberOfRooms;
        this.hasBalcony = hasBalcony;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Has Balcony: " + hasBalcony);
    }
}

public class RealEstateProject2 {
    public static void main(String[] args) {
        PropertyI property1 = new HouseI("House", 3, 2);
        PropertyI property2 = new ApartmentI("Apartment", 2, true);

        property1.displayInfo();
        System.out.println("=================");
        property2.displayInfo();
    }
}
