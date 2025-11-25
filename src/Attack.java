import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Attack {
    private static final Set<String> VALID_TYPES = new HashSet<>(Arrays.asList(
        "Normal", "Fire", "Water", "Grass", "Flying", "Dark", "Bug", "Electric", "Fairy", "Fighting", "Ghost", "Ground", "Ice", "Poison", "Psychic", "Rock", "Steel", "Dragon"
    ));
    private String name;
    private int damage;
    private String type;


    public Attack(String name, int damage, String type) {
        if (name == null || type == null) {
            throw new IllegalArgumentException("Name and type cannot be null");
        }
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative");
        }
        if (!VALID_TYPES.contains(type)) {
            throw new IllegalArgumentException("Invalid Pokemon type: " + type);
        }
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage(Pokemon victim) {
        if (victim == null) {
            throw new IllegalArgumentException("Target pokemon cannot be null");
        }

        double baseDamage = damage * 1.0;
        int defenseValue = victim.getDefense();
    
        double defenseMultiplier = Math.max(0.1, 1.0 - (defenseValue / 100.0));
        double randomMultiplier = Math.random() * 0.15 + 0.85;
        
        int calcDamage = (int)(baseDamage * defenseMultiplier * randomMultiplier);
        return Math.max(1, calcDamage); 
    }

    public String getType() {
        return type;
    }
}