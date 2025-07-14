public class Goblin extends Monster {
    Goblin(String name,char suffix,int hp) {
        setName(name);
        setSuffix(suffix);
        setHp(hp);
        //this.suffix = getSuffix();
        //this.hp = getHp();
    }
    public void attack(Creature target){
        System.out.println("ゴブリン" + getSuffix() + "はナイフで切りつけた！" + target.getName() + "に８のダメージを与えた！");
        target.setHp(target.getHp()-8);
    }

}