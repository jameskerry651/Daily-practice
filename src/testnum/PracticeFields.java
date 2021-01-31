package testnum;

import java.util.Date;

public class PracticeFields {

    public static void main(String[] args) {
        Date d1 = new Date(1995-1900,1,1,0,0,0);
        Date d2 = new Date(1995-1900,12,31,23,59,59);

        long Seconds = d2.getTime() - d1.getTime();
        long RandomNum = (long) (Math.random()*Seconds);
        System.out.println(RandomNum);
        Date d3 = new Date(d1.getTime()+RandomNum);
        System.out.println(d3);
    }
}
