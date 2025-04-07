
import java.util.List;

public class automotive {
	private String make;
    private String model;
    private String exteriorColor;
    private String interiorColor;
    private String location;
    private int year;
    private int mileage;
    private int VIN;

    public automotive() {}

    public automotive(String make, String model, String exteriorColor, String interiorColor, String location, int year, int mileage, int VIN) {
        this.make = make;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.location = location;
        this.year = year;
        this.mileage = mileage;
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }
    
    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public static String[] listVehicleInformation(List<automotive> inventory) {
        String[] infoArray = new String[inventory.size()];
        int index = 0;
        for (automotive automobile : inventory) {
            String info = automobile.getMake() + " " + automobile.getModel() + ", " + automobile.getExteriorColor() + ", " +
                    automobile.getInteriorColor() + ", " + automobile.getLocation() + ", "+ automobile.getYear() + ", " + 
            		automobile.getMileage() + ", " + automobile.getVIN();
            infoArray[index] = info;
            index++;
        }
        return infoArray;
    }

    public static String addVehicle(List<automotive> inventory, automotive automobile) {
        try {
            inventory.add(automobile);
            return "Success: Vehicle added.";
        } catch (Exception e) {
            return "Failure: Vehicle unable to be added.";
        }
    }

    public static String removeVehicle(List<automotive> inventory, int index) {
        try {
            inventory.remove(index);
            return "Success: Vehicle removed.";
        } catch (Exception e) {
            return "Failure: Vehicle unable to be removed.";
        }
    }

    public static String updateVehicle(List<automotive> inventory, int index, String make, String model,
                                        String exteriorColor, String interiorColor, String location, int year, int mileage, int VIN) {
        try {
            automotive automobile = inventory.get(index);
            automobile.setMake(make);
            automobile.setModel(model);
            automobile.setExteriorColor(exteriorColor);
            automobile.setInteriorColor(interiorColor);
            automobile.setLocation(location);
            automobile.setYear(year);
            automobile.setMileage(mileage);
            automobile.setVIN(VIN);
            return "Success: Vehicle updated.";
        } catch (Exception e) {
            return "Failure: Vehicle unable to be updated.";
        }
    }
}


