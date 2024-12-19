import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Jason
 * @version Sep 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth() / 2, getHeight() / 2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,487,100);
        elephant.setLocation(492,102);
        Label label = new Label("press space to start game", 40);
        addObject(label,287,253);
        label.setLocation(339,283);
        label.setLocation(344,289);
        elephant.setLocation(265,85);
        label.setLocation(200,298);
        label.setLocation(193,294);
        elephant.setLocation(247,104);
        label.setLocation(296,300);
        elephant.setLocation(292,60);
        elephant.setLocation(267,117);
        elephant.setLocation(291,115);
        label.setLocation(369,299);
        Label label2 = new Label("use \u2190 and \u2192 to move", 40);
        addObject(label2,291,257);
        label.setLocation(306,319);
    }
}
