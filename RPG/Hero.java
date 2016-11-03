import java.util.*;


public abstract class Hero extends RPGCharacter {
    protected int mana;
    protected String abilityName;

    public Hero(int hp, int mana, int minDam, int maxDam, String abilityName) {
        super(hp, minDam, maxDam);
        this.mana = mana;
        this.name = heroName();
        this.abilityName = abilityName;

    }


    // getters and setters
    public int getMana() {
        return mana;
    }


    public static String heroName(){
        String hname;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your hero's name:");
        hname = sc.nextLine();

        return hname;
    }

    public abstract void ability(RPGCharacter monster);


    @Override
    public void attack(RPGCharacter monster){
        Scanner sc = new Scanner(System.in);
        int attack = 0;


        if(mana>=6)
            System.out.println( this.abilityName+ ": Available\n");
        else
            System.out.println( this.abilityName+ ": Not Available\n");

        if(mana <6){
            do{
                System.out.println("\n You have no manna left. You can only use Melee Attack. Press 1.\n");
                attack = sc.nextInt();
            }while(attack!=1);
        }
        else{
            do{
                System.out.println("\n Melee Attack or "+ this.abilityName +"? Press 1 or 2.\n");
                attack = sc.nextInt();
            }while(attack!=1 && attack!=2);
        }//If Player 1 has less than 6 manna points, he/she can only use Melee Attack.


        if(attack==1){
            System.out.println("\n Hero chose Melee Attack!\n");
            super.damageDealt(monster);
        }

        else if(attack==2){
            System.out.println("\n Hero chose "+ this.abilityName + "\n");
            mana-=6;
            ability(monster);
            
        }

         mana+=2;
            if(mana>10)
                mana=10;

        System.out.println("Mana left: "+ mana);    


    }


    //attack damage
    public void damageDealt(RPGCharacter monster){
        super.damageDealt(monster);
    }


    //choose heroes
    public static RPGCharacter heroChoose(){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n CHOOSE YOUR HEROES:\n 1 - Human\n 2 - NightElf\n 3 - Orc\n 4 - Undead \n");
            choice = sc.nextInt();

            if(choice ==1){
                System.out.println("Human has been chosen");
                return new Human();
            }

            else if(choice ==2){
               System.out.println("NightElf has been chosen");
                return new NightElf();
            }
            else if(choice == 3){
                System.out.println("Orc has been chosen");
                return new Orc();
            }

            else if(choice == 4){
                System.out.println("Undead has been chosen");
                return new Undead();
            }
            else{
                System.out.println("Invalid option");
            }

        }while(true);


    }




}
