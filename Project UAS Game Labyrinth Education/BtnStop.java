import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnStop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnStop extends Button
{
    /**
     * Act - do whatever the BtnStop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.ButtonPressed();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new Start()); //untuk switch halaman
            Greenfoot.stop();
        }
    }
}