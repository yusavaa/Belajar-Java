
public class Game {
    /*
     * You can make new Hero, Enemy, or Item
     * by using command:
     * static <object type> <object name> = new <object type>(parameter*)
     * 
     * there are only three object type: Hero, Enemy, Item
     */

    // make Hero -> parameter (name, healt, power, deffence)
    static Hero hero = new Hero("Taki", 100, 5, 0);

    // make Enemy -> parameter (name, healt, power, deffence)
    static Enemy slime = new Enemy("Slime", 20, 2, 0);
    static Enemy org = new Enemy("Org", 200, 20, 10);

    // make Item -> parameter (name, power, deffence)
    static Item excalibur = new Item("Excalibur", 20, 0);
    static Item ironArmor = new Item("Iron Armor", 0, 20);

    /*
     * Method for Hero
     * takeItem(item name) -> taking item and increase Hero base status
     * 
     * Method for Hero and Enemy
     * display(object name) -> display status of object
     * attack(enemy name) -> dealing damage to target enemy
     */
    
    public static void main(String[] args) {
        hero.takeItem(excalibur);
        hero.takeItem(ironArmor);

        hero.display();

        org.attack(hero);
        hero.attack(org);
    }

}
