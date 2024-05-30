import java.util.Scanner;
public class Atividade4Vetores {
    public static void main(String[] args) {
        float soma1 = 0, soma2 = 0, media1 = 0, media2 = 0;
        int tamanho, maior, menor, posicao1, posicao2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
         tamanho = scanner.nextInt();
        int[] vet= new int[tamanho];

        System.out.println("Por favor, informe os valores do vetor: ");
        for(int i = 0; i < tamanho; i++) {
          vet[i] = scanner.nextInt();
        }
        for(int i = 0; i < tamanho; i++){
            soma1 = soma1 + vet[i];
        }
        System.out.println("A soma dos valores digitados são: " + soma1);

        for(int i = 0; i < tamanho; i++){
         media1 = soma1/ tamanho;
        }
        System.out.println("A média dos valores digitados são: " + media1);

         maior = vet[0];
        for(int i = 1; i < tamanho; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println("Maior valor do vetor: " + maior);

         menor = vet[0];
        for(int i = 1; i < tamanho; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        System.out.println("Menor valor do vetor: " + menor);

        System.out.print("Digite as posições a serem substituídas no vetor: ");
         posicao1 = scanner.nextInt();
         posicao2 = scanner.nextInt();

        System.out.print("Digite os novos valores para essas posições: ");
        vet[posicao1] = scanner.nextInt();
        vet[posicao2] = scanner.nextInt();

        soma2 = 0;
        for (int i = 0; i < tamanho; i++) {
            soma2= soma2 + vet[i];
        }

        media2 = soma2/tamanho;
        System.out.println("Soma dos valores do vetor após a substituição: " + soma2);
        System.out.println("Soma dos valores do vetor após a substituição: " + media2);







    }
}
