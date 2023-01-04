class FireMonster extends Monster {

    public FireMonster(String name, int damage) {
        super(name, damage, "fire");
    }

    public boolean attack(Monster opponent) {
        opponent.setLife(opponent.getLife() - getDamage());

        // si air, on attaque une 2eme fois

        // if (opponent instanceof AirMonster) {
        if (opponent.getType().equalsIgnoreCase("air")) {
            opponent.setLife(opponent.getLife() - getDamage());
        }

        return opponent.isKO();
    }

}