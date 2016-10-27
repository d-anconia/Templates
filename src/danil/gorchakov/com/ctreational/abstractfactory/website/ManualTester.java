package danil.gorchakov.com.ctreational.abstractfactory.website;

import danil.gorchakov.com.ctreational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests website");
    }
}
