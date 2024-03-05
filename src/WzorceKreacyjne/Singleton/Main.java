package WzorceKreacyjne.Singleton;

public class Main {
    public static void main(String[] args) {
        Singiel s = Singiel.getInstance();
        Singiel d = Singiel.getInstance();
        System.out.println(s.getName());
        System.out.println(d.getName());
        System.out.println(s==d);
    }
}
