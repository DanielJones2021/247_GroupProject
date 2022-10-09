package command_DesignPattern;

import java.util.Scanner;

public class AppendCommand extends Command{

    private Scanner in = new Scanner(System.in);
    
    public AppendCommand(Document doc){
        super(doc);
    }
    public String execute(){
        System.out.println("Enter Data:");
        String line = in.nextLine();
        return document.append(line);
    }
    
}
