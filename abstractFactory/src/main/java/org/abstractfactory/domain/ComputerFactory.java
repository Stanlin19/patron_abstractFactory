package org.abstractfactory.domain;

import org.abstractfactory.domain.products.Keyboard;
import org.abstractfactory.domain.products.Mouse;
import org.abstractfactory.domain.products.Screen;

public interface ComputerFactory {

    Keyboard createKeyboard();
    Mouse createMouse();
    Screen createScreen();
}
