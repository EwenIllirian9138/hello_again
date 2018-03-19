package packageEwen;

public class MainClass {

    public static void main(String[] args){

        Animal animal = new Animal() {
            public String sayHello() {
                return "hello";
            }
        };

        Human human = new Human() {
            public String sayHello() {
                return null;
            }
        };

        Dog dog = new Dog() {
            public String sayHello() {
                return null;
            }
        };
    }
}
