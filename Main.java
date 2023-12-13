import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Array1 = ");
        String str1 = sc.nextLine();
        System.out.print("\nArray2= ");
        String str2 = sc.nextLine();

        String s1= str1.substring(1,str1.length()-1);
        String s2= str2.substring(1,str2.length()-1);

        String [] sizeArray1=s1.split(",");
        String [] sizeArray2=s2.split(",");

        double [] array1= new double[sizeArray1.length];
        double [] array2= new double[sizeArray2.length];

        for(int i=0;i<sizeArray1.length; i++){
            array1[i]=Double.parseDouble(sizeArray1[i]);
        }
        for(int i=0;i<sizeArray2.length; i++){
            array2[i]=Double.parseDouble(sizeArray2[i]);
        }

        double median= calMedian(array1,array2);
        System.out.printf("\nMedian: %.3f",median);
    }
    public static double calMedian(double[] array1, double[]array2){
        int b=array1.length + array2.length;
        double []mixedArray=new double[b];
        System.arraycopy(array1,0,mixedArray,0,array1.length);
        System.arraycopy(array2,0,mixedArray,array1.length,array2.length);
        
        Arrays.sort(mixedArray);
          
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



