package lab_SE309.lab12;

public class Furniture extends HouseholdItems{
    private String material;

    Furniture(String name, double price, String material) {
        super(name, price);
        setMaterial(material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
