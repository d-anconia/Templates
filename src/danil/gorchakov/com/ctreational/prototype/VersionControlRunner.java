package danil.gorchakov.com.ctreational.prototype;


public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        ProjectFactory factory = new ProjectFactory(master);
        Project cloneProject = factory.cloneProject();

    }
}
