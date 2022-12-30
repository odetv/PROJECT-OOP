import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    protected int speed;
    
    public Bom(int speed){
        this.speed = speed;
    }
    
    public void act()
    {
        WallDetect();
    }
    
    protected void WallDetect(){
        if(isTouching(WallHorizontal.class) || isTouching(WallVertikal.class)){
            speed = -speed;
        }
    }
}
