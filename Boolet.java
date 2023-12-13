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
    private int mouseX;
    private int mouseY;
    /**
     * Act - do whatever the Boolet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boolet()
    {
        setImage(boolet);
        boolet.scale(15,5);
    }
    
    public Boolet(int mouseX, int mouseY)
    {
        setImage(boolet);
        boolet.scale(15,5);
        this.mouseX = mouseX;
        this.mouseY = mouseY;
    }
    
    public void act()
    {
        
    }
    
    public void shot()
    {
        int xMovement = getX()
        if (getX() < 0 || getX() > 600)
        {
            
        }
    }
}
