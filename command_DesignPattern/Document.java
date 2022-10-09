package command_DesignPattern;

import java.util.ArrayList;

public class Document {

    private String filename;
    private ArrayList<String> lines;

    public Document(String FileName){
        FileManipulator.readFile(FileName);
    }

    public String view(){
        String storedList ="";
        for(String line: lines){
            storedList = storedList +"\n|     "+ line+ "     |";

        }
        String viewDoc ="____________________"
                    + storedList 
                    +"____________________";
        return viewDoc;
    }

    public String append(String line){
        lines.add(line);
        return "The line has been appended to the document";
    }

    public String write(String line){
        lines.removeAll(lines);
        lines.add(line);
        return "The line was written to the file";
    }
    
    public String save(){
        if(FileManipulator.writeFile(filename, lines)) {
            return "The file has been saved";
        } else {
            return "Sorry we cannot save at this time";
        }
    }

}
