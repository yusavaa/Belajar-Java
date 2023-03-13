public class Enemy extends Entity{

    public Enemy(String name, double baseHealt, double basePower, double baseDeff) {
        super(name, baseHealt, basePower, baseDeff);
    }
    
    void attack(Hero opponent) {
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
