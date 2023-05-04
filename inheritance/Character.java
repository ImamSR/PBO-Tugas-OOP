public class Character {
    private int HP;
    private int basicAttack;
    private int skillDamage;

    public Character(int HP, int basicAttack, int skillDamage){
        this.HP = HP;
        this.basicAttack = basicAttack;
        this.skillDamage = skillDamage;
    }

    public int getHP(){
        return HP;
    }

    public int getBasicAttack(){
        return basicAttack;
    }

    public int getSkillDamage(){
        return skillDamage;
    }

    public void takeDamage(int damage){
        HP -= damage;
        if (HP < 0){
            HP = 0;
        }
    }
}
