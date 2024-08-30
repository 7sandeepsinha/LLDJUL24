package lldmodule2.desingPatterns.factory;

import lldmodule2.desingPatterns.factory.components.button.AndroidButton;
import lldmodule2.desingPatterns.factory.components.button.Button;
import lldmodule2.desingPatterns.factory.components.dropdown.AndroidDropDown;
import lldmodule2.desingPatterns.factory.components.dropdown.Dropdown;
import lldmodule2.desingPatterns.factory.components.menu.AndroidMenu;
import lldmodule2.desingPatterns.factory.components.menu.Menu;
import lldmodule2.desingPatterns.factory.components.scrollWheel.AndroidScrollWheel;
import lldmodule2.desingPatterns.factory.components.scrollWheel.ScrollWheel;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new AndroidScrollWheel();
    }
}
