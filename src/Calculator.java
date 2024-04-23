import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //스캐너 라이브러리

public class Calculator {
    String mode;

    public Calculator(Scanner sc) { //생성자 초기화
        char c = sc.next().charAt(0);
        if(c == 'm'){
            mode = "math";
        }else if(c == 'c'){
            mode = "circle";
        }
    }

    public String Getmode() {
        return mode;
    }
}
