package Creational.Class.AbstractFactory.UILibrary.concreteFactory;

import Creational.Class.AbstractFactory.UILibrary.Buttons.LightButton;
import Creational.Class.AbstractFactory.UILibrary.Windows.LightWindow;
import Creational.Class.AbstractFactory.UILibrary.abstractFactory.UIFactory;

import java.awt.*;

public class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Window createWindow(Frame frame) {
        return new LightWindow(frame);
    }
}
