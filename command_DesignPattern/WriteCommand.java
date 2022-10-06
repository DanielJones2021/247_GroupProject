package command_DesignPattern;
import java.util.Scanner;

public class WriteCommand extends Command{

    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc){
        super();
    }

    public String execute(){
        return ;
    }
    
}
