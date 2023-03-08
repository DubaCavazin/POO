import javax.swing.JOptionPane;
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) throws Exception {
        //teste1();
        //teste2();
        //teste3();
        teste4();
        
    }

    private static void teste1(){
        String teste = JOptionPane.showInputDialog("Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        System.out.println(teste);
        System.out.println(idade);
        if(idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    private static void teste2(){
        for(int i = 0; i <=15; System.out.println(i))
            i++;
    }

    private static void teste3(){
        int num[] = {1,2,3,4,5,6};
        for(int item : num){
            System.out.println(item);
        }
    }

    private static void teste4(){
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int y = sc.nextInt();
        
        if(y<x){
            int aux = x;
            x = y;
            y = aux;
        }
        int soma = 0;
        for(int i=(x+1); i<y; i++){
            if(i%2 == 1){
                soma = i++;
            }
        }
        System.out.println(soma);
    }

}
