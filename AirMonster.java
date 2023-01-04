class AirMonster extends Monster {

    public AirMonster(String name, int damage) {
        super(name, damage, "air");
    }

    public boolean attack(Monster opponent) {
        opponent.setLife(opponent.getLife() - getDamage());

        // si water, on attaque une 2eme fois

        // if (opponent instanceof WaterMonster) {
        if (opponent.getType().equalsIgnoreCase("water")) {
            opponent.setLife(opponent.getLife() - getDamage());
        }

        return opponent.isKO();
    }

}