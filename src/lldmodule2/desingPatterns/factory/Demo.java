package lldmodule2.desingPatterns.factory;

import lldmodule2.desingPatterns.factory.components.button.Button;
import lldmodule2.desingPatterns.factory.components.dropdown.Dropdown;
import lldmodule2.desingPatterns.factory.components.menu.Menu;
import lldmodule2.desingPatterns.factory.components.scrollWheel.ScrollWheel;

public class Demo {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.setSupportPlatform(SupportPlatform.MAC);

        //app building code
        UIFactory uiFactory = flutter.getUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        ScrollWheel scrollWheel = uiFactory.createScrollWheel();
    }
}
