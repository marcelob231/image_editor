
package my.editor;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.util.Arrays;

public class Mediana {
    double [] red = new double[256];
    double [] green = new double[256];
    double [] blue = new double[256];
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    public Mediana(BufferedImage img){
         this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
    }
    
    public BufferedImage medianaFiltro(){
        int [][][] finalArray = new int[l][a][4];
        int [][][] tmpfinalArray = new int[l][a][4];
        for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                Color rgb = new Color(imagemFinal.getRGB(i,j));
          
                int r = rgb.getRed();

                int g = rgb.getGreen();
                int b = rgb.getBlue();
                int alp = rgb.getAlpha();
       
                red[r] = red[r]+1;
                green[g] = green[g]+1;
                blue[b] = blue[b]+1;
             
                finalArray[i][j][0] = r;
                finalArray[i][j][1] = g;
                finalArray[i][j][2] = b;
                finalArray[i][j][3] = alp;
            }
        }
        
        int[] medianaRed = new int[9];
        int[] medianaGreen = new int[9];
        int[] medianaBlue = new int[9];
        for(int i=1; i<l-1; i++){
            for(int j=1; j<a-1; j++){
                
                medianaRed[0] =    finalArray[i][j][0];
                medianaRed[1] =    finalArray[i+1][j][0];
                medianaRed[2] =    finalArray[i+1][j-1][0];
                medianaRed[3] =    finalArray[i][j-1][0];
                medianaRed[4] =    finalArray[i-1][j-1][0];
                medianaRed[5] =    finalArray[i-1][j][0];
                medianaRed[6] =    finalArray[i-1][j+1][0];
                medianaRed[7] =    finalArray[i][j+1][0];
                medianaRed[8] =    finalArray[i+1][j+1][0];
                
                tmpfinalArray[i][j][0]= Mediana(medianaRed);

                medianaGreen[0] =    finalArray[i][j][1];
                medianaGreen[1] =    finalArray[i+1][j][1];
                medianaGreen[2] =    finalArray[i+1][j-1][1];
                medianaGreen[3] =    finalArray[i][j-1][1];
                medianaGreen[4] =    finalArray[i-1][j-1][1];
                medianaGreen[5] =    finalArray[i-1][j][1];
                medianaGreen[6] =    finalArray[i-1][j+1][1];
                medianaGreen[7] =    finalArray[i][j+1][1];
                medianaGreen[8] =    finalArray[i+1][j+1][1];
                
                tmpfinalArray[i][j][1]= Mediana(medianaGreen);
                
                medianaBlue[0] =    finalArray[i][j][2];
                medianaBlue[1] =    finalArray[i+1][j][2];
                medianaBlue[2] =    finalArray[i+1][j-1][2];
                medianaBlue[3] =    finalArray[i][j-1][2];
                medianaBlue[4] =    finalArray[i-1][j-1][2];
                medianaBlue[5] =    finalArray[i-1][j][2];
                medianaBlue[6] =    finalArray[i-1][j+1][2];
                medianaBlue[7] =    finalArray[i][j+1][2];
                medianaBlue[8] =    finalArray[i+1][j+1][2];
                
                tmpfinalArray[i][j][2]= Mediana(medianaBlue);    
                
            }
        }
        
        
        for(int i=1; i<l-1; i++){
            for(int j=1; j<a-1; j++){
                finalArray[i][j][0] = tmpfinalArray[i][j][0];
                finalArray[i][j][1] = tmpfinalArray[i][j][1];
                finalArray[i][j][2] = tmpfinalArray[i][j][2];
            }
        }
         BufferedImage equalizada = getImageFromArray(finalArray, l, a, tipo);
         
       return equalizada; 
    }
    
    static int Mediana(int[] n){
        Arrays.sort(n);
        return n[4];
    }
    
    public BufferedImage getImageFromArray(int[][][]matrix, int width, int height, int tipo) {
            BufferedImage image = new BufferedImage(width, height, tipo);
            
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    
                    int r = matrix[i][j][0];
                    int g = matrix[i][j][1];
                    int b = matrix[i][j][2];
                    int alp = matrix[i][j][3];
                    
                   int col = (alp << 24) | (r << 16) | (g << 8) | b;
                    image.setRGB(i, j, col);
                }
            }
            return image;
    }
}
