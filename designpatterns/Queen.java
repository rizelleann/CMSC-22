package designpatterns;


public class Queen extends Character{
    
    public Queen(WeaponBehavior w) {
         super.setWeapon(w);
    }
    @Override
     public void fight(){
        super.getWeapon().useWeapon();
    }
    
    
    
}
