import java.util.Scanner;

public class Main {

    public static void mayin()
    {
        Scanner sc = new Scanner(System.in);
        int a=8;
        String matris[][] = new String[3][3];
        matris[0][0] = "-";//Mayın 1
        matris[0][1] = "-";
        matris[0][2] = "-";
        matris[1][0] = "-";
        matris[1][1] = "-";
        matris[1][2] = "-";
        matris[2][0] = "-";
        matris[2][1] = "-";//Mayın 2
        matris[2][2] = "-";
        while(a>0) {
            yazdır(matris);
            System.out.print("Bir sayı giriniz : ");
            int b = sc.nextInt();
            System.out.print("Bir sayı giriniz : ");
            int c = sc.nextInt();
            if(b==0 && c==0){
                System.out.println("GAME OVER!!! ");
                a-=10;
            }
            if(b==0 && c==1){
                matris[0][1]="2";
                a-=1;
            }
            if(b==0 && c==2){
                matris[0][2]="1";
                a-=1;
            }
            if(b==1 && c==0){
                matris[1][0]="2";
                a-=1;
            }
            if(b==1 && c==1){
                matris[1][1]="2";
                a-=1;
            }
            if(b==1 && c==2){
                matris[1][2]="2";
                a-=1;
            }
            if(b==2 && c==0){
                matris[2][0]="1";
                a-=1;
            }
            if(b==2 && c==1){
                System.out.println("GAME OVER!!! ");
                a-=10;
            }
            if(b==2 && c==2){
                matris[2][2]="1";
                a-=1;
            }
            if(a==1){
                matris[0][0]="*";
                matris[2][1]="*";
                yazdır(matris);
                System.out.println("TEBRİKLER KAZANDINIZ!!!");
                break;
            }

        }
        sc.close();
    }

    public static void yazdır(String matris[][])
    {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        mayin();
    }
}