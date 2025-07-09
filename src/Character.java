public abstract class Character implements Creature{
    String name;
    int hp;

    Character(String name,int hp){
        this.name = getName();
        this.hp = getHp();
    }

    public Character() {

    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHp(){
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした。");
        }
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public final boolean isAlive(){
        return this.hp > 0;
    }

    public void showStatus(){
        System.out.println("[" + this.name + "]:HP[" + this.hp + "]");
    }




}
