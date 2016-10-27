package danil.gorchakov.com.ctreational.abstractfactory.website;

import danil.gorchakov.com.ctreational.abstractfactory.Developer;
import danil.gorchakov.com.ctreational.abstractfactory.ProjectManagerImpl;
import danil.gorchakov.com.ctreational.abstractfactory.ProjectTeamFactory;
import danil.gorchakov.com.ctreational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManagerImpl getProjectManager() {
        return new WebsitePM();
    }
}
