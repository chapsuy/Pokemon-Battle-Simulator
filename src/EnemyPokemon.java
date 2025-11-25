public class EnemyPokemon extends Pokemon {
    public EnemyPokemon(String name, int HP, Attack[] attacks, String type, int Defense) {
        super(name, HP, attacks, type, Defense);
    }

    public Attack chooseRandomAttack() {
        Attack[] attacks = getAttacks();
        if (attacks == null || attacks.length == 0) {
            // No attacks available
            System.out.println(getName() + " has no attacks to choose from.");
            return null;
        }
        int index = (int)(Math.random() * attacks.length);
        return attacks[index];
    }
}
