class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() == false ? 6 : 10;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean ispreparedspell = false;
    public String toString(){
        return "Fighter is a Wizard";
    }

    void prepareSpell(){
        this.ispreparedspell = true;
    }

    @Override
    boolean isVulnerable(){
        return !ispreparedspell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return ispreparedspell == false ? 3 : 12;
    }
}
