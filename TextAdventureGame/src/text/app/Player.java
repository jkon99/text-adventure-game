package text.app;


// defines player class and attributes associated with them
// created and set up by Jonathan Konopka (jkon99)

public class Player {
	
	private int HP;
    private int maxHP;
    private int xp;
    private int atk;
    private int def;
    private int lvl;

    private int numPotions;

    public Player(){
        HP = maxHP;
        lvl = 1;
        
    }

    public int getHp(){
        return HP;
    }

    public void setHP(int hp){
        HP = hp;
    }
    
    public boolean isAlive(){
        return HP > 0;
    }
    
    public void heal(){
        if(numPotions > 0){
            numPotions--;
            HP = maxHP;
        }
    }
    
    //implement logic to level up and adjust stats
    //combat, encounter and game over conditions could be part of player or in game? maybe need new class for monster
    
}
