import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Apple extends Food
{
    public Apple() {
        super(1);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 3);
    }
}