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
    private Person person;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(Person person)
    {
        setImage(zombie);
        zombie.scale(70,40);
        this.person = person;
    }
    
    public void act()
    {
        turnTowards(person.getX(), person.getY());
        //if (Greenfoot.getRandomNumber(20) < 8)
        //{
        //    
        //}
        move(1);
        
    }
}
