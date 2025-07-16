package creature.character;
import creature.Creature;
import creature.Creature;

public class SuperHero extends Hero{

    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getHp(),hero.getWeapon());//SuperHeroのコンストラクタとして親クラスのコンストラクタを呼び出す
        System.out.println("勇者はスーパーヒーローに進化した！");
    }

    @Override
    public void attack(Creature target){
        //super.attack(target);
        System.out.println(this.getName() + "は" + this.getWeapon() + "で攻撃！" + target.getName() + "に25のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }


}
