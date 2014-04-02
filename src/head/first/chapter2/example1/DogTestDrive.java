package head.first.chapter2.example1;

/**
 * Created by Andrew on 22.03.14.
 */
public class DogTestDrive
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        System.out.println(d.size);
    }
}
