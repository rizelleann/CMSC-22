
/*import designpatterns.AxeBehavior;
import designpatterns.BowAndArrowBehavior;
import designpatterns.King;
import designpatterns.KnifeBehavior;
import designpatterns.Queen;
import designpatterns.WeaponBehavior;
import designpatterns.SwordBehavior;*/
/**
 *
 * @author RizelleAnn
 */
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

 		Character queen = new Queen(sword);
        Character king = new King(bowAndArrow);
        Character knight = new Knight(axe);
        Character troll = new Troll(sword);
       	queen.fight();
 		king.fight();
 		knight.fight();
 		troll.fight();

 		Character queen = new Queen(axe);
        Character king = new King(sword);
        Character knight = new Knight(bowAndArrow);
        Character troll = new Troll(knife);
       	queen.fight();
 		king.fight();
 		knight.fight();
 		troll.fight();





    }
    
}
