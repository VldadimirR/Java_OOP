package OOP_Project.terminal;

import java.util.List;

public class Command {
    private static final String ADD = "/add"; 
    private static final String DEL = "/delete";
    private static final String DELFIO = "/deleteFio";
    private static final String DELNUMBAGE = "/deleteNumberAge";
    private List<String> arguments;
    private String mainFirstCommand;

    public boolean isCreateCommand(){
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand(){
        return mainFirstCommand.equals(DEL);
    }

    public String getFirstArgument(){
        return arguments.get(0);
    }

    public boolean isDeleteCommandByFio(){
        return mainFirstCommand.equals(DELFIO);
    }

    public boolean isDeleteCommandByNumberAge(){
        return mainFirstCommand.equals(DELNUMBAGE);
    }
}
