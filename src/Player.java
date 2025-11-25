public class Player {
    private String name;
    private int coins;
    private Pokemon pokemon; 
    
    public Player(String name, int coins) {
        this.name = name;
        this.coins = coins;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCoins() {
        return coins;
    }
    
    public Pokemon getPokemon() {
        return pokemon;
    }
    
    // Methods
    public void addCoins(int amount) {
        this.coins += amount;
        System.out.println("Added " + amount + " coins. Total: " + this.coins);
    }
    
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}