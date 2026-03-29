package day2;

public class Cat extends Animal{
   private boolean isIndoor;

   public Cat(String name, int age, boolean isIndoor){
      super(name,age);
      this.isIndoor = isIndoor;
   }

   public boolean isIndoor(){
      return isIndoor;
   }

   @Override
   public String toSpeak(){
      return getName() + " says: Meow...";
   }

   @Override
   public String toString(){
      return "Cat[ name = " + getName() + " ,age = " + getAge() + " ,indoor = " + isIndoor + " ]";
   }
}
