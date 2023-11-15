public class Main {
    public static void main(String[] args) {
        Hero myHero = new Hero(200, 50, "Каменная кожа");
        System.out.println("Уровень здоровья: " + myHero.getHealth() + " Урон героя: "
                + myHero.getDamage() +
                " Суперспособность: " + myHero.getSuperpower());

        Hero yourHero = new Hero(300, 25);
        System.out.println("Уровень здоровья: " + yourHero.getHealth() +
                " Урон героя: " + yourHero.getDamage());

        Boss angryBoss = new Boss();

        System.out.println("Уровень здоровья: " + angryBoss.setHealth() +
                " Уровень атаки: " + angryBoss.setDamage() + " Защита: " + angryBoss.setDefence());
    }
}