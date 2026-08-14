import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TODO: Saída de dados
        System.out.println("Digite o seu nome...");

        //TODO: Entrada de dados
        // 1. Criar um objeto Scanner
        Scanner entrada = new Scanner(System.in);
        // 2. Realizar a leitura de dados
        String nome = entrada.nextLine();

        System.out.println("Olá " + nome + ", bem-vindo ao Java!");
        System.out.printf("Olá %s, bem-vindo ao Java!\n", nome);

        //TODO: Tipos de dados
        // Tipos primitivos: byte, short, int, long, float, double, char, boolean
        // Tipos não-primitivos: Byte, Short, Integer, Long, Float, Double, Boolean, String

        System.out.println("\n\nTipo de Dados: \n");
        System.out.printf("Byte - byte: %d - min: %d - max: %d\n",
                Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short - byte: %d - min: %d - max: %d\n",
                Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer - byte: %d - min: %d - max: %d\n",
                Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long - byte: %d - min: %d - max: %d\n",
                Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Float - byte: %d - min: %s - max: %s\n",
                Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double - byte: %d - min: %s - max: %s\n",
                Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("Character - byte: %s - min: %s - max: %s\n",
                Character.BYTES, Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.printf("Boolean - bit: 1 - min: %B - max: %B\n",
                Boolean.TRUE, Boolean.FALSE);

        //TODO: Operadores e Expressões
        // Aritmeticos: + - * / %
        // Relacionais: > < >= <= == !=
        // Lógicos: & | ^
        // Atribuição: =
        // Incremento: ++ -- += -= *= /=

        System.out.println("\nExemplo Incrementos");
        int a = 10;
        a++;
        System.out.printf("a++: %d\n", a);
        a--;
        System.out.printf("a--: %d\n", a);
        a += 10;
        System.out.printf("a+=10: %d\n", a);
        a -= 3;
        System.out.printf("a-=3: %d\n", a);
        a *= 2;
        System.out.printf("a*=2: %d\n", a);
        a %= 3;
        System.out.printf("a%%=3: %d\n", a);

        // Exemplo expressoes
        // x = 10 x [ 2 / (3 - 1)] + {10 + (2 * 6)}
        // x = 10 * (2/(3-1)) + (10 + (2 * 6))

        //TODO: Estrutura de Controle
        // Estrutura Simples

        System.out.println("Estruturas de Decisão\n\nDigite uma nota:");
        float nota = entrada.nextFloat();
        if (nota < 5.0) System.out.println("Reprovado!");

        // Estrutura composta
        if (nota < 7.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Aprovado!");
        }

        //TODO: Estrutura de repetição
        // while, do while, for, for in, lambas/streams

        //TODO: Métodos com retorno
        //TODO: Métodos sem retorno
    }
}