package org.abstractfactory.domain.products.objects.Mouse;

import org.abstractfactory.domain.products.Mouse;

public class WindowMouse implements Mouse {
    @Override
    public void type() {
        System.out.println("Raton windows");
    }
}
