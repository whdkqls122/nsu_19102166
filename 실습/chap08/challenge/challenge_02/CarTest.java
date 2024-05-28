package challenge_08_2;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        StringTokenizer st = new StringTokenizer(yourCar.toString());

        Calendar cal = Calendar.getInstance();
        Date specificTime = cal.getTime();

        String equalsGab = "";
        if (myCar.equals(yourCar)) {equalsGab = "동일하다";}
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String dateGab = sdf.format(specificTime);

        String msf = MessageFormat.format("자동차 모델이 둘 다 [{1}]로 {0}.", equalsGab, st.nextToken());
        String msf2 = MessageFormat.format("날짜: {1}, 자동차 모델={0}, 운전자(홍길동)", myCar.toString(), dateGab);
        System.out.println(msf);
        System.out.println(msf2);
    }
}
