package WzorceKreacyjne.FabrykaAbstrakcyjna;

public class Main {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("win")){
            factory = new WindowsFactory();

        }else {
            factory = new MacOSFactory();

        }
        app = new Application(factory);
        return app;
    }
    public static void main (String args[]){
        Application app = configureApplication();
        app.paint();
    }
}
