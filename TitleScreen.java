import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label title;
    Label tip;
    Label controls;
    Label aim;
    SmallBg sm;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        sm = new SmallBg();
        addObject(sm, 35, 365);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        title = new Label("Apocalypse", 80);
        addObject(title,300,75);
        tip = new Label(" = Zombie Spawn Area", 35);
        addObject(tip,225,365);
        controls = new Label("Use W,A,S,D to move", 50);
        addObject(controls,300,190);
        aim = new Label("Look around with mouse", 50);
        addObject(aim,300,250);
    }
}
