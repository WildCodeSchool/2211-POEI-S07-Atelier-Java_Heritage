class Arena {

    public static void main(String[] args) {

        Monster roucoul = new AirMonster("Roucoul", 2);
        Monster salameche = new FireMonster("Salameche", 3);
        Monster carapuce = new WaterMonster("Carapuce", 3);

        boolean oneIsDead = false;

        while (!oneIsDead) {
            oneIsDead = salameche.attack(carapuce);
            if (!oneIsDead) {
                oneIsDead = carapuce.attack(salameche);
            }
        }

        oneIsDead = false;

        while (!oneIsDead) {
            oneIsDead = roucoul.attack(carapuce);
            if (!oneIsDead) {
                oneIsDead = carapuce.attack(roucoul);
            }
        }

    }
}