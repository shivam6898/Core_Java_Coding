package corejava.OOPS;

class Property {
    protected String type;
    
    public Property(String type) {
        this.type = type;
    }
    
    public void displayInfo() {
        System.out.println("Type: " + type);
    }
}

class House extends Property {
    private int bedrooms;
    private int bathrooms;

    public House(String type, int bedrooms, int bathrooms) {
        super(type);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}

class Apartment extends Property {
    private int numberOfRooms;
    private boolean hasBalcony;

    public Apartment(String type, int numberOfRooms, boolean hasBalcony) {
        super(type);
        this.numberOfRooms = numberOfRooms;
        this.hasBalcony = hasBalcony;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Has Balcony: " + hasBalcony);
    }
}

public class RealEstateProject {
    public static void main(String[] args) {
        Property property1 = new House("House", 3, 2);
        Property property2 = new Apartment("Apartment", 2, true);

        property1.displayInfo();
        System.out.println("=================");
        property2.displayInfo();
    }
}
