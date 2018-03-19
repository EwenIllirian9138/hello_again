package packageEwen;

public class Human extends Animal {
    public boolean Bipede;

    private String setAge;

    public Human(String age)
    {
        setAge = age;
    }

    public String sayHello() {
        return "Bonjour my name is " + Nom;
    }

    @Override
    public String GetAge() {
        return setAge;
    }
}
