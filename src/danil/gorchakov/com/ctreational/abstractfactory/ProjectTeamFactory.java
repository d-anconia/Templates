package danil.gorchakov.com.ctreational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManagerImpl getProjectManager();
}
