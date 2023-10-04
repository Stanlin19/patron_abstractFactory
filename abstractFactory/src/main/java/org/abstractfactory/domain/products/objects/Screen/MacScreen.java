package org.abstractfactory.domain.products.objects.Screen;

import org.abstractfactory.domain.products.Screen;

public class MacScreen implements Screen {
    @Override
    public void type() {
        System.out.println("Pantalla mac");
    }
}
