package designpatterns;

public class Troll extends Character{
    
    public Troll(WeaponBehavior w) {
         super.setWeapon(w);
    }
    @Override
     public void fight(){
        super.getWeapon().useWeapon();
    }
    
    
    
}
