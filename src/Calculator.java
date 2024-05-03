import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //스캐너 라이브러리

public class Calculator {
    String mode;

    public Calculator(Scanner sc) { //생성자 초기화
        while (true) {
            System.out.println("산수: m | 원넓이: c 를 입력해주세요: ");
            String input = sc.next();
            if (input != null && !input.isEmpty()) {
                char c = input.charAt(0);
                if (c == 'm') {
                    mode = "math";
                    break; // 올바른 입력이 들어온 경우 반복문 종료
                } else if (c == 'c') {
                    mode = "circle";
                    break; // 올바른 입력이 들어온 경우 반복문 종료
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } else {
                System.out.println("입력이 비어있습니다. 다시 입력해주세요.");
            }
        }
    }

    public String Getmode() {
        return mode;
    }
}
