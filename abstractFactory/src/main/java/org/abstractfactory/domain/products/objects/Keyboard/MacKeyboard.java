package org.abstractfactory.domain.products.objects.Keyboard;

import org.abstractfactory.domain.products.Keyboard;

public class MacKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Teclado mac");
    }
}
