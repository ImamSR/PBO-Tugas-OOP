public class SecondCharac extends Character {
    private int physicalDamage;

    public SecondCharac (int HP, int basicAttack, int skillDamage, int physicalDamage){
        super(HP, basicAttack, skillDamage);
        this.physicalDamage = physicalDamage;
    }

    public int getMovementSpeed(){
        return physicalDamage;
    }

    public void ultimateSkill(){
        System.out.println("Biarkan pedangku menusuk hingga jantungmu!");
    }

}