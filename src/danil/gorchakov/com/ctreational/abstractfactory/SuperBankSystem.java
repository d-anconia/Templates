package danil.gorchakov.com.ctreational.abstractfactory;


import danil.gorchakov.com.ctreational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManagerImpl manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bunk system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
