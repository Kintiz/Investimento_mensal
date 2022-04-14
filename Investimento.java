import java.util.Scanner;

public class Investimento {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // sem o try
            String repetir;
            do{
                Scanner input = new Scanner (System.in); // sem o try
                  
                    float investido;
                    float contador=1;
                    float[] total = new float[13]; //vetor pra alocar todos os meses do ano

                    System.out.println("Digite o valor da taxa mensal");
                    float taxa = input.nextFloat(); //scaneia o valor da taxa
                    
                    for(contador=1;contador<=12;contador++){ //repetir por 12 vezes o calculo
                        System.out.println("Informe o valor investido esse mês ");
                        investido = input.nextFloat();
                        total[(int) contador] = (investido * taxa)/100;
                        total[(int) contador] = total[(int) contador]+investido;
                        System.out.println("O valor que você recebe esse mês é: " +total[(int) contador]);
                    }
                    
                    float valor = total[1]+total[2]+total[3]+total[4]+total[5]+total[6]+total[7]+total[8]+total[9]+total[10]+total[11]+total[12];
                    System.out.println("valor após um ano: " +valor);
                    System.out.println("Deseja repetir o processo? [Yes/No]");
                    repetir= scan.nextLine();

            } while(repetir.equals("Yes"));

            System.out.println("Thank you for using this application");
            System.out.println("by Júlio César");
    }
}
