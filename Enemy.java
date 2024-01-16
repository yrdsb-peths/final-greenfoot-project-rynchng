import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends SmoothMover
{
    GreenfootImage zombie = new GreenfootImage("zomb.png");
    private Person person;
    
    SimpleTimer eatTimer = new SimpleTimer();
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(Person person)
    {
        setImage(zombie);
        zombie.scale(70,40);
        this.person = person;
        eatTimer.mark();
    }
    
    public void act()
    {
        turnTowards(person.getX(), person.getY());
        move(0.375);
        eat();
    }
    int count = 50;
    int attackSpeed = 75;
    public void eat()
    {
        MyWorld gameWorld = (MyWorld) getWorld();
        Person p = (Person) this.getOneIntersectingObject(Person.class);
        
        if (isTouching (Person.class))
        {
            count++;
        }
        if (p != null && count >= attackSpeed)
        {
            gameWorld.decreaseHealth(1);
            count = 0;
            
            if (gameWorld.getHealth() <= 0)
            {
                GameOver endWorld = new GameOver(gameWorld.getScore());
                Greenfoot.setWorld(endWorld);
            }
        }
    }
}
