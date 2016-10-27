package danil.gorchakov.com.ctreational.factory;

public class Program{
    public static void main(String[] args) {

//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();

//        Developer developer  = new CppDeveloper();
//        developer.writeCode();
        //DeveloperFactory factory = new JavaDeveloperFactory();
       // DeveloperFactory factory = new CppDeveloperFactory();
        DeveloperFactory factory = createDeveperBySpeciality("java");
        Developer developer = factory.createDeveloper();
        developer.writeCode();

    }
    static DeveloperFactory createDeveperBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if(speciality.equalsIgnoreCase("c++"))
            return new CppDeveloperFactory();
        else if(speciality.equalsIgnoreCase("php"))
            return new PhpDeveloperFactory();
        else throw new RuntimeException(speciality +" is unknown speciality");

    }
}