public class Exer3 {

    static boolean ordenacao(int[] vetor, int indice){
        if (indice == vetor.length - 1) {
            return  true;
        }
        if (vetor[indice] > vetor[indice + 1]){
            return false;
        }

        return ordenacao(vetor, indice + 1);
    }

    public static void main(String[] args) {
        int[] vet1 = {2,4,6,8,10};

        System.out.println("Está ordenado? " + ordenacao(vet1, 0));
    }
}
