/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_arreglos_multidim_3;

/**
 *
 * @author Evelyn
 */
public class EVA1_14_ARREGLOS_MULTIDIM_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][][][] aiArregloMulti = new int[2][3][4][5];
        for (int i = 0; i < aiArregloMulti.length; i++) {//LLENADO DE ARREGLOS DE FORMA ALEATORIA 
            for (int j = 0; j < aiArregloMulti[i].length; j++) {
                for (int k = 0; k < aiArregloMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArregloMulti[i][j][k].length; l++) {
                        aiArregloMulti[i][j][k][l] = (int)(Math.random()*100);
                    }
                }
            }
        }
     for (int i = 0; i < aiArregloMulti.length; i++) {//IMPRIMIMOS LOS VALORES 
            for (int j = 0; j < aiArregloMulti[i].length; j++) {
                for (int k = 0; k < aiArregloMulti[i][j].length; k++) {
                    for (int l = 0; l < aiArregloMulti[i][j][k].length; l++) {
                        System.out.println(aiArregloMulti[i][j][k][l]);
                    }
                }
            }
        }
    }
    
}
