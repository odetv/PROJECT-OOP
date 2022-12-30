import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tentang extends World
{
    public Tentang()
    {    
        super(600, 700, 1);
        prepare();
    }
    private void prepare()
    {
        BtnKembali btnKembali = new BtnKembali();
        addObject(btnKembali,300,650);
    }
}
