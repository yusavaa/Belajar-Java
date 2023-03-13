public class Hero extends Entity{

    public Hero(String name, double baseHealt, double basePower, double baseDeff) {
        super(name, baseHealt, basePower, baseDeff);
    }

    Item weapon, armor;

    void takeItem(Item chooseItem) {
        this.weapon = chooseItem;
        this.basePower += chooseItem.power;
        this.baseDeff += chooseItem.deff;
    }

    void attack(Enemy opponent) {
        System.out.println("\n"+ this.name +" attacking "+ opponent.name +" with "+ basePower +" attack power.");
        opponent.takeDamage(basePower);
        opponent.display();
    }

    void takeDamage(double damage) {
        if (this.baseDeff > damage) {
            System.out.println(this.name +" get 0 damage.");
        } else {
            System.out.println(this.name +" get "+ damage +" damage.");
            this.baseHealt -= damage;
            if (this.baseHealt <= 0) {
                this.baseHealt = 0;
                System.out.println("Defeated.");
            }
        }
    }

}
