import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int sizeArray1= sc.nextInt();
        System.out.println("Enter the size of array2: ");
        int sizeArray2= sc.nextInt();
        System.out.print("Array1 :");
        double[] array1 = new double[sizeArray1];
        for(int i=0; i<sizeArray1;i++) {
            array1[i] = sc.nextDouble();
        }

        System.out.println("\nArray2 : ");
        double[] array2 = new double[sizeArray2];
        for(int i=0; i<sizeArray2;i++) {
            array2[i] = sc.nextDouble();
        }
        System.out.print("Array1 ={");
        for(int k=0; k<sizeArray1;k++) {
            System.out.print(array1[k]);
            if (k < sizeArray1 - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.print("\nArray2 ={");
        for(int k=0; k<sizeArray2;k++) {
            System.out.print(array2[k]);
            if (k < sizeArray2 - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");

        double median= calMedian(array1,array2);
        System.out.printf("\nMedian: %.3f",median);
    }
    public static double calMedian(double[] array1, double[]array2){
        int b=array1.length + array2.length;
        double []mixedArray=new double[b];
        System.arraycopy(array1,0,mixedArray,0,array1.length);
        System.arraycopy(array2,0,mixedArray,array1.length,array2.length);

        for(int pass =1; pass<b; pass++) {
            for (int i = 0; i < b - 1; i++) {
                if (mixedArray[i] > mixedArray[i + 1]) {
                    double hold = mixedArray[i];
                    mixedArray[i] = mixedArray[i + 1];
                    mixedArray[i + 1] = hold;
                }
            }
        }
            int middle= b/2;
            if(middle%2==0){
                double num1=mixedArray[middle];
                double num2=mixedArray[middle-1];
                return(num1 + num2)/2;
            }
            else {
                return mixedArray[middle];
            }
        }
    }



