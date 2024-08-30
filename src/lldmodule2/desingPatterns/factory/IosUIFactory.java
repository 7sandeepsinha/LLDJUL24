package lldmodule2.desingPatterns.factory;

import lldmodule2.desingPatterns.factory.components.button.Button;
import lldmodule2.desingPatterns.factory.components.button.IosButton;
import lldmodule2.desingPatterns.factory.components.dropdown.Dropdown;
import lldmodule2.desingPatterns.factory.components.dropdown.IosDropDown;
import lldmodule2.desingPatterns.factory.components.menu.IosMenu;
import lldmodule2.desingPatterns.factory.components.menu.Menu;
import lldmodule2.desingPatterns.factory.components.scrollWheel.IosScrollWheel;
import lldmodule2.desingPatterns.factory.components.scrollWheel.ScrollWheel;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new IosScrollWheel();
    }
}
