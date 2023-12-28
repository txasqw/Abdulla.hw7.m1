public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        medic.setHealPoints(20);
        HavingSuperAbility[] heroes = {warrior, magic, medic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                ( (Medic)heroes[i]).increaceExperience();
                System.out.println("медик увеличил опыт : " + ((Medic) heroes[i]).getHealPoints());
            }
        }
    }
    }
