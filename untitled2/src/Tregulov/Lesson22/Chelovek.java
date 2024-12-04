package Tregulov.Lesson22;

public class Chelovek {
    final String pol;
    Chelovek (String pol) {
        this.pol = pol;
    }
    private boolean clever;
    public boolean isClever() {
        return clever;
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    private int vozrast;
    public int getVozrast() {
        return vozrast;
    }
    public void setVozrast (int i) {
        if (i > 0) {
            vozrast = i;
        }
    }
    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int i) {
        if (i > 0);
        ves = i;
    }
}
class Test{
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVes(50);
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}


