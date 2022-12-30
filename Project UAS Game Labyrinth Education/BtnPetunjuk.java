import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnPetunjuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnPetunjuk extends Button
{
    /**
     * Act - do whatever the BtnPetunjuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.ButtonPressed();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(3);
            Greenfoot.setWorld(new Petunjuk()); //untuk switch halaman
        }
    }
}
