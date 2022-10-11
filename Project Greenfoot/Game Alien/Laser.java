import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(8);
        laserCollision();
        
    }
    public void laserCollision(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(
                new Boom(),
                getX(),
                getY()
                );
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if (isAtEdge())
            getWorld().removeObject(this);
    }
}
