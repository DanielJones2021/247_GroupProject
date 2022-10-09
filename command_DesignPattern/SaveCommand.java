package command_DesignPattern;

public class SaveCommand extends Command{

    public SaveCommand(Document doc){
        super(doc);
    }

    public String execute(){
        return document.save();
    }
    
}
