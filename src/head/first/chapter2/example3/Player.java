package head.first.chapter2.example3;

/**
 * Created by Andrew on 22.03.14.
 */
public class Player
{
    int number = 0;
    public void Guess()
    {
        this.number = (int) (Math.random() * 10);
        System.out.println("Думаю, что это число " + number);
    }
}
