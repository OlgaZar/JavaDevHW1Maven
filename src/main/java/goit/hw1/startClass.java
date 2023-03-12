package goit.hw1;
import com.google.gson.Gson;

public class startClass {
    public static void main(String[] args) {
        personName myName = new personName("Olga", "Zarichna");

        System.out.println("new Gson().toJson(myName) = " + new Gson().toJson(myName));

    }
}
