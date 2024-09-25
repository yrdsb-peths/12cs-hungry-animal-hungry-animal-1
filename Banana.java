import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Banana extends Food
{
    public Banana() {
        super(10);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 4);
    }
}