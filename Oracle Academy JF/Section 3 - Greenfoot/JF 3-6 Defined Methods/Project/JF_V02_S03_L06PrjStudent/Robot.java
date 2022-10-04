import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
    public void robotMovement()
    {
        //moveRobot
    }
    void detectWallCollision()
    {
        //Kode jika robot bertabrakan dg Wall, maka robot akan kembali ke awal
        if (isTouching(Wall.class))
        {
            setLocation(0,getY());
        }
    }
    public void detectBlockCollision()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Block.class))
        {
            setLocation(0,getY());
        }
    }
}