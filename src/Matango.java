public class Matango extends Monster{
     Matango(String name,char suffix,int hp){
         super();
         setName(name);
         setSuffix(suffix);
         setHp(hp);
     }
     public void attack(Creature target){
         System.out.println("お化けキノコ[" + getSuffix() + "]は体当たり攻撃！[" + target
                 + "に６のダメージを与えた！");
    }



}
