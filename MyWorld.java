import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Person person;
    Enemy enemy;
    Boolet boolet;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        boolet = new Boolet();
        
        person = new Person();
        addObject(person, 300, 200);
        
        createZombie();
    }
    
    public void createZombie()
    {
        int ranX;
        int ranY;
        
        if (Greenfoot.getRandomNumber(2) == 1)
        {
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                ranX = Greenfoot.getRandomNumber(15);
            }
            else
            {
                ranX = 585 + Greenfoot.getRandomNumber(15);
            }
            ranY = Greenfoot.getRandomNumber(getHeight());
        }
        else
        {
            ranX = Greenfoot.getRandomNumber(getWidth());
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                ranY = Greenfoot.getRandomNumber(10);
            }
            else
            {
                ranY = 390 + Greenfoot.getRandomNumber(10);
            }
        }
        enemy = new Enemy(person);
        addObject(enemy, ranX, ranY);
    }
}
