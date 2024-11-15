public class RPG {
    public static void drawFight(Role role) {
        System.out.print(role.getName());
        role.fight();
    }

    public static void main(String[] args) {
        var swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);
        //System.out.printf("劍士:(%S, %d, %d)%n",swordsMan.getName(),swordsMan.getLevel(),swordsMan.getBlood());
        System.out.println(swordsMan);
        swordsMan.fight();
    }
    static void demoMagician(){

        var magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
       // System.out.printf("魔法師:(%S, %d, %d)%n",magician.getName(),magician.getLevel(),magician.getBlood());
        System.out.println(magician);
        magician.fight();
        magician.cure();

    }
}
