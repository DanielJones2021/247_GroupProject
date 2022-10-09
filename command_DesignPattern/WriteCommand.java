package command_DesignPattern;
import java.util.Scanner;

public class WriteCommand extends Command{

    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc){
        super(doc);
    }

    public String execute(){
        System.out.println("Enter text:");
        String line = in.nextLine();
        return document.write(line);
    }
    
}
