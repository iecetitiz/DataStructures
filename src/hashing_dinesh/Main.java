package hashing_dinesh;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105, "Tom");
        table.put(21, "Sana");

        System.out.println(table.getSize());
        System.out.println(table.get(21));
        System.out.println(table.get(211));

    }
}
