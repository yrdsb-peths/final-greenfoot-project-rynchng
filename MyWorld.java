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
    
    
    Label scoreLabel;
    Label livesLabel;
    public int score = 0;
    public int lives = 5;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage backgroundImage = getBackground();
        backgroundImage.scale(600,400);
        setBackground(backgroundImage);

        boolet = new Boolet();

        person = new Person();
        addObject(person, 300, 200);

        createZombie();
        prepare();
    }

    public void createZombie()
    {
        int ranX;
        int ranY;

        if (Greenfoot.getRandomNumber(2) == 1)
        {
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                ranX = Greenfoot.getRandomNumber(25);
            }
            else
            {
                ranX = 575 + Greenfoot.getRandomNumber(25);
            }
            ranY = Greenfoot.getRandomNumber(getHeight());
        }
        else
        {
            ranX = Greenfoot.getRandomNumber(getWidth());
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                ranY = Greenfoot.getRandomNumber(15);
            }
            else
            {
                ranY = 380 + Greenfoot.getRandomNumber(15);
            }
        }
        enemy = new Enemy(person);
        addObject(enemy, ranX, ranY);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        scoreLabel = new Label("Score: " + score, 30);
        addObject(scoreLabel,70,30);
        livesLabel = new Label("Lives: " + lives, 30);
        addObject(livesLabel,70,70);
    }
    
    public void increaseScore(int x)
    {
        score = score + x;
        scoreLabel.setValue("Score: " + score);
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void increaseLives(int x)
    {
        lives = lives + x;
        livesLabel.setValue("Lives: " + lives);
    }
    
    public void decreaseLives(int x)
    {
        lives = lives - x;
        livesLabel.setValue("Lives: " + lives);
    }
    
    public int getLives()
    {
        return lives;
    }
}
