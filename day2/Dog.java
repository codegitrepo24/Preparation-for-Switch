package day2;

public class Dog extends Animal{

    public String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public String toSpeak(){
        return getName() + " says: Woof ! Woof!";
    }

    @Override
    public String toString(){
        return "Dog[ name = " + getName() + " ,age = " + getAge() + " ,breed = " + breed + "]";
    }
    
}
