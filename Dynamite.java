import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dynamite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dynamite extends Actor
{
    GreenfootImage[] dyna = new GreenfootImage[5];
    private int x;
    private int y;
    /**
     * Act - do whatever the Dynamite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dynamite(int x, int y)
    {
        this.x = x;
        this.y = y;
        for (int i = 1; i < 11; i++)
        {
            if (i % 2 != 0)
            {
                dyna[i] = new GreenfootImage("dynamite" + i + ".png");
                dyna[i].scale(45,45);
            }
        }
    }
    public void act()
    {
        if (getY() > y)
        {
            setLocation(x, y - 2);
        }
    }
}
