public class FieldBattle {
    public static void main(String[] args) {
        SecondCharac SecondCharac = new SecondCharac(100, 40, 30, 50);
        MainCharac MainCharac = new MainCharac(80, 5, 50, 50);

        System.out.println("SecondCharac HP: " + SecondCharac.getHP());
        System.out.println("MainCharac HP: " + MainCharac.getHP());

        MainCharac.takeDamage(SecondCharac.getBasicAttack());
        System.out.println("SecondCharac menyerang MainCharac memberikan " + SecondCharac.getBasicAttack() + " damage. MainCharac HP: " + MainCharac.getHP());
        
        SecondCharac.takeDamage(MainCharac.getSkillDamage());
        System.out.println("MainCharac menyerang SecondCharac memberikan " + SecondCharac.getSkillDamage() + " damage. SecondCharac HP: " + MainCharac.getHP());

        SecondCharac.ultimateSkill();
        MainCharac.takeDamage(15);
        System.out.println("SecondCharac menggunakan ultimate skill dan memberi damage 15. MainCharac HP: " + MainCharac.getHP());

        MainCharac.skillUse();
        SecondCharac.takeDamage(25);
        System.out.println("MainCharac menggunakan ultimate skill dan memberikan damage 25. SecondCharac HP: " + SecondCharac.getHP());
    }
}