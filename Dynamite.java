import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dynamite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dynamite extends SmoothMover
{
    GreenfootImage[] dyna = new GreenfootImage[5];
    private int x;
    private int y;
    SimpleTimer bombTimer = new SimpleTimer();
    /**
     * Act - do whatever the Dynamite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dynamite()
    {
        
    }
    
    public Dynamite(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        setLocation(x,y - 50);
        for (int i = 1; i <= dyna.length; i++)
        {
            dyna[i] = new GreenfootImage("dynamite" + i + ".png");
            dyna[i].scale(45,45);
        }
        bombTimer.mark();
        setImage(dyna[0]);
    }
    public void act()
    {
        animateBomb();
    }
    
    int imageIndex = 0;
    public void animateBomb()
    {
        if (bombTimer.millisElapsed() > 400)
        {
            return;
        }
        bombTimer.mark();
        setImage(dyna[imageIndex]);
        imageIndex +=1;
        setLocation(x, y + 0.4); 
    }
}
