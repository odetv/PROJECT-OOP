import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public void act()
    {
        moveHero();
        shootLaser();
        detectEnemyCollision();
    }
    
    private void moveHero()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
    }
    
    private int laserTimer = 0;
    private void shootLaser(){
        if (laserTimer == 30){
            getWorld().addObject(
                new Laser(),
                getX() + 5,
                getY()
            );
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
    
    private void detectEnemyCollision()
    {
        if (isTouching(Enemy.class))
        {
            enemyCollision();
            setLocation(100,200);
        }
    }
    
    private void enemyCollision(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(
                new Boom(),
                getX(),
                getY()
                );
        }
    }
}