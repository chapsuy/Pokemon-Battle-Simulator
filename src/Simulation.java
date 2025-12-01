import java.util.InputMismatchException;
import java.util.Scanner;
public class Simulation {
    Scanner scanner = new Scanner(System.in);
    public String WelcomeMessage() {
        System.out.println("Welcome to the Pokemon Battle Simulation!");
        System.out.println("What is your name, Trainer?");
        String playerName = scanner.nextLine();
        System.out.println("Hello " + playerName + "! Get ready for an exciting adventure!");
        System.out.println("You are given 100 coins to start your journey.");
        return playerName;
        

    }
    public void Buffer() {
        try {
                        for (int i = 0; i < 10; i++) {
                            System.out.print(".");
                            Thread.sleep(200  ); 
                            System.out.println();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
    }

    public Pokemon chooseStarterPokemon() {
        System.out.println("================================");
        System.out.println("Choose your starter Pokemon:");
        System.out.println("1. Bulbasaur (Grass Type)");
        System.out.println("2. Charmander (Fire Type)");
        System.out.println("3. Squirtle (Water Type)");
        System.out.println("================================");
        int choice = scanner.nextInt();
        System.out.print("You chose option: " + choice);
        System.out.println("\n================================");
        try {
            if (choice < 1 || choice > 3) {
                throw new IllegalArgumentException("Choice must be between 1 and 3.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + ": Uhh ohh! Let's try again.");
            return chooseStarterPokemon();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            scanner.next(); 
            return chooseStarterPokemon();
        }
        switch (choice) {
            case 1:
                System.out.println("You chose Bulbasaur!");
                Display.BulbasaurInfo(); 
                Pokemon bulbasaur = new Pokemon("Bulbasaur", 45, new Attack[]{
                    new Attack("Growl", 11, "Normal"),
                    new Attack("Tackle", 10, "Normal"),
                    new Attack("Vine Whip", 21, "Grass")
                    } , "Grass", 20);
                
                    return bulbasaur;
                    
            case 2:
                System.out.println("You chose Charmander!");
                Display.CharmanderInfo();
                Pokemon charmander = new Pokemon("Charmander", 45, new Attack[]{
                    new Attack("Growl", 10, "Normal"),
                    new Attack("Scratch", 14, "Normal"),
                    new Attack("Ember", 21, "Fire")
                    } , "Fire", 20);
                return charmander;
            case 3:
                System.out.println("You chose Squirtle!");
                Display.SquirtleInfo();
                Pokemon squirtle = new Pokemon("Squirtle", 45, new Attack[]{
                    new Attack("Tail Whip", 11, "Normal"),
                    new Attack("Tackle", 10, "Normal"),
                    new Attack("Water Gun", 21, "Water")
                    } , "Water", 20);
                return squirtle;
            default:
                System.out.println("Invalid choice. Please choose again.");
                return chooseStarterPokemon();

                
        }
        
    }
    public static void GameBriefing(){
        System.out.println("\n====================================\n");
        System.out.println("         SIMULATION PLAYTHROUGH       ");
        System.out.println(" Level 1: Route 1 - 3\n Level 2: Route 4 - 6\n Level 3: Route 7 - 9");
        System.out.println("Complete all levels without fainting to win!");
        System.out.println("\n====================================\n");
    }
    public static void LoadingScreen(){
        

        System.out.println("Loading");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(500  ); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void Level1briefing() {
        System.out.println("\n====================================\n");
        System.out.println("         LEVEL 1 BRIEFING       "); 
        System.out.println("\n    ----->[o]-----[]-----[]-----    \n");
        System.out.println("In this level, you will face wild Pokemon in Routes 1 to 3.");
        System.out.println("Defeat them to gain experience and coins!");
        System.out.println("Be careful not to faint, or the game will be over!");
        System.out.println("\n====================================\n");
    }
     public static void pressEnterToContinue(){ 
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
   public void Level2briefing() {
        System.out.println("\n====================================\n");
        System.out.println("         LEVEL 2 BRIEFING       "); 
        System.out.println("\n    -----[o]----->[o]-----[]-----    \n");
        System.out.println("In this level, you will face stronger wild Pokemon in Routes 4 to 6.");
        System.out.println("Defeat them to gain more experience and coins!");
        System.out.println("Be careful not to faint, or the game will be over!");
        System.out.println("\n====================================\n");
    }
    public void Level3briefing() {
        System.out.println("\n====================================\n");
        System.out.println("         LEVEL 3 BRIEFING       "); 
        System.out.println("\n    -----[o]-----[o]----->[o]-----    \n");
        System.out.println("In this level, you will face the toughest wild Pokemon in Routes 7 to 9.");
        System.out.println("Defeat them to complete your journey and become a Pokemon Master!");
        System.out.println("Be careful not to faint, or the game will be over!");
        System.out.println("\n====================================\n");
    }
    public void GameOver(Player thisplayer, Pokemon starterPokemon) {
        System.out.println("\n====================================\n");
        System.out.println("            GAME OVER       "); 
        System.out.println("\n    -----[x]-----[x]-----[x]-----    \n");
        System.out.println("Oh no! Your Pokemon has fainted.");
        System.out.println("Better luck next time, Trainer!");
        System.out.println("\n====================================\n");
        PlayerStats(thisplayer, starterPokemon);          
    }
    public static void PlayerStats(Player thisplayer, Pokemon thisPokemon) {
        System.out.println("\n====================================\n");
        System.out.println("Player Stats:");
        System.out.println("Player Name: " + thisplayer.getName());
        System.out.println("Total Coins: " + thisplayer.getCoins());
        System.out.println("Pokemon Used: " + thisPokemon.getName());
        System.out.println("\n====================================\n");
    }
    public void Victory1() {
        System.out.println("\n====================================\n");
        System.out.println("           CONGRATULATIONS       "); 
        System.out.println("\n    ----->[V]-----[]-----[]-----    \n");
        System.out.println("You have successfully completed Level 1!");
        System.out.println("\n====================================\n");
    }
    public void Victory2() {
        System.out.println("\n====================================\n");
        System.out.println("           CONGRATULATIONS       "); 
        System.out.println("\n    -----[V]---->[V]-----[]-----    \n");
        System.out.println("You have successfully completed Level 2!");
        System.out.println("\n====================================\n");
    }
    public void Victory3() {
        System.out.println("\n====================================\n");
        System.out.println("           CONGRATULATIONS       "); 
        System.out.println("\n    -----[V]-----[V]----->[V]-----    \n");
        System.out.println("You have successfully completed Level 3!");
        System.out.println("\n====================================\n");
    }
    public void FinalVictory(Player thisplayer, Pokemon starterPokemon) {
        System.out.println("\n====================================\n");
        System.out.println("           CONGRATULATIONS       "); 
        System.out.println("\n    -----[V]-----[V]-----[V]----->    \n");
        System.out.println("You have successfully completed the Pokemon Battle Simulation!");
        System.out.println("You are now ready for the ultimate challenge!");
        System.out.println("\n====================================\n");
        PlayerStats(thisplayer, starterPokemon);

    }
    public int Menu() {
        System.out.println("\n====================================\n");
        System.out.println("            MAIN MENU       "); 
        System.out.println("1. Fight");
        System.out.println("2. Use Potion");
        System.out.println("3. Run");
        System.out.println("\n====================================\n");
        System.out.print("Choose an action (1-3): ");
        int action = scanner.nextInt();
        try {
            if (action < 1 || action > 3) {
                throw new IllegalArgumentException("Action must be between 1 and 3.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + ": Uhh ohh! Let's try again.");
            return Menu();
        }
        return action;
    }

    public int Level1Battle(Pokemon thisPokemon, EnemyArray thisEnemyArray, Player thisplayer) {
        EnemyPokemon wildPokemon = thisEnemyArray.getEnemy((int)(Math.random() * thisEnemyArray.getSize()));
        System.out.println("Oh no! A wild "+ wildPokemon.getName()+" appeared!");
        switch (wildPokemon.getName()) {
            case "Ratata": 
            Display.RatataInfo();
                
                break;
            case "Caterpie":
            Display.CaterpieInfo();
                
                break;  
            case "Weedle":
            Display.WeedleInfo();
                
                break;  

            case "Spearow":
            Display.SpearowInfo();
                
                break;  
            case "JigglyPuff":
            Display.JigglypuffInfo();
                
                break;
            case "Pidgey":
            Display.PidgeyInfo();
                
                break;
            default:
                break;


        }
        while (thisPokemon.isFainted() == 0 && wildPokemon.isFainted() == 0) {
            int action = Menu();
            System.out.println("\n====================================\n");
            System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
            System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
            System.out.println("\n====================================\n");
            Simulation.pressEnterToContinue();
            switch (action) {
                case 1:
                    thisPokemon.fightPokemon(thisPokemon.getAttacks());
                    System.out.print("Select an attack (1-" + thisPokemon.getAttacks().length + "): ");
                    int attackChoice = scanner.nextInt() - 1;
                    if (attackChoice < 0 || attackChoice >= thisPokemon.getAttacks().length) {
                        System.out.println("Invalid choice! Try again.");
                        continue;
                    }
                    Attack selectedAttack = thisPokemon.getAttacks()[attackChoice];
                    System.out.println(thisPokemon.getName() + " used " + selectedAttack.getName() + "!");
                    wildPokemon.takeDamagefrom(selectedAttack);
                    if (wildPokemon.isFainted() == 1) {
                        System.out.println("You defeated the wild " + wildPokemon.getName() + "!");
                        Simulation.pressEnterToContinue();
                        return 0;
                    }
                   Buffer();
                    Attack wildAttack = wildPokemon.chooseRandomAttack();
                    System.out.println("Wild "+ wildPokemon.getName()+" used "+ wildAttack.getName()+"!");
                    thisPokemon.takeDamagefrom(wildAttack);
                Simulation.LoadingScreen();
                                System.out.println("\n====================================\n");
                System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
                System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
                System.out.println("\n====================================\n");
                Simulation.LoadingScreen();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(   thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 2:
                    thisPokemon.potionPokemon();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 3:
                    System.out.println(thisPokemon.getName() + " ran away!");
                    thisPokemon.runPokemon();
                    System.out.println("Your pokemon's HP is now: " + thisPokemon.getHP());
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    return 0;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }
        return 0;
    }
    public int Level2Battle(Pokemon thisPokemon, EnemyArray thisEnemyArray, Player thisplayer) {
        EnemyPokemon wildPokemon = thisEnemyArray.getEnemy((int)(Math.random()  * thisEnemyArray.getSize()));
        System.out.println("Oh no! A wild "+ wildPokemon.getName()+" appeared!");
        switch (wildPokemon.getName()) {
            case "Sandshrew": 
            Display.SandshrewInfo();
                
                break;
            case "Ekans":
            Display.EkansInfo();
                
                break;  
            case "Oddish":
            Display.OddishInfo();
                
                break;  

            case "Mankey":
            Display.MankeyInfo();
                
                break;  
            case "Meowth":
            Display.MeowthInfo();
                
                break;
            case "Bellsprout":
            Display.BellsproutInfo();
                
                break;
            default:
                break;
        }
        while (thisPokemon.isFainted() == 0 && wildPokemon.isFainted() == 0) {
            int action = Menu();
            System.out.println("\n====================================\n");
            System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
            System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
            System.out.println("\n====================================\n");
            Simulation.pressEnterToContinue();
            switch (action) {
                case 1:
                    thisPokemon.fightPokemon(thisPokemon.getAttacks());
                    System.out.print("Select an attack (1-" + thisPokemon.getAttacks().length + "): ");
                    int attackChoice = scanner.nextInt() - 1;
                    if (attackChoice < 0 || attackChoice >= thisPokemon.getAttacks().length) {
                        System.out.println("Invalid choice! Try again.");
                        continue;
                    }
                    Attack selectedAttack = thisPokemon.getAttacks()[attackChoice];
                    System.out.println(thisPokemon.getName() + " used " + selectedAttack.getName() + "!");
                    wildPokemon.takeDamagefrom(selectedAttack);
                    if (wildPokemon.isFainted() == 1) {
                        System.out.println("You defeated the wild " + wildPokemon.getName() + "!");
                        Simulation.pressEnterToContinue();
                        return 0;
                    }

                   Buffer();

                    Attack wildAttack = wildPokemon.chooseRandomAttack();
                    System.out.println("Wild "+ wildPokemon.getName()+" used "+ wildAttack.getName()+"!");
                    thisPokemon.takeDamagefrom(wildAttack);
                Simulation.LoadingScreen();
                                System.out.println("\n====================================\n");
                System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
                System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
                System.out.println("\n====================================\n");
                Simulation.LoadingScreen();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 2:
                    thisPokemon.potionPokemon();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 3:
                    System.out.println(thisPokemon.getName() + " ran away!");
                    thisPokemon.runPokemon();
                    System.out.println("Your pokemon's HP is now: " + thisPokemon.getHP());
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    return 0;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }
        return 0;
        

    }
    
    public int Level3Battle(Pokemon thisPokemon, EnemyArray thisEnemyArray, Player thisplayer) {
        EnemyPokemon wildPokemon = thisEnemyArray.getEnemy((int)(Math.random() * thisEnemyArray.getSize()));
        System.out.println("Oh no! A wild "+ wildPokemon.getName()+" appeared!");
        switch (wildPokemon.getName()) {
            case "Vulpix": 
            Display.VulpixInfo();
                
                break;
            case "Growlithe":
            Display.GrowlitheInfo();
                
                break;  
            case "Ekans":
            Display.EkansInfo();
                
                break;  

            case "Pidgey":
            Display.PidgeyInfo();
                
                break;  
            case "Meowth":
            Display.MeowthInfo();
                
                break;
            case "JigglyPuff":
            Display.JigglypuffInfo();
                
                break;
            default:
                break;
        }
        while (thisPokemon.isFainted() == 0 && wildPokemon.isFainted() == 0) {
            int action = Menu();
            System.out.println("\n====================================\n");
            System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
            System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
            System.out.println("\n====================================\n");
            Simulation.pressEnterToContinue();
            switch (action) {
                case 1:
                    thisPokemon.fightPokemon(thisPokemon.getAttacks());
                    System.out.print("Select an attack (1-" + thisPokemon.getAttacks().length + "): ");
                    int attackChoice = scanner.nextInt() - 1;
                    if (attackChoice < 0 || attackChoice >= thisPokemon.getAttacks().length) {
                        System.out.println("Invalid choice! Try again.");
                        continue;
                    }
                    Attack selectedAttack = thisPokemon.getAttacks()[attackChoice];
                    System.out.println(thisPokemon.getName() + " used " + selectedAttack.getName() + "!");
                    wildPokemon.takeDamagefrom(selectedAttack);
                    if (wildPokemon.isFainted() == 1) {
                        System.out.println("You defeated the wild " + wildPokemon.getName() + "!");
                        Simulation.pressEnterToContinue();
                        return 0;
                    }
                   Buffer();

                    Attack wildAttack = wildPokemon.chooseRandomAttack();
                    System.out.println("Wild "+ wildPokemon.getName()+" used "+ wildAttack.getName()+"!");
                    thisPokemon.takeDamagefrom(wildAttack);
                Simulation.LoadingScreen();
                                System.out.println("\n====================================\n");
                System.out.println(wildPokemon.getName() + " HP: " + wildPokemon.getHP());
                System.out.println(thisPokemon.getName() + " HP: " + thisPokemon.getHP());
                System.out.println("\n====================================\n");
                Simulation.LoadingScreen();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 2:
                    thisPokemon.potionPokemon();
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    break;
                case 3:
                    System.out.println(thisPokemon.getName() + " ran away!");
                    thisPokemon.runPokemon();
                    System.out.println("Your pokemon's HP is now: " + thisPokemon.getHP());
                    if (thisPokemon.isFainted() == 1) {
                        GameOver(thisplayer, thisPokemon);
                        return 1;
                    }
                    return 0;
                default:
                    System.out.println("Invalid action. Please choose again.");
            }
        }
        return 0;
    }
    public void rewardCoins(Player player) {
        int amount = (int)(Math.random() * 50) + 10;
        System.out.println("Congratulations! You finished your battle! \nYou earned " + amount + " coins as a reward!");
        player.addCoins(amount);
    }
}
