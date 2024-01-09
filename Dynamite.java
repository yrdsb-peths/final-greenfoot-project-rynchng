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
    int frame;
    GreenfootImage explosionArea = new GreenfootImage(100,100);
    /**
     * Act - do whatever the Dynamite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Dynamite(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        setLocation(x,y);
        for (int i = 0; i < dyna.length; i++)
        {
            dyna[i] = new GreenfootImage("dynamite" + i + ".png");
            dyna[i].scale(180,180);
        }
        setImage(dyna[frame]);
    }
    
    public void act()
    {
        animateBomb();
    }
    int time = 0;
    public void animateBomb()
    {
        MyWorld world = (MyWorld) getWorld(); 
        time++;
        int delay = 30;
        
        if (time % delay == 0)
        {
            frame = (frame + 1) % dyna.length;
            setLocation(x, getY() + 35);
            setImage(dyna[frame]);
        }
        
        if (time == 180)
        {
            explode();
            world.removeObject(this);
        }
    }
    
    public void explode()
    {
        MyWorld world = (MyWorld) getWorld();
        explosionArea.drawOval(x,y,100,100);
        explosionArea.setTransparency(0);
        if (isTouching(Enemy.class))
        {
            removeTouching(Enemy.class);
            world.increaseScore(1);
        }
    }
}
