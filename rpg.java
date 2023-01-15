import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerHealth = 100;
        int monsterHealth = 100;
        boolean gameRunning = true;
        
        System.out.println("Welcome to the RPG game!");
        System.out.println("You are a brave adventurer on a quest to defeat the monster!");
        
        while (gameRunning) {
            System.out.println("Player health: " + playerHealth);
            System.out.println("Monster health: " + monsterHealth);
            System.out.println("What do you want to do?");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Use potion");
            System.out.println("4. Run away");
            
            int playerChoice = input.nextInt();
            
            if (playerChoice == 1) {
                int damage = (int) (Math.random() * 25);

                monsterHealth -= damage;
                System.out.println("You attacked the monster and dealt " + damage + " damage!");
            } else if (playerChoice == 2) {
                System.out.println("You defended and reduced incoming damage by 50%!");
            } else if (playerChoice == 3) {
                if (playerHealth < 100) {
                    playerHealth += 25;
                    System.out.println("You used a potion and restored 25 health!");
                } else {
                    System.out.println("You can't use potion, your health is already full");
                }
            } else if (playerChoice == 4) {
                System.out.println("You ran away from the monster!");
                gameRunning = false;
            }
            if (monsterHealth <= 0) {
                System.out.println("You defeated the monster!");
                gameRunning = false;
            } else {
                int monsterDamage = (int) (Math.random() * 25);
                playerHealth -= monsterDamage;
                System.out.println("The monster attacked you and dealt " + monsterDamage + " damage!");
                if (playerHealth <= 0) {
                    System.out.println("You were defeated by the monster!");
                    gameRunning = false;
                }
            }
        }
    }
}
