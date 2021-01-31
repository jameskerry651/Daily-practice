package testnum;


public class RandomStr {
    static char productRandomChar(){
        int startNum = (1+(int)(Math.random()*3));

        //判断产生数字还字母 分为三种情况；

        if(startNum==1){
            return (char) (48+((int)(Math.random()*10)));
        }
        else if(startNum==2){
            return  (char) (65+((int)(Math.random()*26)));
        }
        else if(startNum==3){
            return  (char) (97+((int)(Math.random()*26)));
        }
        else return 0;

    }
}
