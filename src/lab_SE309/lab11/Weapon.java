package lab_SE309.lab11;

public class Weapon {
    private String name;
    private int dmg;
    private int price;

    public Weapon(String name, int dmg, int price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
