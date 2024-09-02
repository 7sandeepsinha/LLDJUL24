package lldmodule2.desingPatterns.factory;

import lldmodule2.desingPatterns.factory.components.button.Button;
import lldmodule2.desingPatterns.factory.components.dropdown.Dropdown;
import lldmodule2.desingPatterns.factory.components.menu.Menu;
import lldmodule2.desingPatterns.factory.components.scrollWheel.ScrollWheel;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
    ScrollWheel createScrollWheel();
}
