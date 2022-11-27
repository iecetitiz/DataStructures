package hashing;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(105 ,"Tom");
        table.put(21, "Sana");
        table.put(21, "Harry");

        System.out.println(table.getSize());
    }
}
