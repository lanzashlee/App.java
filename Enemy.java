public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue(){
        System.out.println("Fear me player my name is "+ name + "and i deal " + damage + "damage");
        System.out.println("And i have a " + armor + "armor");
    }
}
