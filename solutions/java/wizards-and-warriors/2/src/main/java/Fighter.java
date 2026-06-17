class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
     int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean flag = false;
    
    @Override
    boolean isVulnerable() {
        return !flag;
    }

    void prepareSpell(){
        flag = true;
    }

    @Override
     int getDamagePoints(Fighter fighter) {
         int damage = flag ? 12 : 3;
         flag = false;
        return damage;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}