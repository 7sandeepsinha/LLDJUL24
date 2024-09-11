package MC_solidPrinciples.factory;

import MC_solidPrinciples.factory.components.button.Button;
import MC_solidPrinciples.factory.components.button.IosButton;
import MC_solidPrinciples.factory.components.dropdown.Dropdown;
import MC_solidPrinciples.factory.components.dropdown.IosDropdown;
import MC_solidPrinciples.factory.components.menu.IosMenu;
import MC_solidPrinciples.factory.components.menu.Menu;
import MC_solidPrinciples.factory.components.search.IosSearch;
import MC_solidPrinciples.factory.components.search.Search;

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
    public Dropdown createDropDown() {
        return new IosDropdown();
    }

    @Override
    public Search createSearch() {
        return new IosSearch();
    }
}
