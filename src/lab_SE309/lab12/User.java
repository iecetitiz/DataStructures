package lab_SE309.lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String cardNumber;
    private String address;
    private ArrayList<HouseholdItems> shoppingCart = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void connect(Market market) {
        System.out.println("do you want to search or list? press '1' for list, '2' for search");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            System.out.println("for furniture press 'm', for appliance press 'e' :");
            String answer = scanner.nextLine();
            market.list(answer.charAt(0));
        } else if (choice == 2) {
            System.out.println("please write the item that you search: ");
            String itemname = scanner.nextLine();
            System.out.println("for furniture press 'm', for appliance press 'e' :");
            String type = scanner.nextLine();
            market.search(itemname, type.charAt(0));
        }


        while(true) {
            System.out.println("which item do you want to add to shopping cart? please press the items number and press '999'" +
                    "to finish the shopping");
            int itemNumber = scanner.nextInt();
            if(itemNumber == 999) {
                break;
            } else {
                addItemToShoppingCart(market.getCatalog().get(itemNumber));

            }
        }

    }

    public double calculate() {
        double price = 0;
        for (HouseholdItems i : shoppingCart) {
            price += i.getPrice();
        }
        return price;
    }

    public void addItemToShoppingCart(HouseholdItems item) {
        shoppingCart.add(item);
    }

    public void removeFromTheShoppingCart(HouseholdItems item) {
        shoppingCart.remove(item);
    }

}
