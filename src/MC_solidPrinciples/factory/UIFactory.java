package MC_solidPrinciples.factory;

import MC_solidPrinciples.factory.components.button.Button;
import MC_solidPrinciples.factory.components.dropdown.Dropdown;
import MC_solidPrinciples.factory.components.menu.Menu;
import MC_solidPrinciples.factory.components.search.Search;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropDown();
    Search createSearch();
}
//abstract factory