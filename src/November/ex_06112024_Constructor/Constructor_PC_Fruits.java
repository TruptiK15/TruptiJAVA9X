package November.ex_06112024_Constructor;

import java.util.Scanner;

public class Constructor_PC_Fruits {
    public static void main(String[] args) {

        Fruits f1 = new Fruits("Orange",5);
        System.out.println(f1.name);
        System.out.println(f1.quantity);
        f1.display();

        Fruits f2 = new Fruits("Pineapple",1);
        f2.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name : ");
        String fruit_name_input = sc.next();
        System.out.println("Enter quantity : ");
        int fruit_quantity_input = sc.nextInt();

        Fruits f3 = new Fruits(fruit_name_input,fruit_quantity_input);
        System.out.println(f3.name);
        System.out.println(f3.quantity);
        f3.display();
        sc.close();
    }
}
class Fruits {
    String name;
    int quantity;

    Fruits(String fruit_name, int fruit_quanity) {   //Parameterized constructor
        System.out.println("-----PC-----");
        this.name = fruit_name;
        this.quantity = fruit_quanity;
    }
    void display(){
        System.out.println("Fruit name : " + name + " , " + "Quantity : " + quantity);
    }
}
