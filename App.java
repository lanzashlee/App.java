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

        // Pet Class
        Pet cat = new Pet();

        cat.name = "Boots";
        cat.trustlevel = 100;
        cat.isAdopted = false;
        cat.birthday = "05/17/2007";
        cat.itsMyPet();

        // Fruit Class
        Fruit Banana = new Fruit();
        Banana.color = "Yellow";
        Banana.taste = "supersweet";
        Banana.weight = 0.55F;
        Banana.isMyFavorite = true ;
        Banana.firstLetterofTheObject = 'B';
        Banana.fruit();

        //Person Class
        Person Me = new Person();

        Me.surname = "Ricamara";
        Me.firstName = "Lanz Ashlee";
        Me.middleinitial = 'D';
        Me.dateOfBirth = "05/17/2004";
        Me.studentNumber = 2022-104474;
        Me.studentEmailAddress = "ricamarald@students.national-edu.ph";
        Me.iAmAwesome = true;
        Me.Me();



    }

}
