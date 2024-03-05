public class ArraysBidimensionales {
    public static void main(String[] args){
//        int [][] matriz = new int[4][5];
// forma de clasica de rellenar una matriz.
//        matriz[0][0] = 15;
//        matriz[0][1] = 21;
//        matriz[0][2] = 18;
//        matriz[0][3] = 8;
//        matriz[0][4] = 15;
//
//        matriz[1][0] = 10;
//        matriz[1][1] = 52;
//        matriz[1][2] = 17;
//        matriz[1][3] = 19;
//        matriz[1][4] = 7;
//
//        matriz[2][0] = 19;
//        matriz[2][1] = 2;
//        matriz[2][2] = 19;
//        matriz[2][3] = 17;
//        matriz[2][4] = 7;
//
//        matriz[3][0] = 92;
//        matriz[3][1] = 13;
//        matriz[3][2] = 13;
//        matriz[3][3] = 32;
//        matriz[3][4] = 41;

//        for(int i = 0; i < 4; i++){
//            for(int f = 0; f < 5; f++){
//                System.out.println("Estas en la posicion: " + i + "," + f + ". El numero que contiene es: " + matriz[i][f] );
//            }
//        }

        int [][] matriz = {
                {10, 12, 14, 15, 16},
                {10, 12, 14, 15, 16},
                {10, 12, 14, 15, 16},
                {10, 12, 14, 15, 16}
        };

        for(int[] fila:matriz){
            System.out.println();
            for(int z: fila){
                System.out.print(z + " | ");
            }
        }
    }
}
