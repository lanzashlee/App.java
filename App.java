public class App {
    public static void main(String[] args){

        // Character Class
        Character knight = new Character();

        knight.strength = 18;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Leomord";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        // Character Class
        Character mage = new Character();

        mage.strength = 10;
        mage.agility = 8;
        mage.intelligence = 15;
        mage.name = "Nana";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        // Character Class
        Character archer = new Character();

        archer.strength = 15;
        archer.agility = 20;
        archer.intelligence = 7;
        archer.name = "Karrie";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
    

        // Enemy Class
        Enemy dragon = new Enemy();

        dragon.damage = 50;
        dragon.health = 500;
        dragon.armor = 80;
        dragon.hasMagicImmunity = false;
        dragon.name ="Dragon Tamer";
        dragon.enemyDialogue();
    } 
}
