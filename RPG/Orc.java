import java.util.*;

public class Orc extends Hero {

    // because of sword
    private static final int BASE_ATTACK = 9;
    // because of armor
    private static final int ARMOR = 10;

    private static final int MANA = 10;

    private static final int life=30;

    public Orc() {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super( life+ARMOR, MANA, BASE_ATTACK, BASE_ATTACK+5,"RAGE");

        ShowStats();
    }


    public void ShowStats(){
        System.out.println("HP:"+getHp());
        System.out.println("Armor:"+ARMOR);
        System.out.println("Mana:"+getMana());
        System.out.println("Minimun Damage:"+BASE_ATTACK);
        System.out.println("\n");
    }

     public void ability(RPGCharacter monster){
        Random rand = new Random(); 
        int ragePossibility = rand.nextInt(10)+1;

        if(ragePossibility==7 || ragePossibility==9){
            int damage = rand.nextInt(100)+30;
            System.out.println("Critical Hit!");

        monster.hp -=damage;

            if(monster.hp<1){
                monster.hp = 0;
            }
        }

        else{

            System.out.println("Rage not activated");
        }


    }

}