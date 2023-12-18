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
    }
    
    public void act()
    {
        turnTowards(person.getX(), person.getY());
        move(0.5);
    }
    
    //public void eat()
    //{
    //    if (isTouching(Person.class))
    //    {
    //        if (eatTimer.millisElapsed() < 2000)
    //        {
    //            MyWorld gameWorld = (MyWorld) getWorld();
    //            gameWorld.decreaseLives(1);
    //        }
    //    }
    //    eatTimer.mark();
    //}
    
    //public void eat()
    //{
        //MyWorld gameWorld = (MyWorld) getWorld();
        //Person p = this.getOneIntersectingObject(Person.class);
        //if (p != null)
        //{
        //    gameWorld.decreaseLives(1);
        //    
        //    if (gameWorld.getLives() < 0)
        //    {
        //        System.out.println("game over :(");
        //    }
        //}
    //}
}
