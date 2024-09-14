package MC_solidPrinciples.factory;

import MC_solidPrinciples.factory.components.button.Button;
import MC_solidPrinciples.factory.components.button.MacButton;
import MC_solidPrinciples.factory.components.dropdown.Dropdown;
import MC_solidPrinciples.factory.components.dropdown.MacDropdown;
import MC_solidPrinciples.factory.components.menu.MacMenu;
import MC_solidPrinciples.factory.components.menu.Menu;
import MC_solidPrinciples.factory.components.search.MacSearch;
import MC_solidPrinciples.factory.components.search.Search;

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
    public Dropdown createDropDown() {
        return new MacDropdown();
    }

    @Override
    public Search createSearch() {
        return new MacSearch();
    }
}
