package danil.gorchakov.com.ctreational.abstractfactory.website;

import danil.gorchakov.com.ctreational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
