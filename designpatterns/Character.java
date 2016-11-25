package designpatterns;

public abstract class Character {
    public static WeaponBehavior weapon;
    
    public abstract void fight();
    
    
    public void setWeapon(WeaponBehavior w){
        weapon = w;
    }    
    
    public WeaponBehavior getWeapon(){
        return weapon;
    }
}
