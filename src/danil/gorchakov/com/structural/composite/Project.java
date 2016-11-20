package danil.gorchakov.com.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        JavaDeveloper firstJavaDeveloper = new JavaDeveloper();
        JavaDeveloper secondJavaDeveloper = new JavaDeveloper();
        CppDeveloper cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
