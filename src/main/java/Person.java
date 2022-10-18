import java.util.ArrayList;
import java.util.List;

public class Person {
    public String same1 = "Test";
    public String same2 = same1;
    private String name;
    private List<String> listOfNames = new ArrayList<>();

public int getSizeList(){
    return listOfNames.size();
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        //System.out.println("Not yet implemeted");
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void setListOfNames(List<String> listOfNames) {
        this.listOfNames = listOfNames;
    }

    public void addName(String name){
        //we just need to add the name given to the arraylist
        listOfNames.add(name);
    }
public void removeName(String name){
       //listOfNames.remove("mem");
}
}
