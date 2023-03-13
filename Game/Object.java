
class Entity {
    int level;
    String name;
    double baseHealt, basePower, baseDeff;

    public Entity(String name, double baseHealt, double basePower, double baseDeff) {
        this.level = 1;
        this.name = name;
        this.baseHealt = baseHealt;
        this.basePower = basePower;
        this.baseDeff = baseDeff;
    }

    void display() {
        System.out.println("\nLevel: "+ this.level);
        System.out.println("Name: "+ this.name);
        System.out.println("Healt: "+ this.baseHealt);
        System.out.println("Power: "+ this.basePower);
        System.out.println("Deffence: "+ this.baseDeff);
    }
}

class Item {
    String name;
    double power, deff;

    public Item(String name, double power, double deff) {
        this.name = name;
        this.power = power;
        this.deff = deff;
    }
}
