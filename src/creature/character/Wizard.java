package creature.character;

import creature.Character;
import creature.Creature;

public class Wizard extends Character {
    int mp;

    public Wizard(String name,int hp){
        super(name,hp);
    }
    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }

    @Override
    public void attack(Creature target){
        System.out.println(getName() + "は火の玉を放った！" + target.getName() + "に３のダメージを与えた！");
        this.setMp(this.getMp()-1);
        target.setHp(target.getHp()-3);

    }
}
