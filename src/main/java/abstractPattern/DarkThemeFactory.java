package abstractPattern;

public class DarkThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkThemedButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new DarkThemeCheckBox();
    }
}
