import java.util.*;
public class Undead extends Hero {

    // because of sword
    private static final int BASE_ATTACK = 8;
    // because of armor
    private static final int ARMOR = 6;

    private static final int MANA = 10;

    private static final int life=25;

    public Undead() {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(life+ARMOR, MANA,BASE_ATTACK,BASE_ATTACK+5,"Life Steal");

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
        int minSteal = BASE_ATTACK;
        int maxSteal = BASE_ATTACK+5;
        Random rand = new Random();

        int lifesteal = rand.nextInt(maxSteal - minSteal)+ minSteal;

        this.hp += lifesteal;
        monster.hp -=lifesteal;

        if(monster.hp<1){
            monster.hp = 0;
        }

        System.out.println("Life increased by "+lifesteal);



    }
}