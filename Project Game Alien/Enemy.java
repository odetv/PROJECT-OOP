import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
    public Enemy()
    {
        setRotation(180);
    }
    
    public void act()
    {
        enemyMove();
    }
    
    private int speed = 3;
    protected void enemyMove(){
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this); 
        }
    }
}