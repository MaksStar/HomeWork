package Coffee;

public class machinedOne {
    public String w, e;
    String q = "Эспрессо";
    public String cof1() {
        return q;
    }
    public String cof2() {
        w = q + " с добавлением воды";
        return w;
    }
    public String cof3(){
        e = q + " c добавлением вспенненного молока";
        return e;
    }
}