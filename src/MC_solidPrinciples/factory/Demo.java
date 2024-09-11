package MC_solidPrinciples.factory;

import MC_solidPrinciples.factory.components.button.Button;
import MC_solidPrinciples.factory.components.dropdown.Dropdown;
import MC_solidPrinciples.factory.components.menu.Menu;
import MC_solidPrinciples.factory.components.search.Search;

public class Demo {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.MAC);
        UIFactory uiFactory = flutter.getUIFactory();

        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
        Search search = uiFactory.createSearch();
    }
}
