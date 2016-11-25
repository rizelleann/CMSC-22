package designpatterns;


public class Knight extends Character{
    
    public Knight(WeaponBehavior w) {
         super.setWeapon(w);
    }
    @Override
     public void fight(){
        super.getWeapon().useWeapon();
    }
    
    
    
}
