package abstractPattern;

public class LightThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new LightThemeCheckbox();
    }
}
