import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AsciiBatman {
    public static void main(String[] args) {
        
        for (int laco = 10; laco >= 1; laco--) {
            for (int i = 1; i <= laco; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0 ; i < 10 ; i++) {
            for (int asteriscos = 0 ; asteriscos <= i ; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
        linhaSimples();
        segundaLinhaSimples();
        terceiraLinha();
        quartaLinha();
        quintaForma();
        
    }
    static void linhaSimples(){
        System.out.println();
        int division = (64 - 24) / 2;
        for (int i = 1; i <= 1; i++){
            for (int x = 1; x <= division; x++){
                System.out.print(" ");
            }
            for (int y = 1; y <= 24; y++){
                System.out.print("*");
            }
            for (int z = 1; z <= division; z++){
                System.out.print(" ");
            }
        }
    }
    static void segundaLinhaSimples(){
        System.out.println();
        int division = (64 - 34) / 2;
        for (int i = 1; i <= 1; i++){
            for (int x = 1; x <= division; x++){
                System.out.print(" ");
            }
            for (int y = 1; y <= 34; y++){
                System.out.print("*");
            }
            for (int x = 1; x <= division; x++){
                System.out.print(" ");
            }
        }
    }
    static void terceiraLinha(){
        System.out.println();
        int division = (64 - 42) / 2;
        for (int i = 1; i <= 1; i++){
            for (int x = 1; x <= division; x++){
                System.out.print(" ");
            }
            for (int first = 1; first <= 7; first++){
                System.out.print("*");
            }
            for (int second = 1; second <= 3; second++){
                System.out.print(" ");
            }
            for (int third = 1; third <= 1; third++){
                System.out.print("*");
            }
            for (int fourth = 1; fourth <= 5; fourth++){
                System.out.print(" ");
            }
            for (int fifth = 1; fifth <= 1; fifth++){
                System.out.print("*");
            }
            for (int sixth = 1; sixth <= 7; sixth++){
                System.out.print(" ");
            }
            for (int seventh = 1; seventh <= 1; seventh++){
                System.out.print("*");
            }
            for (int eighth = 1; eighth <= 4; eighth++){
                System.out.print(" ");
            }
            for (int ninth = 1; ninth <= 1; ninth++){
                System.out.print("*");
            }
            for (int tenth = 1; tenth <= 4; tenth++){
                System.out.print(" ");
            }
            for (int eleventh = 1; eleventh <= 7; eleventh++){
                System.out.print("*");
            }
        }
    }
    static void quartaLinha(){
        System.out.println();
        ArrayList<Integer> vezes = new ArrayList<>(Arrays.asList(8, 7, 3, 3, 6, 2, 5, 2, 5, 3, 3, 7));
        for (int laco = 0; laco < 12; laco++){
            for (int i = 1; i <= vezes.get(laco); i++){
                if (laco == 0 || laco % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }
    }
    static void quintaForma(){
        System.out.println();
        ArrayList<ArrayList<Integer>> cadaAdicao = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(6, 6, 3, 5, 7, 9, 6, 5, 4, 5)),
                        new ArrayList<>(Arrays.asList(4, 6, 2, 8, 7, 9, 7, 6, 4, 5)),
                        new ArrayList<>(Arrays.asList(3, 4, 3, 10, 7, 9, 7, 9, 3, 5)),
                        new ArrayList<>(Arrays.asList(2, 4, 2, 14, 4, 11, 5, 12, 3, 4)),
                        new ArrayList<>(Arrays.asList(1, 4, 2, 49, 2, 4)),
                        new ArrayList<>(Arrays.asList(1, 4, 2, 51, 2, 4)),
                        new ArrayList<>(Arrays.asList(1, 4, 2, 52, 2, 4)),
                        new ArrayList<>(Arrays.asList(1, 4, 2, 51, 2, 4)),
                        new ArrayList<>(Arrays.asList(1, 4, 2, 51, 2, 4)),
                        new ArrayList<>(Arrays.asList(2, 4, 2, 7, 5, 4, 2, 11, 2, 4, 5, 9, 2, 4)),
                        new ArrayList<>(Arrays.asList(3, 4, 3, 5, 6, 1, 6, 7, 6, 1, 6, 8, 2, 4)),
                        new ArrayList<>(Arrays.asList(4, 5, 3, 4, 13, 5, 13, 6, 3, 5)),
                        new ArrayList<>(Arrays.asList(6, 5, 3, 2, 14, 3, 14, 2, 4, 6)),
                        new ArrayList<>(Arrays.asList(7, 6, 3, 1, 14, 1, 14, 1, 3, 7)),
                        new ArrayList<>(Arrays.asList(9, 7, 32, 7)),
                        new ArrayList<>(Arrays.asList(12, 8, 25, 7))
                )
        );
        ArrayList<Integer> vezes = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 6, 5, 5, 5, 6, 14, 14, 10, 10, 10, 4, 4));
        for (int i = 1; i <= 16; i++){
            for (int x = 0; x <= vezes.get(x); x++){
                for (int t = 0; t <= cadaAdicao.get(t).get(t); t++){
                    if (t == 0 || t % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

}