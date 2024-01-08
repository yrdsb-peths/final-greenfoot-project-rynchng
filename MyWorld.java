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
    Dynamite dyn;
    
    Label scoreLabel;
    Label healthLabel;
    Label bombsLabel;
    public int score = 0;
    public int health = 5;
    public int bombs = 0;
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
        
        dyn = new Dynamite();

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
        
        if (score % 2 == 0 && score != 0)
        {
            increaseBombs();
        }
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        scoreLabel = new Label("Score: " + score, 30);
        addObject(scoreLabel,80,40);
        healthLabel = new Label("Health: " + health, 30);
        addObject(healthLabel,80,80);
        bombsLabel = new Label("Bombs [B]: " + bombs, 30);
        addObject(bombsLabel, 500, 40);
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
    
    public void increaseHealth(int x)
    {
        health = health + x;
        healthLabel.setValue("Health: " + health);
    }
    
    public void decreaseHealth(int x)
    {
        health = health - x;
        healthLabel.setValue("Health: " + health);
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public void createBomb()
    {
        dyn = new Dynamite(person.getX(), person.getY());
        addObject(dyn, person.getX(), person.getY() + 40);
    }
    
    public int getBombs()
    {
        return bombs;
    }
    
    public void increaseBombs()
    {
        bombs = bombs + 1;
        bombsLabel.setValue("Bombs [B]: "+ bombs);
    }
    
    public void decreaseBombs()
    {
        bombs = bombs - 1;
        bombsLabel.setValue("Bombs [B]: "+ bombs);
    }
}
