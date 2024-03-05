package WzorceKreacyjne.Singleton;

public class Singiel {
    private String name;
    private static Singiel instance;
    private Singiel(String name){
        this.name = name;
    }
    public static Singiel getInstance(){
        if(instance == null){
            instance = new Singiel("kurczak");
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
