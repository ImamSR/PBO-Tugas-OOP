public class MainCharac extends Character {
    private int magicDamage;

    public MainCharac (int HP, int basicAttack, int skillDamage, int magicDamage){
        super(HP, basicAttack, skillDamage);
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage(){
        return magicDamage;
    }

    public void skillUse(){
        System.out.println("aku akan menghancurkanmu!");
    }
}