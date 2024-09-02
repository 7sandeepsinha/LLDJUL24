package lldmodule2.desingPatterns.factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(SupportPlatform supportPlatform){
        return switch (supportPlatform){
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case MAC -> new MacUIFactory();
        };
    }
}
