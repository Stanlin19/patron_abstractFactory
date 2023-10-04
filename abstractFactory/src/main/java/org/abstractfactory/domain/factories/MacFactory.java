package org.abstractfactory.domain.factories;

import org.abstractfactory.domain.ComputerFactory;
import org.abstractfactory.domain.products.Keyboard;
import org.abstractfactory.domain.products.Mouse;
import org.abstractfactory.domain.products.Screen;
import org.abstractfactory.domain.products.objects.Keyboard.MacKeyboard;
import org.abstractfactory.domain.products.objects.Mouse.MacMouse;
import org.abstractfactory.domain.products.objects.Screen.MacScreen;

public class MacFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }

    @Override
    public Screen createScreen() {
        return new MacScreen();
    }
}
