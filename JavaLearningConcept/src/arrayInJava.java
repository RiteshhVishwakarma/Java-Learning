import java.io.PrintStream;

public class arrayInJava {
    public static void main(String[] args) {

//        Syntax
//        datatype[] variable_name;
//        datetype varname[];


        int[] num = {1,2,3,4,5,6}; // initializing array

        int length = num.length; // We can get the length of an array using the length property

        System.out.println("Length of array is: "+length);
        System.out.println("____________________________________________");
        System.out.println("Before Update: "+num[0]); // showing 1st Positon

        num[0]=540; // updating values
        System.out.println("After Update: "+num[0]); // Showing 1st Position

        
        for (int i=0; i<num.length; i++){

            System.out.print(num[i]+" "); // showing stored value of array

        }

        System.out.println("______________________________");

        int intArr[] = new int[40];  // 20 memory space allocated ho jayega stack me
        for(int i=0; i<intArr.length; i++){
            System.out.print(intArr[i]+" ");
        }
    }
}
