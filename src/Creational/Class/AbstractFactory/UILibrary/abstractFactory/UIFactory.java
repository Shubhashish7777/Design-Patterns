package Creational.Class.AbstractFactory.UILibrary.abstractFactory;

import java.awt.*;
import java.awt.Window;

public interface UIFactory {

    public Button createButton();
    public Window createWindow(Frame frame);

}
