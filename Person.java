import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends SmoothMover
{
    GreenfootImage guy = new GreenfootImage("shoota.png");
    MouseInfo mouse;
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Person()
    {
        setImage(guy);
        guy.scale(90,50);
        setRotation(0);
    }
    
    public void act()
    {
        mouse = Greenfoot.getMouseInfo();
        MyWorld world = (MyWorld) getWorld();
        rotate();
        traverse();
        
        if (Greenfoot.mouseClicked(null))
        {
            shoot();
        }
        
        if (Greenfoot.isKeyDown("b"))
        {
            world.createBomb();
        }
    }
    
    public void rotate()
    {
        mouse = Greenfoot.getMouseInfo();
        if (mouse != null)
        {
            turnTowards(mouse.getX(),mouse.getY());
        }
    }
    
    public void traverse()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 2.5);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 2.5);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 2.5, getY());
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 2.5, getY());
        }
    }
    
    public void shoot()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        mouse = Greenfoot.getMouseInfo();
        int m = 0;
        int n = 0;
        if (getRotation() > 0 && getRotation() < 90)
        {
            m = 20;
        }
        else if (getRotation() > 90 && getRotation() < 180)
        {
            n = 20;
        }
        else if (getRotation() > 180 && getRotation() < 270)
        {
            m = -20;
        }
        else if (getRotation() > 270 && getRotation() < 360)
        {
            n = -20;
        }
        gameWorld.addObject(new Boolet(getRotation()), getX(), getY()); 
    }
}
