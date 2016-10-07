

import java.util.*;

public class RPG{

	private Random rand;

	public RPG(){
		this.rand = new Random();
	}

	//generate troll name..

	public String getRandomTrollName(){
		String [] monsters = {"Druid", "Hunter", "Mage", "Shaman", "Rogue"};
		List<String> mons = Arrays.asList(monsters);

		return mons.get(randInt(0, mons.size()-1));


	}

	public int randInt(int min,int max){
		 int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
	}

	 // coin toss
    public boolean coinToss() {
        return randInt(0, 1) == 1 ? true : false;
    }

// pause the game for awhile for dramatic effect!
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

     // duel two characters, one as attacker, one as defender
    // returns true if someone is killed
    public boolean battle(RPGCharacter attacker, RPGCharacter defender) {
        //int damage = attacker.attack();
        System.out.println("--> " + attacker.getName() +" "+ " ATK "+ " " + defender.getName());
        sleep(2000);
        int remHp;

        if (coinToss()) {
            attacker.attack(defender);
            remHp = defender.getHp();

            if (remHp <= 0) {
                System.out.printf("--> %s killed %s!\n", attacker.getName(), defender.getName());
                return true;
            }
            
        } else {
            System.out.println("--> MISSED!");
        }

        return false;
    }
        // game...


    public static void main(String[] args){

    	int mainchoice, character;
    	Scanner sc = new Scanner(System.in);

    	RPG rpg = new RPG();
    	RPGCharacter hero;
    	RPGCharacter monster;

    	do{
    		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\t\tWARDUDES\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        	System.out.println( " 1 - START \n\n 2 - EXIT" );

        	do{
        		mainchoice = sc.nextInt();
        		if(mainchoice<1 || mainchoice>2)
        			System.out.println("Not in the menu");

        	}while((mainchoice<1) || (mainchoice>3));

        	if(mainchoice==1){
        		while(true){
        			//choosing heroes
        			hero = Hero.heroChoose();
        			monster = new Trolls(rpg.getRandomTrollName(),rpg.randInt(15,40),3,5,rpg.randInt(1,10));
        		    //int monsterHp = monster.getHp(); 

        		int round=0;

        		while(true){
        			System.out.println("\n ROUND" +" "+ ++round +" "+ "BEGIN!");
        			//hero's turn
        			boolean monsterIsDead = rpg.battle(hero, monster);
          		    if (monsterIsDead) break;



            		// monster's turn
            		boolean heroIsDead = rpg.battle(monster, hero);
            		if (heroIsDead) break;

            		System.out.printf("%s\n%s\n", hero, monster);
        		}

        			 System.out.printf("%s\n%s\n", hero, monster);
                break;
        	}
        }
        	
        	else if (mainchoice ==2){
                System.out.println("\n");
        		System.out.println(" BYE BYE !");
 				break;
        	}


    	}while(mainchoice!=2);
    	 


    }
  
}
