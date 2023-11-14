package sparsearray;

/**
 * 稀疏数组的转换
 */
public class SparseArray {

    public static void main(String[] args) {

        // ==== 多维数组 -》 稀疏数组 =====
        // 1、初始化一个11*10的数组
        int charsetArray[][] = new int[11][10];
        charsetArray[1][2] = 1;
        charsetArray[2][4] = 2;
        System.out.println("转换前的数组：");
        for(int[] row : charsetArray){
            for(int data : row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        // 2、初始化稀疏数组 --
        // 1）获取行和列
        // 2）获取有几个不为0的值
        int sum = 0;
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 10; j++){
                if(charsetArray[i][j] != 0) sum++;
            }
        }
        System.out.println("sum=" + sum);
        int spareArray[][] = new int[sum+1][3];
        spareArray[0][0] = 11;
        spareArray[0][1] = 10;
        spareArray[0][2] = sum;

        // 3）获取不为0的值的 row行 col列 val值







        //2、

    }
}
