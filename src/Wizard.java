public abstract class Wizard extends Character{
    int mp;

    Wizard(){
        super();
        this.name = getName();
        this.hp = getHp();
        this.mp = getMp();
    }
    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }
    public void attack(Creature target){
        System.out.println("[" + this.name + "]は火の玉を放った！[" + target + "]に３のダメージを与えた！");
        this.mp -= 1;
        this.hp -= 3;

    }
}
