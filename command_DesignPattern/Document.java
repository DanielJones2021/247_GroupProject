package command_DesignPattern;

import java.util.ArrayList;

public class Document {

    private String filename;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String FileName){
        this.filename=FileName;
        FileManipulator.readFile(FileName);
    }

    public String view(){
        String storedList ="";
        for(String line: lines){
            storedList = storedList +"\n|     "+ line+ "     |";

        }
        String viewDoc ="_________________"
                    + "\n" + storedList 
                    +"\n_________________";
        return viewDoc;
    }

    public String append(String line){
        lines.add(line);
        System.out.println("The line has been appended to the document");
        return "The line has been appended to the document";
    }

    public String write(String line){
        lines.removeAll(lines);
        lines.add(line);
        System.out.println("The line was written to the file");
        return "The line was written to the file";
    }
    
    public String save(){
        if(FileManipulator.writeFile(filename, lines)) {
            System.out.println("The file has been saved");
            return "The file has been saved";
        } else {
            System.out.println("Sorry we cannot save at this time");
            return "Sorry we cannot save at this time";
        }
    }

}
