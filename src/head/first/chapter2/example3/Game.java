package head.first.chapter2.example3;

/**
 * Created by Andrew on 22.03.14.
 */
public class Game
{
    Player p1, p2, p3;

    public void startGame()
    {
        int count = 1;

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int p1Guess = 0;
        int p2Guess = 0;
        int p3Guess = 0;

        boolean p1GuessRight = false;
        boolean p2GuessRight = false;
        boolean p3GuessRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 1 до 9");

        while (true)
        {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.Guess();
            p2.Guess();
            p3.Guess();

            p1Guess = p1.number;
            p2Guess = p2.number;
            p3Guess = p3.number;

            if (p1Guess == targetNumber)
                p1GuessRight = true;
            if (p2Guess == targetNumber)
                p2GuessRight = true;
            if (p3Guess == targetNumber)
                p3GuessRight = true;

            if (p1GuessRight || p2GuessRight || p3GuessRight)
            {
                System.out.println("У нас есть победитель");
                System.out.println("Первый игрок угадал? " + p1GuessRight);
                System.out.println("Второй игрок угадал? " + p2GuessRight);
                System.out.println("Третий игрок угадал? " + p3GuessRight);
                System.out.println("Конец игры");
                break;
            }
            else
            {
                System.out.println("Попытка №: " + count++);
            }
        }
    }
}
