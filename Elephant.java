import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Jason Chow
 * @version September 2024
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D"))
        {
            move(3);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
