package testnum;

import java.util.Arrays;

class InnerProduct{
    public static int vectorProduct(int[] a,int[] b){
        int value=0;
        for (int i=0;i< a.length;i++){
            value = value + a[i]*b[i];
        }
        return value;
    }
}


public class TestString {
    //3x3矩阵乘法练习
    public static void main(String[] args) {
        int[][] matrixOne = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixTwo = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixResutl = new int[3][3];

        //先将矩阵转置
        for (int i=0;i< matrixTwo.length;i++){
            for (int j=i;j< matrixTwo.length;j++){
                int tmp;
                tmp = matrixTwo[i][j];
                matrixTwo[i][j] = matrixTwo[j][i];
                matrixTwo[j][i] = tmp;
            }
        }
        //计算内积
        for (int i=0;i< matrixOne.length;i++){
            for (int j=0; j< matrixTwo.length;j++) {
                matrixResutl[i][j] = InnerProduct.vectorProduct(matrixOne[i],matrixTwo[j]);
            }
        }
        //输出结果
        for (int i=0;i<3;i++){
            System.out.println(Arrays.toString(matrixResutl[i]));
        }
    }
}
