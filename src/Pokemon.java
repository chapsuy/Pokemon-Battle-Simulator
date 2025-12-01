import java.util.Arrays;

public class Pokemon {
    private String name;
    private int HP;
    private int maxHP;
    private Attack[] attacks;
    private String type;
    private int Defense;
    private boolean potionUsed = false;

    public Pokemon(String name, int HP, Attack[] attacks, String type, int Defense) {
        if (name == null || attacks == null || type == null) {
            throw new IllegalArgumentException("Name, attacks, and type cannot be null");
        }
        if (HP <= 0 || Defense < 0) {
            throw new IllegalArgumentException("HP must be positive and Defense must be non-negative");
        }
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;  // Store initial HP as maximum
        this.attacks = Arrays.copyOf(attacks, attacks.length);  // Create a defensive copy
        this.type = type;
        this.Defense = Defense;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }
    
    public int getDefense() {
        return Defense;
    }

    public void takeDamagefrom(Attack attack) {
        if (attack == null) {
            System.out.println(getName() + " received no attack (null) — no damage applied.");
            return;
        }
        int damage = attack.getDamage(this);  
        if (type.equals("Fire") && attack.getType().equals("Grass")) {
            System.out.println("It's super effective!");
            damage *= 2; // Super effective
        } else if (type.equals("Water") && attack.getType().equals("Fire")) {
            System.out.println("It's super effective!");
            damage *= 2; // Super effective
        } else if (type.equals("Grass") && attack.getType().equals("Water")) {
            System.out.println("It's super effective!");
            damage *= 2; // Super effective
        } else if (type.equals("Bug" ) && attack.getType().equals("Fire")) {
            System.out.println("It's not very effective...");
            damage /= 2; // NOT effective
        } else if (type.equals("Fire") && attack.getType().equals("Bug")) {
            System.out.println("It's super effective!");
            damage *= 2; // Super effective
        } else if (!type.equals("Normal") || !attack.getType().equals("Normal")) {
            System.out.println("It's not very effective...");
            damage /= 2; // NOT effective
        }
        HP -= damage;
        if (HP < 0) HP = 0;
    }

    public Attack[] getAttacks() {
        return Arrays.copyOf(attacks, attacks.length);  // Return a copy to prevent modification
    }

    public int runPokemon() {
        HP = HP - (int)(Math.random() * 21 + 25); // Random damage between 25 and 45
        if (HP < 0) HP = 0;  
        return HP;  
    }
    public void fightPokemon(Attack[] attacks) {
        if (attacks == null || attacks.length == 0) {
            System.out.println(name + " has no attacks available!");
            return;
        }
        System.out.println(name + " is ready to fight! Select an attack:");
        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i] != null) {
                System.out.println("Attack " + (i + 1) + ": " + attacks[i].getName());
            }
        }
}
    public int isFainted() {
        if (HP <= 0) {
            System.out.println(name + " has fainted!");
            return 1;
        }
        return 0;
    }
    public String getType() {
        return type;
    }
    public void potionPokemon() {
        if(!potionUsed) {  // Simplified condition
            int healAmount = 15;
            if (HP + healAmount > maxHP) {
                int actualHeal = maxHP - HP;
                HP = maxHP;
                System.out.println(name + " recovered " + actualHeal + " HP! HP is now max!");
            } else {
                HP += healAmount;
                System.out.println(name + " recovered " + healAmount + " HP!");
            }
        } else {
            System.out.println("Potion has already been used!");
        }
        potionUsed = true;
    }
   
    }



