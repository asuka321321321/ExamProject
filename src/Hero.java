public class Hero extends Character{
    private String name;
    private int hp;
    private String weapon;

    Hero(String name,int hp,String weapon){
        super("勇者",100);
        setName(name);
        setHp(hp);
        setWeapon(weapon);
        //this.name = getName();
        //this.hp = getHp();
        //this.weapon  = getWeapon();
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！" + target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }
}
