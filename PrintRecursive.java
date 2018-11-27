public class PrintRecursive{
    public static void recursivePrint(int a, int b){
        boolean c = false;
        recursivePrint(a, b, c);
        /*if (a <= b){
            System.out.println("This was written by call number " + a);
            recursivePrint(a+1, b);
        }
        if ((a-b) == 1){
            System.out.println("This was ALSO written by call number " + (a-1));
        }
        if (a >= b && a < (b)){
            System.out.println("test print");
            System.out.println("This was ALSO written by call number " + (a - (a-b)));
            recursivePrint(a+1, b);
        }*/
    }

    private static void recursivePrint(int a, int b, boolean c){
        if (a == b){
            System.out.println("This was written by call number " + a);
            System.out.println("This was ALSO written by call number " + a);
            c = true;
            recursivePrint(a-1, b, c);
        }
        if(!c){
            System.out.println("This was written by call number " + a);
            recursivePrint(a+1, b, c);
        }
    }

    public static void main(String[] args) {
        recursivePrint(1, 4);
    }
}