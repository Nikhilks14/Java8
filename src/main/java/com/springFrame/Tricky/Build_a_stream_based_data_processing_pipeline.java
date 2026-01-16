import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Build_a_stream_based_data_processing_pipeline {

    public static void main(String[] args) {

        String csvFile = "F://OneDrive - SOLIZE GROUP//Desktop/People.csv";

        try{
            List<Person> filteredPerson = Files.lines(Paths.get(csvFile))
                    .skip(1)
                    .map(line -> line.split(","))
                    .filter(tokens -> tokens.length == 2)
                    .filter(token -> Integer.parseInt(token[1])> 25)
                    .map(tokens -> new Person(tokens[0], Integer.parseInt(tokens[1])))
                    .collect(Collectors.toList());

                    filteredPerson.forEach(System.out::println);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

