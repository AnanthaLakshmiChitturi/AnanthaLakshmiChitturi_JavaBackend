import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadingCSV {

    public static void main(String args[] ) throws IOException
    {
        BufferedReader br;
        br = new BufferedReader(new FileReader( "C:\\Users\\laksh\\Desktop\\BackEnd\\AnanthaLakshmiChitturi_JavaBackend\\Week2assignment\\src\\names.csv") );
        ArrayList<Person> people = new ArrayList<>();
        String currentLine;
        while((currentLine=br.readLine())!=null)
        {
            String [] detailed = currentLine.split(",");
            if(detailed[0].equals("\"\""))
                continue;
            String firstName=detailed[1].substring(1, detailed[1].length()-1);
            String lastName=detailed[2].substring(1, detailed[2].length()-1);
            people.add(new Person(firstName,lastName));

        }
         Collections.sort(people);
        System.out.println(people);

    }
}
