public abstract class SuperHero extends Hero{

    public SuperHero(Hero hero) {
        super(hero.getName(),hero.getHp(),hero.getWeapon());//SuperHeroのコンストラクタとして親クラスのコンストラクタを呼び出す
    }

    public void attack(Creature target){
        super.attack(target);
        System.out.println("[" + this.getName() + "]は[" + this.getWeapon() + "]で攻撃！" +
                "[" + target + "]に２５のダメージを与えた！");
        target.setHp(target.getHp()-25);
    }


}
