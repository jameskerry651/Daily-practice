package testnum;
import java.util.Arrays;
    /**
    * Description:
    * <br>用来仿造stringBuffer的练习类</>
    * @author james2839
    * @version 1.0
    */
public class MyStringBuffer implements IStringBuffer{
    int count;      //数组的被使用的长度
    int length;      //数组实际的长度
    char[] value;    //维护的数组


     MyStringBuffer(int capacity){
        value = new char[capacity];
        count= 0;
        this.length = capacity;
    }

    /**
     * 把原来的数组复制到一个新的数组，新的数组长度在原来的基础上增加300
     * 并且更新长度
     * @param value 传入需要变长的数组
     * @return 返回变长的数组
     */
    private char[] biggerValue(char[] value){

        char[] newArr = Arrays.copyOf(value,value.length+300);
        this.length = this.length + 300;
        return newArr;
    }

    /**
     * 追加字符串，如果长度不够调用函数 biggerValue增加长度
     * 如果长度够用，count就增加一个
     * @param c 追加的字符
     */
    @Override
    public void append(char c) {
        if (count+1 < length){
            value = biggerValue(value);
        }
        value[count+1] =  c;
        count++;                    //更新使用长度
    }

    @Override
    public void append(String str) {
        int strLength = str.length();   // 注：单词添加字符串长度暂时不得超过300的长度
        if(strLength> (length-count)){
            value = biggerValue(value);
        }
        char[] strData = str.toCharArray();
        System.arraycopy(strData,0,value,count,strLength);
        this.count = this.count + strData.length;


    }

    public String changeToString(){
        return String.copyValueOf(value);
    }

        public static void main(String[] args) {
            
        }



}
