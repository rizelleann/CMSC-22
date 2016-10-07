import java.util.*;

public abstract class RPGCharacter {

    protected String name;
    protected int hp;
    protected int minDamage;
    protected int maxDamage;

//default constructor
    RPGCharacter(){
        name = "Anonymous";
        hp = 10;
        minDamage = 5;
        maxDamage = 10;
    }

    public RPGCharacter(int hp, int minDam, int maxDam) {
        this.name = "Anonymous";
        this.hp = hp;
        minDamage = minDam;
        maxDamage = maxDam;

    }

    // implement in subclass
    public abstract void attack(RPGCharacter character);


    //troll methods
    //public abstract boolean canHeal();
    //public abstract void heal();

    public void damageDealt(RPGCharacter character){
        Random rand = new Random();
        int damage = rand.nextInt((maxDamage - minDamage) + 1) + minDamage;

        System.out.println(this.name+"  "+ "hits" +"  "+ damage+"!");
        character.hp -= damage;

        if(character.hp<1){
            character.hp = 0;
        }

    }



    // checks to see if character is still alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }


    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }




    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}