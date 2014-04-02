package head.first.chapter5;

import java.util.ArrayList;

/**
 * Created by Andrew on 23.03.2014.
 */
public class DotComBust
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame()
    {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();

        one.setName("pets.com");
        two.setName("etoys.com");
        three.setName("go2.com");

        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("pets.com, etoys.com, go2.com");
        System.out.println("блаблабла");

        for (DotCom dotComToSet : dotComsList)
        {
            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCels(newLocation);
        }

    }

    private void startPlaying()
    {
        while (!dotComsList.isEmpty())
        {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess)
    {
        numOfGuess++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList)
        {
            result = dotComToTest.chekYourSelf(userGuess);
            if (result.equals("Попал"))
            {
                break;
            }
            if (result.equals("Потопил"))
            {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame()
    {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuess <= 18)
        {
            System.out.println("Это заняло у вас всего" + numOfGuess + "попыток");
            System.out.println("Вы успели выбраться до того, как ваши вложения утонули");
        } else
        {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuess + "попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args)
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
