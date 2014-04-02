package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable
{
    private static int hitCount;
    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            int tmp = (int) (Math.random() + 1);
            if (tmp == 1)
            {
                attackedBodyPart = BodyPart.ARM;
            } else
            {
                attackedBodyPart = BodyPart.BODY;
            }
        } else if (hitCount == 2)
        {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }

        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1)
        {
            int tmp = (int) (Math.random() + 1);
            if (tmp == 1)
            {
                defencedBodyPart = BodyPart.ARM;
            } else
            {
                defencedBodyPart = BodyPart.BODY;
            }
        } else if (hitCount == 2)
        {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        }
        return defencedBodyPart;
    }
}
