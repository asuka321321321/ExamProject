import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        ArrayList<Character> party = new ArrayList<Character>();

        Hero h = new Hero("勇者", 100,"剣");
        Wizard w = new Wizard("魔法使い",60);
        Thief t = new Thief("盗賊",70);

        party.add(h);
        party.add(w);
        party.add(t);

        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Goblin g = new Goblin("ゴブリン",'A',50);
        Matango m = new Matango("マタンゴ",'A',45);
        Slime s = new Slime("スライム",'A',40);

        monsters.add(g);
        monsters.add(m);
        monsters.add(s);


        h.showStatus();
        w.showStatus();
        t.showStatus();
        g.showStatus();
        m.showStatus();
        s.showStatus();




    }
}
