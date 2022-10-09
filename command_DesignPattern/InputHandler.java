import java.util.HashMap;

public class InputHandler {
  private HashMap<String, Command> commands = new HashMap<String, Command>();
  
  public InputHandler(Document document) {
    commands.put("view", new ViewCommand(document));
    commands.put("save", new SaveCommand(docment));
    commands.put("append", new AppendCommand(document));
    commands.put("write", new WriteCommand(document));
  }
  
  public void inputEntered(String data) {
    if(commands.containsKey(data) == false){
      System.out.println("Command not recognized.");
      return;
    }
    commands.get(data).execute();
}
}
