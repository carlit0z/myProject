public class T1 {
    static void fungsiI(){
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void fungsiII(){
        for (int x=1; x<=5; x++){
            for (int y=5; y>= x; y--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Fungsi I");
        fungsiI();
        System.out.println("Fungsi II");
        fungsiII();
        
    }
}