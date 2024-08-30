package lldmodule2.desingPatterns.factory;

import lldmodule2.desingPatterns.factory.components.button.Button;
import lldmodule2.desingPatterns.factory.components.button.IosButton;
import lldmodule2.desingPatterns.factory.components.button.MacButton;
import lldmodule2.desingPatterns.factory.components.dropdown.Dropdown;
import lldmodule2.desingPatterns.factory.components.dropdown.IosDropDown;
import lldmodule2.desingPatterns.factory.components.dropdown.MacDropDown;
import lldmodule2.desingPatterns.factory.components.menu.IosMenu;
import lldmodule2.desingPatterns.factory.components.menu.MacMenu;
import lldmodule2.desingPatterns.factory.components.menu.Menu;
import lldmodule2.desingPatterns.factory.components.scrollWheel.IosScrollWheel;
import lldmodule2.desingPatterns.factory.components.scrollWheel.MacScrollWheel;
import lldmodule2.desingPatterns.factory.components.scrollWheel.ScrollWheel;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new MacScrollWheel();
    }
}
