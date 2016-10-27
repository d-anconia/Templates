package danil.gorchakov.com.ctreational.abstractfactory.banking;

import danil.gorchakov.com.ctreational.abstractfactory.ProjectManagerImpl;

public class BankingPM implements ProjectManagerImpl{
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
