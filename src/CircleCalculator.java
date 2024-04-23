import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleCalculator {
    static final double PI = 3.141592; //접근제한이 필요없기에 static, 파이는 고정값이라 덮어쓸 일이 없기에 final이 붙는다
    List<Double> circleResult; //원 넓이 저장

    public CircleCalculator() {
        circleResult = new ArrayList<Double>();
    }

    public double calculateCircleArea(double r) {
        double area = r*r*PI;
        CAddArray(area);
        return area;
    }
    public void CAddArray(double a){ //원넓이 결과를 저장하는 메소드
        circleResult.add(a);
    }
    public void CRemoveArray(Scanner sc){ //원넓이 결과를 삭제하는 메소드 setter
        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String r = sc.next();
        if(r.equals("remove")) {
            circleResult.removeFirst();
        }
    }
    public void CInquiryArray(Scanner sc){ //원넓이 결과를 조회하는 메소드 getter
        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String i = sc.next();
        if(i.equals("inquiry")) {
            for(double unit : circleResult) {  //향상된 for문
                System.out.print(unit + " ");
            }
        }
    }
}
