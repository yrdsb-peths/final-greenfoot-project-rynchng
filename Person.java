import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
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
        rotate();
        traverse();
        
        if (Greenfoot.mouseClicked(null))
        {
            shoot();
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
            setLocation(getX(), getY() - 2);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 2);
        }
        
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 2, getY());
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 2, getY());
        }
    }
    
    public void shoot()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        mouse = Greenfoot.getMouseInfo();
        gameWorld.addObject(new Boolet(mouse.getX(), mouse.getY()), getX(), getY()); 
        System.out.println(getRotation());
    }
}
