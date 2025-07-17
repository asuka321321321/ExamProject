public class Matango extends Monster {
     public Matango(char suffix,int hp){
         super("お化けキノコ",suffix,hp);
     }

     @Override
     public void attack(Creature target){
         System.out.println("お化けキノコ" + getSuffix() + "は体当たり攻撃！" + target.getName() + "に６のダメージを与えた！");
         target.setHp(target.getHp()-6);

     }
}
