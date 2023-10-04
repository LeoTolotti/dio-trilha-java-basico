public class OperadoresJava {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Leonardo "+"Tolotti";
        //System.out.print(nomeCompleto);
        int numero = 5;
        //System.out.print(numero);
        //System.out.print(-numero);
        int numeroRepetido = 5;
        numeroRepetido++;
        //System.out.print(numeroRepetido);
        boolean variavel = true;
        variavel = !variavel;
        //System.out.print(variavel);

        int a, b;
        a=6;
        b=6;
        String resultado = "";
        if( a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        System.out.println(resultado);  
        
        String resultadoTernario = a==b?"Verdadeiro":"Falso";
        System.out.println(resultadoTernario);  
    
        boolean condicao = true;
        boolean condicao2 = false;

        resultado = condicao && condicao2 ? "As duas são verdadeiras": "Falso";
        System.out.println(resultado);
        resultado = condicao || condicao2 ? "Somente uma é verdadeira": "Falso";
        System.out.println(resultado);
    }
}
