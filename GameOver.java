import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public int score;
    Label endLabel;
    Label scoreLabel;
    Label restartLabel;
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.score = score;
        
        prepare();
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            removeObject(endLabel);
            removeObject(scoreLabel);
            removeObject(restartLabel);
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
    
    public void prepare()
    {
        endLabel = new Label("You Lose!", 90);
        addObject(endLabel,getWidth()/2, 55);
        
        scoreLabel = new Label("Your Score : " + score, 55);
        addObject(scoreLabel,getWidth()/2,130);
        
        restartLabel = new Label("Press <space> to restart", 45);
        addObject(restartLabel,getWidth()/2,350);
    }
}
