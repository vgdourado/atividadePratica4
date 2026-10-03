public class Exer4 {

    public static int ocorrencias(int[] vetor, int indice, int numProcurado){
        if(indice == vetor.length - 1){
            return 0;
        }

        if(vetor[indice] == numProcurado){
            return 1 + ocorrencias(vetor, indice + 1, numProcurado);
        }else{
            return ocorrencias(vetor, indice +1, numProcurado);
        }
    }

    public static void main(String[] args) {
        int[] numeros = {2,5,2,7,2,10};
        int numProcurado = 2;
        int resultado = ocorrencias(numeros, 0, numProcurado);
        
        System.err.println("O numero " + numProcurado + " apareceu " + resultado + " vezes!");
    }
}
