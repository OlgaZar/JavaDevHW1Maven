package goit.hw1;
import com.google.gson.Gson;

public class StartClass {
    public static void main(String[] args) {
        PersonName myName = new PersonName("Olga", "Zarichna");

        System.out.println("new Gson().toJson(myName) = " + new Gson().toJson(myName));

    }
}
