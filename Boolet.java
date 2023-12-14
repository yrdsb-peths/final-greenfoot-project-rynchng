import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boolet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boolet extends Actor
{
    GreenfootImage boolet = new GreenfootImage("boolet.png");
    private int rotation;
    /**
     * Act - do whatever the Boolet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boolet()
    {
        setImage(boolet);
        boolet.scale(15,5);
    }
    
    public Boolet(int rotation)
    {
        setImage(boolet);
        boolet.scale(15,5);
        this.rotation = rotation;
        setRotation(rotation);
    }
    
    public void act()
    {
        shot();
    }
    
    public void shot()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        move(4);
        if (getX() < 2)
        {
            gameWorld.removeObject(this);
        }
        else if (getX() > 598)
        {
            gameWorld.removeObject(this);
        }
        else if (getY() < 2)
        {
            gameWorld.removeObject(this);
        }
        else if (getY() > gameWorld.getHeight() - 2)
        {
            gameWorld.removeObject(this);
        }
    }
}
