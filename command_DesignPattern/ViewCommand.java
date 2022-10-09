package command_DesignPattern;

public class ViewCommand extends Command{

    public ViewCommand(Document doc){
        super(doc);
    }

    public String execute(){
        System.out.println(document.view());
        return document.view();
    }
    
}
