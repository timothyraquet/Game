/**
 * Created by Timothy on 5/29/2017.
 */

import java.awt.*;

public class HUD
{

    public static int HEALTH = 100;

    private int score = 0;
    private int level = 1;

    public void tick()
    {
        HEALTH = Game.clamp(HEALTH, 0, 100);
        score++;

    }

    public void render(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(15,15,HEALTH * 2, 32);
        g.setColor(Color.white);
        g.drawRect(15,15,200,32);

        g.drawString("Score: " + score, 15, 65);
        g.drawString("Level: " + level, 15, 80);

        if(HEALTH == 0)
            g.drawString("Game Over", Game.WIDTH / 2, Game.HEIGHT / 2);
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}
