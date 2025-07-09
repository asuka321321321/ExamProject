public class SuperHero extends Hero{

    public void superHero(Hero hero){
        super(hero.name,hero.hp,hero.weapon);
    }

    public void attack(Creature target){
        super.attack(target);
        System.out.println("[" + this.name + "]は[" + this.weapon + "]で攻撃！[" + this.target + "]に２５のダメージを与えた！");
        target.this.hp = target.this.hp-25;
    }


}
