package designpatterns;


public class King extends Character{
    
    public King(WeaponBehavior w) {
         super.setWeapon(w);
    }
    @Override
     public void fight(){
        super.getWeapon().useWeapon();
    }
    
    
    
}
