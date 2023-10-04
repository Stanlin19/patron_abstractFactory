package org.abstractfactory;

import org.abstractfactory.domain.ComputerFactory;
import org.abstractfactory.domain.factories.MacFactory;
import org.abstractfactory.domain.factories.WindowFactory;
import org.abstractfactory.domain.products.Keyboard;
import org.abstractfactory.domain.products.Mouse;
import org.abstractfactory.domain.products.Screen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crear compurtador windows");
        ComputerFactory factoryWindow = new WindowFactory();
        Screen sc1 = factoryWindow.createScreen();
        Mouse mo1 = factoryWindow.createMouse();
        Keyboard kb1 = factoryWindow.createKeyboard();
        sc1.type();
        mo1.type();
        kb1.type();

        System.out.println();

        System.out.println("Crear compurtador mac");
        ComputerFactory factoryMac = new MacFactory();
        Screen sc2 = factoryMac.createScreen();
        Mouse mo2 = factoryMac.createMouse();
        Keyboard kb2 = factoryMac.createKeyboard();
        sc2.type();
        mo2.type();
        kb2.type();

    }
}