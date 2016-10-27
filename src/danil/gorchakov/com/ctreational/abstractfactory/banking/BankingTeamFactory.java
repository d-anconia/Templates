package danil.gorchakov.com.ctreational.abstractfactory.banking;

import danil.gorchakov.com.ctreational.abstractfactory.Developer;
import danil.gorchakov.com.ctreational.abstractfactory.ProjectManagerImpl;
import danil.gorchakov.com.ctreational.abstractfactory.ProjectTeamFactory;
import danil.gorchakov.com.ctreational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManagerImpl getProjectManager() {
        return new BankingPM();
    }
}
