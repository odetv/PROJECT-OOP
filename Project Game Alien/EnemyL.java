import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyL extends Enemy
{
    public EnemyL(){
        super();
    }
    
    public EnemyL(int speed)
    {
        super(speed);
    }
    
    public void act()
    {
        super.enemyMove();
        turn(1);
    }
}
