package abstractPattern;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory uiFactory){
        this.button=uiFactory.createButton();
        this.checkbox=uiFactory.createCheckBox();
    }

    public void render(){
        button.click();
        checkbox.check();
    }
}
