import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnUlangi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnUlangi extends Button
{
    /**
     * Act - do whatever the BtnUlangi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.ButtonPressed();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new MyWorld()); //untuk switch halaman
        }
    }
}
