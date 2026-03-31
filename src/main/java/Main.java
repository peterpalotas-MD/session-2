import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void printMiddle(String str1){
            int middleStart = (str1.length()/2)-1;
            System.out.println(str1.substring(middleStart, middleStart+2));
        }
    static void main(String[] args) {

        Person peter = new Person();
        peter.name="Peter";
        peter.age=19;

        System.out.println("Name: " + peter.name);
        System.out.println("Age: " + peter.age);

        List<String> stringList = new ArrayList<>();
        stringList.add("string");
        stringList.add("code");
        stringList.add("Practice");

        for(String s : stringList) {
            Main.printMiddle(s);
        }
    }
}