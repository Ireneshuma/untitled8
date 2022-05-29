package collectives.com;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectives {


    public static void main(String[] args) throws IOException {
        List<String> employees = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){

            String line;
            while ((line = br.readLine()) !=null){
                employees.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(" size of the collection : " + employees.size());


        System.out.println("Irene");
        System.out.println("HELOO : ");
        for (int i =10;i< employees.size();i++){
            System.out.println(employees.get(i));
        }

        System.out.println("Irene");
        System.out.println("hello : ");
        for (String employee:employees
        ) {
            System.out.println(employee);
        }


        System.out.println("Irene");
        System.out.println("interface ");
        Iterator<String> it = employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}