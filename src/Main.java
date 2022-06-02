import java.util.Locale;
import java.util.logging.XMLFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase(Locale.ROOT));

        String newFullName = "Иванов Семён Семёнович";
        if (newFullName.contains("ё")) {
            newFullName = String.join("е", newFullName.split("ё"));
            System.out.println(newFullName);
        }

    }

}




