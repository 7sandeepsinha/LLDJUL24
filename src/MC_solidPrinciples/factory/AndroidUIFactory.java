package MC_solidPrinciples.factory;

import MC_solidPrinciples.factory.components.button.AndroidButton;
import MC_solidPrinciples.factory.components.button.Button;
import MC_solidPrinciples.factory.components.dropdown.AndroidDropdown;
import MC_solidPrinciples.factory.components.dropdown.Dropdown;
import MC_solidPrinciples.factory.components.menu.AndroidMenu;
import MC_solidPrinciples.factory.components.menu.Menu;
import MC_solidPrinciples.factory.components.search.AndroidSearch;
import MC_solidPrinciples.factory.components.search.Search;

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
    public Dropdown createDropDown() {
        return new AndroidDropdown();
    }

    @Override
    public Search createSearch() {
        return new AndroidSearch();
    }
}
