class WaterMonster extends Monster {

    public WaterMonster(String name, int damage) {
        super(name, damage, "water");
    }

    public boolean attack(Monster opponent) {
        opponent.setLife(opponent.getLife() - getDamage());

        // si fire, on attaque une 2eme fois

        // if (opponent instanceof FireMonster) {
        if (opponent.getType().equalsIgnoreCase("fire")) {
            opponent.setLife(opponent.getLife() - getDamage());
        }

        return opponent.isKO();
    }

}