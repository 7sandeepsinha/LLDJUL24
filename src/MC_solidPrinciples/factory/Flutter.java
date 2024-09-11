package MC_solidPrinciples.factory;

public class Flutter {

    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void getVersion(){
        System.out.println("Version 11.1");
    }

    public void setRefreshRate(){
        System.out.println("Setting 90Hz");
    }

    public void setDarkMode(){
        System.out.println("Setting Dark Mode");
    }

    public UIFactory getUIFactory(){
       return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
