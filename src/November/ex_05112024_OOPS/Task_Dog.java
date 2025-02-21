package November.ex_05112024_OOPS;

public class Task_Dog {
    public static void main(String[] args) {

        //create 5 Objects
        Dog d1 = new Dog();
        d1.name = "Tom";
        d1.breed = "Hybrid";
        d1.color = "Black and white";
        d1.age = 1;
        d1.dogInfo();
        System.out.println("--------------------------");

        Dog d2 = new Dog();
        d2.name = "Tiger";
        d2.breed = "German Shephard";
        d2.color = "Black and Brown";
        d2.age = 4;
        d2.dogInfo();
        System.out.println("--------------------------");

        Dog d3 = new Dog();
        d3.name = "Shiri";
        d2.breed = "Shih Tzu";
        d2.color = "White";
        d2.age = 3;
        d3.dogInfo();
        System.out.println("--------------------------");

        Dog d4 = new Dog();
        d4.name = "Shine";
        d4.breed = "Labrador";
        d4.color = "Light Brown";
        d4.age = 2;
        d4.dogInfo();
        System.out.println("--------------------------");

        Dog d5 = new Dog();
        d5.name = "Joy";
        d5.breed = "Golden Retriever";
        d5.color = "Golden Brown";
        d5.age = 5;
        d5.dogInfo();
        System.out.println("--------------------------");
    }
}
    class Dog{
        String name;
        String breed;
        String color;
        int age;

        void dogInfo(){
            System.out.println("Name : " +name);
            System.out.println("Breed : " +breed);
            System.out.println("Color : " +color);
            System.out.println("Age : " +age);
        }
    }
