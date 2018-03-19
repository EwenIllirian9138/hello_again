package packageEwen;

public class Dog extends Animal {

    public String race;
    private String setAge;

    public String sayHello() {
        return "ouaf ouaf, my name is " + race + " an my name is " + Nom ;
    }

    public Dog(String age)
    {
        setAge = age;
    }

    @Override
    public String GetAge() {
        return setAge;
    }
}
