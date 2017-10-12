package app;

public class Animals {

    int legs;
    int tail;
    int speed;

    public void MakeSound(String sound) {}
}

class Mammal extends Animals
{
    @Override
    public void MakeSound(String sound) {//add comment to method
        System.out.println(sound);
    }
}

class Cat extends Mammal
{
    boolean tail = true;
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("");
    }
//line1
}

class Dog extends Mammal
{
    boolean tail = true;
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("Bark");
        //here we can make another sound like "Woooo";
    }
}

class Whale extends Mammal
{
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("Awww");
        //check what sounds whale can make
    }
}

class Mouse extends Mammal
{
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("peep");

    }
}

class Dolphin extends Mammal{
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("Quick-quick");
    }
}


