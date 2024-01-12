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
    private int rotation;
    /**
     * Act - do whatever the Boolet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Boolet()
    {
        setImage(boolet);
        boolet.scale(15,5);
    }
    
    public Boolet(int rotation)
    {
        setImage(boolet);
        boolet.scale(15,5);
        this.rotation = rotation;
        setRotation(rotation);
    }
    
    public void act()
    {
        shot();
    }
    
    public void shot()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        move(4);
        int x = 8;
        
        if (gameWorld.getScore() == 40)
        {
            x = 4;
        }
        if (isTouching(Enemy.class))
        {
            removeTouching(Enemy.class);
            gameWorld.removeObject(this);
            gameWorld.increaseScore(1);
            if (gameWorld.getScore() % 15 == 0 && gameWorld.getScore() != 0)
            {
                gameWorld.increaseBombs();
            }
            
            int random = Greenfoot.getRandomNumber(x);
            if (random == 1)
            {
                for (int i = 0; i < 2; i++)
                {
                    gameWorld.createZombie();
                }
            }
            else
            {
                gameWorld.createZombie();
            }
        }
        else if (getX() < 2)
        {
            gameWorld.removeObject(this);
        }
        else if (getX() > 598)
        {
            gameWorld.removeObject(this);
        }
        else if (getY() < 2)
        {
            gameWorld.removeObject(this);
        }
        else if (getY() > gameWorld.getHeight() - 2)
        {
            gameWorld.removeObject(this);
        }
    }
}
