public class Animals {

    public void MakeSound(String sound) {};
}

class Mammal extends Animals
{
    @Override
    public void MakeSound(String sound) {
        System.out.println(sound);
    }
}

class Cat extends Mammal
{
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("Meow");
    }
}

class Dog extends Mammal
{
    @Override
    public void MakeSound(String sound) {
        super.MakeSound("Bark");
    }
}


