import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallBg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallBg extends Actor
{
    GreenfootImage bord = new GreenfootImage("small bg.png");
    /**
     * Act - do whatever the SmallBg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public SmallBg()
    {
        setImage(bord);
        bord.scale(60,60);
    }
    public void act()
    {
        // Add your action code here.
    }
}
