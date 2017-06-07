/**
 * Created by Timothy on 5/29/2017.
 */

import java.util.Random;

public class Spawn
{
    private Handler handler;
    private HUD hud;
    private Random r;

    private int scoreKeep = 0;

    public Spawn(Handler handler, HUD hud)
    {
        this.handler = handler;
        this.hud = hud;
        this.r = new Random();
    }

    public void tick()
    {
        scoreKeep++;

        if(scoreKeep >= 100)
        {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel()+1);
            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.WIDTH), ID.enemy));
        }
    }
}
