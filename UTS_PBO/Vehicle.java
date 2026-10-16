public class Vehicle {

    // Atribut
    private int vehicleId;
    private String name;
    private String type;

    // Constructor
    public Vehicle(int vehicleId, String name, String type) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.type = type;
    }

    // Getter dan setter
    public int getVehicleId() {
        return vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{id=" + vehicleId + ", name=" + name + ", type=" + type + "}";
    }
}
