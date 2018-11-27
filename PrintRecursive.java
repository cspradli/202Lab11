public class PrintRecursive{
    public static void recursivePrint(int a, int b){
        if (a <= b){
            for (int i = 0; i < a-1; i++){
                System.out.print(" ");
            }
            System.out.println("This was written by call number " + a);
            recursivePrint(a+1, b);
            for (int i = 0; i < a-1; i++){
                System.out.print(" ");
            }
            System.out.println("This was ALSO written by call number " + a);
        }
    }

    public static void main(String[] args) {
        recursivePrint(1, 4);
        recursivePrint(2, 8);
    }
}