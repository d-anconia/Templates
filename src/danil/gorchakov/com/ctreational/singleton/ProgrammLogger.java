package danil.gorchakov.com.ctreational.singleton;

public class ProgrammLogger {
    private static ProgrammLogger programmLogger;

    private static String logFile = "This is log file";

    public static synchronized ProgrammLogger getProgrammLogger(){
        if(programmLogger == null)
            programmLogger = new ProgrammLogger();
        return programmLogger;
    }

    private ProgrammLogger(){}

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }
}
