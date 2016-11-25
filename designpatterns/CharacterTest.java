package designpatterns;

public class CharacterTest {

    public static void main(String[] args) {
        WeaponBehavior knife = new KnifeBehavior();
        WeaponBehavior bowAndArrow = new BowAndArrowBehavior();
        WeaponBehavior axe = new AxeBehavior();
        WeaponBehavior sword = new SwordBehavior();
        
        Character queen = new Queen(bowAndArrow);
        Character king = new King(knife);
        Character knight = new Knight(sword);
        Character troll = new Troll(axe);
       	queen.fight();
        king.fight();
        knight.fight();
        troll.fight();

        queen = new Queen(sword);
        king = new King(bowAndArrow);
        knight = new Knight(axe);
        troll = new Troll(sword);
       	queen.fight();
        king.fight();
        knight.fight();
        troll.fight();

        queen = new Queen(axe);
        king = new King(sword);
        knight = new Knight(bowAndArrow);
        troll = new Troll(knife);
       	queen.fight();
        king.fight();
        knight.fight();
        troll.fight();

    }
    
}
