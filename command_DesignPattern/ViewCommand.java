package command_DesignPattern;

import javax.sound.sampled.Line;

public class ViewCommand extends Command{

    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return document.view();
    }
    
}
