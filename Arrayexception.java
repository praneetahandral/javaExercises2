public class Arrayexception 
{
    static  void printArrayValue(){
        try{
        String[] array = new String[]{"one","two","three","four","five"};
        String value = array[10];
        }catch(Exception e){
            System.err.println("Exception is : "+e.toString());
        }
    }  
    public static void main(String[] args) {
        printArrayValue();
    }
}
