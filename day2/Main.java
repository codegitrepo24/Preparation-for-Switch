package day2;


public class Main{
    public static void main(String[] args){
        Dog d1 = new Dog("Laden", 3, "PitBull");
        Cat c1 = new Cat("Kiwi", 2, true);
        Bird b1 = new Bird("Laila", 3, true);

        Animal[] animals = new Animal[3];

        animals[0] = d1;
        animals[1] = c1;
        animals[2] = b1;

        for(int i=0;i<animals.length;i++){
            System.out.println(animals[i].toSpeak());
        }

        System.out.println(d1);
        System.out.println(c1);
        System.out.println(b1);

        System.out.println(d1.toSpeak());
        System.out.println(c1.toSpeak());
        System.out.println(b1.toSpeak());

        Animal a1 = new Dog("Moti", 5, "Desi");
        Animal a2 = new Cat("Sayi", 3, false);
        Animal a3 = new Bird("Sparrow", 3, false);

        System.out.println(a1.toSpeak());
        System.out.println(a2.toSpeak());
        System.out.println(a3.toSpeak());
        System.out.println(d1.getBreed());
    }
    
}
