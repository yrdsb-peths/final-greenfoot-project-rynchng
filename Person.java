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
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Person()
    {
        setImage(guy);
        guy.scale(50,75);
        setRotation(0);
    }
    
    public void act()
    {
        
    }
    
    public void rotate()
    {
        
    }
}
