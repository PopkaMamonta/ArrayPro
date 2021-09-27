package arraypro;

import java.util.Arrays;
import java.util.Random;

public class ArrayPro {

    public static void main(String[] args) {
        //Массивы в Java
        int[]nums;
        nums=new int[5];
        //nums[0]=1;
        //nums[1]=2;
        //nums[2]=3;
        //nums[3]=4;
        //nums[4]=5;
        for (int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        System.out.print("nums = [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i<nums.length-1){
            System.out.print(", ");
        }
        }
        System.out.println("]");
        System.out.println("nums="+Arrays.toString(nums));
//        int[] nums2=new int[7];
//        for (int i=0;i<nums.length;i++){
//            nums2[i]=nums[i];
//        }
//        System.arraycopy(nums, 0, nums2, 0, nums.length);
        
        int[] nums2=Arrays.copyOf(nums,7);
        
        System.out.println("nums2="+Arrays.toString(nums2));

        System.out.println("nums="+Arrays.toString(nums));
        nums=nums2;
        System.out.println("nums="+Arrays.toString(nums));
        
        
      //Многомерные массивы
        Random random=new Random();
        int[][] matrix=new int[5][5];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int a=random.nextInt(20);
                matrix[i][j]=a;
                
            }
            
        }
        int[] sumCols=new int[5];
        for(int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.print(matrix[i][j]);
                System.out.printf("%4d", matrix[i][j]);
                sum+=matrix[i][j];
                sumCols[j]+=matrix[i][j];
            }
            System.out.println(" | Summa: "+sum);
            System.out.println();
        }
        System.out.println("--Summa of columns--");
        for(int i=0;i<sumCols.length;i++){
            if(i<sumCols.length){
                System.out.printf("%4d",sumCols[i]);
                }
        }
        System.out.println();
    //Зубчатые массивы
        int[][] matrixZ=new int[5][];
//    matrixZ[0]=new int[1];
//    matrixZ[1]=new int[2];
//    matrixZ[2]=new int[3];
//    matrixZ[3]=new int[4];
//    matrixZ[4]=new int[5];
        int min=1,max=10;
        for (int i = 0; i < matrixZ.length; i++) {
            matrixZ[i]=new int[random.nextInt(max-min+1)+min];
        }
        int[] sumColsZ=new int[max];
        for(int i = 0; i < matrixZ.length; i++) {
            int sum=0;
            for (int j = 0; j < matrixZ[i].length; j++) {
                matrixZ[i][j]=random.nextInt(10);
                System.out.printf("%4d", matrixZ[i][j]);
                sum+=matrixZ[i][j];
                sumColsZ[j]+=matrixZ[i][j];
            }
            System.out.printf(" | Summa: "+sum);
            System.out.println();
        }
        System.out.println("--Summa of columns--");
        for(int i=0;i<sumColsZ.length;i++){
            if(i<sumColsZ.length){
                System.out.printf("%4d",sumColsZ[i]);
                }
        }
        System.out.println();
        //Строка в Java
        String str;
        str="Это строка";
        System.out.println(str);
        //Редактирование строки создает новую строку
        str=str.replace("а","и");
        System.out.println("str = "+str);
        
    }
}

