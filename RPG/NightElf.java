import java.util.*;

public class NightElf extends Hero {

    // because of sword
    private static final int BASE_ATTACK = 7;
    // because of armor
    private static final int ARMOR = 3;

    private static final int MANA = 10;

    private static final int life = 25;

    public NightElf() {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(life+ARMOR, MANA, BASE_ATTACK, BASE_ATTACK+5, "Frost Arrows");

       ShowStats();
    }

    //hp = 30
    //mana = 10


    public void ShowStats(){
        System.out.println("HP:"+getHp());
        System.out.println("Armor:"+ARMOR);
        System.out.println("Mana:"+getMana());
        System.out.println("Minimum Damage:"+BASE_ATTACK);
        System.out.println("\n");
    }

    public void ability(RPGCharacter monster){
        int minArrows = BASE_ATTACK;
        int maxArrows = BASE_ATTACK+5;
        Random rand = new Random();

        int arrows = rand.nextInt(maxArrows - minArrows)+ minArrows;

        monster.hp -=arrows;

        if(monster.hp<1){
            monster.hp = 0;
        }

        System.out.println("FROST ARROWS!!!");



    }
}