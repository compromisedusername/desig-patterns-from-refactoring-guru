package WzorceKreacyjne.MetodaWytworcza;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
