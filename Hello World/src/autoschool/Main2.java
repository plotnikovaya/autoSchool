package autoschool;
import com.welcome.Hello;
import static com.welcome.Hello.setupName;
import static com.welcome.Hello.welcome;
import static com.welcome.Hello.byeBye;

public class Main2 {

    public static void main(String[] args) {
       setupName();
        String people = Hello.name;
       welcome();
        System.out.println("Hello World!");
        byeBye();
    }
}







