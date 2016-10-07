import java.util.*;


public class Trolls extends RPGCharacter{
    protected int attackDamage;
    protected int minHealing = 3;
    protected int maxHealing = 5;



    public Trolls(String name, int hp, int minHealing, int maxHealing, int attackDamage ) {
        super(hp,attackDamage,attackDamage+5);
        this.attackDamage = attackDamage;
        this.minHealing = minHealing;
        this.maxHealing = maxHealing;
        this.name = name;

    }



    public boolean canHeal(){
    	Random rand = new Random();
    	int healChance = rand.nextInt(10-5)+5;

    	if(healChance == 6 || healChance == 8)
    		return true;
    	else
    		return false;
    }

    public void heal(){
    	Random rand = new Random();
    	int heal = rand.nextInt(maxHealing - minHealing)+ minHealing;
    	this.hp += heal;
    	System.out.println(this.name+" "+"life restored \n");

    }

    public void attack(RPGCharacter hero){
    	Random rand = new Random();
    	int doubleDamage = rand.nextInt(10-5)+5;


    	if(doubleDamage==5){
            System.out.println("DOUBLE DAMAGE ^^");
    		super.damageDealt(hero);
    		super.damageDealt(hero);
    	}

    	else{
    		super.damageDealt(hero);
    	}

        if(canHeal())
             heal();

    }

}