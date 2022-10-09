package command_DesignPattern;

import javax.sound.sampled.Line;

public class ViewCommand extends Command{

    public ViewCommand(Document doc){
        super();
    }

    public String execute(){
        document.view();
        return "Not sure what needs to be returned here";
    }
    
}
