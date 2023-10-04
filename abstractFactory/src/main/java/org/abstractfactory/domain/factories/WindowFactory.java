package org.abstractfactory.domain.factories;

import org.abstractfactory.domain.ComputerFactory;
import org.abstractfactory.domain.products.Keyboard;
import org.abstractfactory.domain.products.Mouse;
import org.abstractfactory.domain.products.Screen;
import org.abstractfactory.domain.products.objects.Keyboard.WindowKeyboard;
import org.abstractfactory.domain.products.objects.Mouse.WindowMouse;
import org.abstractfactory.domain.products.objects.Screen.WindowScreen;

public class WindowFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new WindowKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new WindowMouse();
    }

    @Override
    public Screen createScreen() {
        return new WindowScreen();
    }
}
