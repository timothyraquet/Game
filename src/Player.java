/**
 * Created by Timothy on 5/29/2017.
 */

import java.awt.*;
import java.util.Random;

public class Player extends GameObject
{
    private Random r;
    private Handler handler;
    private static final int playerSide = 32;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        r = new Random();
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.REAL_WIDTH - playerSide - 1);
        y = Game.clamp(y, 0, Game.REAL_HEIGHT - playerSide - 1);

        collision();
    }

    public void collision()
    {
        for(GameObject tempObject : handler.object)
        {
            if(tempObject.getId() == ID.enemy)
            {
                if(getBounds().intersects(tempObject.getBounds()))
                {
                    HUD.HEALTH -= 2;
                }
            }
        }
    }


    @Override
    public void render(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.drawRect(x,y,32,32);
    }

    @Override
    public Rectangle getBounds()
    {
        return new Rectangle(x,y,32,32);
    }
}
