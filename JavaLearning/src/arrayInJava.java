public class arrayInJava {
    public static void main(String[] args) {
            
//        Syntax
//        datatype[] variable_name;
//        datetype varname[];


        int[] num = {1,2,3,4,5,6}; // initializing array
        System.out.println("Before Update: "+num[0]); // showing 1st Positon

        num[0]=540; // updating values
        System.out.println("After Update: "+num[0]); // Showing 1st Position

        
        for (int i=0; i<num.length; i++){

            System.out.println(num[i]); // showing stored value of array

        }

    }
}
