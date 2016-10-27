package danil.gorchakov.com.ctreational.abstractfactory.banking;

import danil.gorchakov.com.ctreational.abstractfactory.Developer;


public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
