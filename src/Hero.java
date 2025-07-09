public abstract class Hero extends Character{
    private String name;
    private int hp;
    private String weapon;
    Hero(){
        super();
        this.name = getName();
        this.hp = getHp();
        this.weapon = getWeapon();
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getHp() {
        return hp;
    }
    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
