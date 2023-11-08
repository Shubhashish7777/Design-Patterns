package Creational.Class.AbstractFactory.UILibrary.concreteFactory;

import Creational.Class.AbstractFactory.UILibrary.Buttons.DarkButton;
import Creational.Class.AbstractFactory.UILibrary.Windows.DarkWindow;
import Creational.Class.AbstractFactory.UILibrary.abstractFactory.UIFactory;

import java.awt.*;

public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Window createWindow(Frame frame) {
        return new DarkWindow(frame);
    }
}
