public class PrintRecursive{
    public static void recursivePrint(int a, int b){
        boolean c = false;
        recursivePrint(a, b, c);
    }

    private static void recursivePrint(int a, int b, boolean c){
        if (a == b){
            for(int i = 0; i < (a-1); i++){
                System.out.print(" ");
            }
            System.out.println("This was written by call number " + a);
            for(int i = 0; i < (a-1); i++){
                System.out.print(" ");
            }
            System.out.println("This was ALSO written by call number " + a);
            c = true;
            recursivePrint(a-1, b, c);
        }
        else if (!c){
            for(int i = 0; i < (a-1); i++){
                System.out.print(" ");
            }
            System.out.println("This was written by call number " + a);
            recursivePrint(a+1, b, c);
        }
        else if (c && a > 0){
            for(int i = 0; i < (a-1); i++){
                System.out.print(" ");
            }
            System.out.println("This was ALSO written by call number " + a);
            recursivePrint(a-1, b, c);
        }
    }

    public static void main(String[] args) {
        recursivePrint(1, 4);
        recursivePrint(2, 8);
    }
}