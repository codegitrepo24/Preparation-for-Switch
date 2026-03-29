package day2;

public class Bird extends Animal {

    private boolean canFly;

    public Bird(String name, int age, boolean canFly){
        super(name,age);
        this.canFly = canFly;
    }

    public boolean canFly(){
        return canFly;
    }

    @Override
    public String toSpeak(){
        return getName() + " says: Tweet Tweet!!";
    }

    @Override
    public String toString(){
        return "Bird[name= " + getName() + " ,age = " + getAge() + " , CanFly = " + canFly + "]";
    }
    
}
