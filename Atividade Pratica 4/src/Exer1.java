public class Exer1 {
    public static int soma(int numero){
        if (numero == 1){
            return 1;
        }

        return numero + soma(numero - 1);
    }


    static void main(String[] args) throws Exception{

    }



}
