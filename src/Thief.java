public class Thief extends Character{

    public Thief(String name, int hp) {
        super("盗賊",70);
        setName(name);
        setHp(hp);
    }

    @Override
    public void attack(Creature target){
        System.out.println(this.getName() + "は素早く攻撃した！" + target.getName() + "に５のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}
