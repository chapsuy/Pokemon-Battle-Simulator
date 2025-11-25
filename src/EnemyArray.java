public class EnemyArray{
    private EnemyPokemon[] enemies;

    public EnemyArray() {  // Constructor for Level 1
        enemies = new EnemyPokemon[6];
    }

    public EnemyPokemon[] initLevel1() {
        enemies[0] = new EnemyPokemon("Pidgey", 50, new Attack[]{
            new Attack("Tackle", 8, "Normal"),
            new Attack("Gust", 9, "Flying"),
		new Attack("Quick Attack", 15, "Normal"),
        }, "Normal", 5);


        enemies[1] = new EnemyPokemon("Ratata", 50, new Attack[]{
            new Attack("Bite", 9, "Dark"),
            new Attack("Quick Attack", 10, "Normal"),
		new Attack("Crunch", 15, "Dark"),
        }, "Normal", 4);


        enemies[2] = new EnemyPokemon("Caterpie", 45, new Attack[]{
            new Attack("Tackle", 8, "Normal"),
            new Attack("String Shot", 5, "Bug"),
		new Attack("Bug Bite", 15, "Bug"),
        }, "Bug", 3);


	  enemies[3] = new EnemyPokemon("Weedle", 45, new Attack[]{
            new Attack("Poison Sting", 10, "Normal"),
            new Attack("String Shot", 8, "Bug"),
		new Attack("Bug Bite", 15, "Bug"),
        }, "Bug", 3);


	  enemies[4] = new EnemyPokemon("Spearow", 50, new Attack[]{
            new Attack("Peck", 7, "Flying"),
            new Attack("Leer", 6, "Normal"),
		new Attack("Wing Attack", 15, "Flying"),
        }, "Normal/Flying", 5);


	  enemies[5] = new EnemyPokemon("JigglyPuff", 55, new Attack[]{
            new Attack("Pound", 12, "Normal"),
            new Attack("Disarming Voice", 6, "Fairy"),
		new Attack("Body Slam", 15, "Normal"),
        }, "Normal", 6);

        return enemies;    }


public EnemyPokemon[] initLevel2() {
	  enemies[0] = new EnemyPokemon("Ekans", 60, new Attack[]{
            new Attack("Poison Sting", 12, "Poison"),
            new Attack("Bite", 10, "Dark"),
		new Attack("Acid", 15, "Poison"),
        }, "Poison", 8);


	  enemies[1] = new EnemyPokemon("Sandshrew", 65, new Attack[]{
            new Attack("Rollout", 10, "Rock"),
            new Attack("Scratch", 9, "Normal"),
		new Attack("Bulldoze", 15, "Ground"),
        }, "Ground", 8);


	  enemies[2] = new EnemyPokemon("Oddish", 60, new Attack[]{
            new Attack("Absorb", 9, "Grass"),
            new Attack("Acid", 10, "Poison"),
		new Attack("Mega Drain", 15, "Grass"),
        }, "Grass", 7);


	  enemies[3] = new EnemyPokemon("Mankey", 65, new Attack[]{
            new Attack("Covet", 9, "Normal"),
            new Attack("Low Kick", 11, "Fighting"),
		new Attack("Cross Chop", 15, "Fighting"),
        }, "Fighting", 8);


	  enemies[4] = new EnemyPokemon("Meowth", 65, new Attack[]{
            new Attack("Scratch", 10, "Normal"),
            new Attack("Feint", 8, "Normal"),
		new Attack("Pay Day", 15, "Normal"),
        }, "Normal", 6);


	  enemies[5] = new EnemyPokemon("Bellsprout", 60, new Attack[]{
            new Attack("Vine Whip", 10, "Grass"),
            new Attack("Poison Powder", 12, "Poison"),
		new Attack("Knock Off", 15, "Dark"),
        }, "Grass", 6);
        return enemies;
    } 


public EnemyPokemon[] initLevel3() {
	  enemies[0] = new EnemyPokemon("Vulpix", 70, new Attack[]{
            new Attack("Ember", 9, "Fire"),
            new Attack("Quick Attack", 10, "Normal"),
		new Attack("Flamethrower", 15, "Fire"),
        }, "Fire", 9);


	  enemies[1] = new EnemyPokemon("Growlithe", 65, new Attack[]{
            new Attack("Ember", 10, "Fire"),
            new Attack("Bite", 12, "Normal"),
		new Attack("Retaliate", 15, "Normal"),
        }, "Fire", 9);


	  enemies[2] = new EnemyPokemon("Ekans", 70, new Attack[]{
            new Attack("Acid", 13, "Poison"),
            new Attack("Wrap", 12, "Normal"),
		new Attack("Sludge Bomb", 15, "Poison"),
        }, "Poison", 9);


	  enemies[3] = new EnemyPokemon("Pidgey", 70, new Attack[]{
            new Attack("Sand Attack", 10, "Ground"),
            new Attack("Quick Attack", 12, "Normal"),
		new Attack("Wing Attack", 15, "Flying"),
        }, "Flying", 8);
	 
	  enemies[4] = new EnemyPokemon("Meowth", 65, new Attack[]{
            new Attack("Pay Day", 12, "Normal"),
            new Attack("Bite", 13, "Dark"),
		new Attack("Slash", 15, "Normal"),
        }, "Normal", 8);


	  enemies[5] = new EnemyPokemon("JigglyPuff", 68, new Attack[]{
            new Attack("Body Slam ", 12, "Normal"),
            new Attack("Echoed Voice", 14, "Normal"),
		new Attack("Covet", 15, "Normal"),
        }, "Normal", 8);
        return enemies;

    }

    

    public EnemyPokemon getEnemy(int index) {
        if (index < 0 || index >= enemies.length) {
            return null;
        }
        return enemies[index];
    }

    public int getSize() {
        return enemies.length;
    }
}