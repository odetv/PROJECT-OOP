import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (I Gede Gelgel Abdiutama) 
 * @version (a version number or a date)
 */
public class RobotWorld extends MyWorld
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Method prepare
        Robot robot = new Robot();
        addObject(robot,48,50);
        Wall wall = new Wall();
        addObject(wall,52,147);
        Wall wall2 = new Wall();
        addObject(wall2,159,147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587,140);
        Wall wall5 = new Wall();
        addObject(wall5,692,140);
        Wall wall6 = new Wall();
        addObject(wall6,791,140);
        Block block = new Block();
        addObject(block,427,145);
        Home home = new Home();
        addObject(home,751,552);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,71,554);
        Pizza pizza = new Pizza();
        addObject(pizza,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,433,38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,183,302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,682,312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
    }

    private void call()
        {
            //Method call
        }
}
