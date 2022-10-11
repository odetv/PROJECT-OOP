import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        /*if (isAtEdge()){
            setLocation(0,getY());
        }*/
        moveHero();
        shootLaser();
        detectEnemyCollision();
        //enemyCollision();
    }
    public void moveHero()
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
    int laserTimer = 0;
    public void shootLaser(){
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
    public void detectEnemyCollision()
    {
        //kode robot akan kembali ke awal jika bertabrakan dengan sebuah instance dari sebuah Block
        if (isTouching(Enemy.class))
        {
            setLocation(100,200);
        }
    }
    /*public void enemyCollision(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(
                new Boom(),
                getX(),
                getY()
                );
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        }
    }*/
}