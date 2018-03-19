package packageEwen;

public class MainClass {

    public static void main(String[] args){

        Dog dog = new Dog("8");
        Human human = new Human("25");

        dog.race = "bull";
        dog.Nom = "yuki";
        System.out.println(human.GetAge());
        System.out.println(dog.GetAge());
        System.out.println(dog.sayHello());

        human.Nom = "toto";
        human.Bipede = true;
        human.GetAge();
        System.out.println(human.sayHello());


    }
}
