package lab_SE309.lab11;

public class Main {
    public static void main(String[] args) throws Exception{
        Healing water = new Healing("water", 1.2, 3);
        Healing chocolate = new Healing("chocolate", 1.3, 5);
        Healing candy = new Healing("candy", 1.4, 6);
        Healing tantuni = new Healing("tantuni", 1.4, 7);
        Healing apple = new Healing("apple", 1.4, 8);

        Weapon wp1 = new Weapon("fuze", 1, 2);
        Weapon wp2 = new Weapon("w2", 5, 3);
        Weapon wp3 = new Weapon("w3", 7, 4);
        Weapon wp4 = new Weapon("w4", 8, 5);
        Weapon wp5 = new Weapon("w5", 10, 6);

        Satchel<Healing> healingSatchel = new Satchel<>();
        Satchel<Weapon> weaponSatchel = new Satchel<>();

        healingSatchel.add(water);
        healingSatchel.add(chocolate);
        healingSatchel.add(candy);



        weaponSatchel.add(wp1);
        weaponSatchel.add(wp2);
        weaponSatchel.add(wp3);







    }
}
