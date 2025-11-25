

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- Simulation start ---\n");

        Simulation simulation = new Simulation();
        String playerName = simulation.WelcomeMessage();

        Player player = new Player(playerName, 100);


        Pokemon starterPokemon = simulation.chooseStarterPokemon();
        System.out.println("Great choice! " + starterPokemon.getName() + " is ready for battle!");
        Simulation.pressEnterToContinue();

        Simulation.GameBriefing();
        while (starterPokemon.isFainted() == 0) {

        Simulation.LoadingScreen();
        simulation.Level1briefing();
        Simulation.pressEnterToContinue();
        /// Level 1 Battle Loop
        EnemyArray Level1Enemies = new EnemyArray();
        Level1Enemies.initLevel1();
            int flag1 = simulation.Level1Battle(starterPokemon, Level1Enemies, player);
            if (flag1 == 1) {
                break;
            } else {
                player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                    System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                int flag2 = simulation.Level1Battle(starterPokemon, Level1Enemies, player);
                if (flag2 == 1) {
                    break;
                } else {
                    player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                    System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                    simulation.Victory1();
                }
            }

        
        
        Simulation.LoadingScreen();
        simulation.Level2briefing();
        /// Level 2 Battle Loop
        EnemyArray Level2Enemies = new EnemyArray();
        Level2Enemies.initLevel2();
            int flag3 = simulation.Level2Battle(starterPokemon, Level2Enemies, player);
            if (flag3 == 1) {
                break;
            } else {
                player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                int flag4 = simulation.Level2Battle(starterPokemon, Level2Enemies, player);
                if (flag4 == 1) {
                    break;
                } else {
                    player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                    System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                    int flag5 = simulation.Level2Battle(starterPokemon, Level2Enemies, player);
                    if (flag5 == 1) {
                        break;
                    } else {
                        player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                    System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                        simulation.Victory2();
                }
            }
        }


    
        Simulation.LoadingScreen();
        simulation.Level3briefing();
        Simulation.pressEnterToContinue();
        /// Level 3 Battle Loop



	   EnemyArray Level3Enemies = new EnemyArray();
        Level3Enemies.initLevel3();
            int flag6 = simulation.Level3Battle(starterPokemon, Level3Enemies, player);
            if (flag6 == 1) {
                break;
            } else {
                player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                int flag7 = simulation.Level3Battle(starterPokemon, Level3Enemies, player);
                if (flag7 == 1) {
                    break;
                } else {
                    player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                    System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                    int flag8 = simulation.Level3Battle(starterPokemon, Level3Enemies, player);
                    if (flag8 == 1) {
                        break;
                    } else {
                        player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                        System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                        int flag9 = simulation.Level3Battle(starterPokemon, Level3Enemies, player);
                        if (flag9 == 1) {
                            break;
                        } else {
                            player.addCoins((int)(Math.random() * 51) + 50); // Reward coins between 50 and 100
                            System.out.println("Congratulations! You now have " + player.getCoins() + " coins.");
                            simulation.Victory3();
                            simulation.FinalVictory(player, starterPokemon);

                            break;
                        }
                
            }


        }

        ///        // System.out.println("\n--- Simulation end ---");
}
    
        }
        System.out.println("\n--- Simulation end ---");
    }
}
