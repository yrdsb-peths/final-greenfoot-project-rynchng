import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    GreenfootImage zombie = new GreenfootImage("zomb.png");
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {
        setImage(zombie);
        zombie.scale(70,40);
    }
    
    public void act()
    {
        track();
    }
    
    public void track()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        turnTowards(
    }
}
