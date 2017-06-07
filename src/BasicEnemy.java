/**
 * Created by Timothy on 5/29/2017.
 */

import java.awt.*;
import java.util.Random;

public class BasicEnemy extends GameObject
{
    private Random r;

    public BasicEnemy(int x, int y, ID id)
    {
        super(x,y,id);
        r = new Random();
        velX = r.nextInt(10)-5;
        velY = r.nextInt(10)-5;
    }

    @Override
    public void tick()
    {
        x += velX;
        y += velY;
        if(x < 0 || x > Game.WIDTH - 21)
        {
            velX *= -1;
        }
        if(y < 0 || y > Game.HEIGHT - 41)
        {
            velY *= -1;
        }
        x = Game.clamp(x,0,Game.WIDTH  - 20);
        y = Game.clamp(y,0,Game.HEIGHT - 42);
    }

    @Override
    public void render(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(x,y,16,16);
    }

    @Override
    public Rectangle getBounds()
    {
        return new Rectangle(x,y,16,16);
    }
}
