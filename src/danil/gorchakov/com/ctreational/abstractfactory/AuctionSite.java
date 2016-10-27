package danil.gorchakov.com.ctreational.abstractfactory;


import danil.gorchakov.com.ctreational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManagerImpl manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website project...");

        developer.writeCode();
        tester.testCode();
        manager.manageProject();

    }


}
