package Java;
public class T1 {
    static void fungsiI(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void fungsiII(){
        for (int i=1; i<=5; i++){
            for (int j=5; j>= i; j--){
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
