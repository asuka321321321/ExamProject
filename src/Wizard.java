public class Wizard extends Character{
    int mp;

    Wizard(String name,int hp){
        super("魔法使い",60);
        setName(name);
        setHp(hp);
    }
    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }


    public void attack(Creature target){
        System.out.println("[" + getName() + "]は火の玉を放った！[" + target + "]に３のダメージを与えた！");
        this.mp -= 1;
        target.setHp(target.getHp()-5);

    }
}
