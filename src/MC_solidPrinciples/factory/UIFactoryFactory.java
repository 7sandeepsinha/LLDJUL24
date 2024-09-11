package MC_solidPrinciples.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms){
        return switch (supportedPlatforms) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case MAC -> new MacUIFactory();
        };
    }
}
