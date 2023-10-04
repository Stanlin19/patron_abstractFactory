package org.abstractfactory.domain.products.objects.Keyboard;

import org.abstractfactory.domain.products.Keyboard;

public class WindowKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Teclado windows");
    }
}
