/**
 * Created by Timothy on 5/28/2017.
 */

import java.awt.*;
import java.util.LinkedList;

public class Handler
{
    LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick()
    {
        for(GameObject gameobject : object)
        {
            gameobject.tick();
        }
    }

    public void render(Graphics g)
    {
        for(GameObject gameobject : object)
        {
            gameobject.render(g);
        }
    }

    public void addObject(GameObject newObject)
    {
        this.object.add(newObject);
    }

    public void removeObject(GameObject oldObject)
    {
        this.object.remove(oldObject);
    }

}
