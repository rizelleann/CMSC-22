import java.util.*;

public class Human extends Hero {

    // because of sword
    private static final int BASE_ATTACK = 5;
    // because of armor
    private static final int ARMOR = 5;

    private static final int life = 30;

    private static final int MANA = 10;

    public Human() {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(life+ARMOR,MANA, BASE_ATTACK, BASE_ATTACK+5,"Thunderbolt");

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
        int minThunder = 5;
        int maxThunder = 10;
        Random rand = new Random();

        int thunder = rand.nextInt(maxThunder - minThunder)+minThunder;

        monster.hp -=thunder;


        if(monster.hp<1){
            monster.hp = 0;
        }

        System.out.println("THUNDERBOLT!!!");



    }

}