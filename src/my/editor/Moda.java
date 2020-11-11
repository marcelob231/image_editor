
package my.editor;

import java.awt.image.BufferedImage;
import java.awt.Color;

public class Moda {
    double [] red = new double[256];
    double [] green = new double[256];
    double [] blue = new double[256];
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    public Moda(BufferedImage img){
         this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
    }
    
    public BufferedImage modaFiltro(){
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
        
        int[] modaRed = new int[9];
        int[] modaGreen = new int[9];
        int[] modaBlue = new int[9];
        for(int i=1; i<l-1; i++){
            for(int j=1; j<a-1; j++){
                
                modaRed[0] =    finalArray[i][j][0];
                modaRed[1] =    finalArray[i+1][j][0];
                modaRed[2] =    finalArray[i+1][j-1][0];
                modaRed[3] =    finalArray[i][j-1][0];
                modaRed[4] =    finalArray[i-1][j-1][0];
                modaRed[5] =    finalArray[i-1][j][0];
                modaRed[6] =    finalArray[i-1][j+1][0];
                modaRed[7] =    finalArray[i][j+1][0];
                modaRed[8] =    finalArray[i+1][j+1][0];
                
                tmpfinalArray[i][j][0]= Mode(modaRed);

                modaGreen[0] =    finalArray[i][j][1];
                modaGreen[1] =    finalArray[i+1][j][1];
                modaGreen[2] =    finalArray[i+1][j-1][1];
                modaGreen[3] =    finalArray[i][j-1][1];
                modaGreen[4] =    finalArray[i-1][j-1][1];
                modaGreen[5] =    finalArray[i-1][j][1];
                modaGreen[6] =    finalArray[i-1][j+1][1];
                modaGreen[7] =    finalArray[i][j+1][1];
                modaGreen[8] =    finalArray[i+1][j+1][1];
                
                tmpfinalArray[i][j][1]= Mode(modaGreen);
                
                modaBlue[0] =    finalArray[i][j][2];
                modaBlue[1] =    finalArray[i+1][j][2];
                modaBlue[2] =    finalArray[i+1][j-1][2];
                modaBlue[3] =    finalArray[i][j-1][2];
                modaBlue[4] =    finalArray[i-1][j-1][2];
                modaBlue[5] =    finalArray[i-1][j][2];
                modaBlue[6] =    finalArray[i-1][j+1][2];
                modaBlue[7] =    finalArray[i][j+1][2];
                modaBlue[8] =    finalArray[i+1][j+1][2];
                
                tmpfinalArray[i][j][2]= Mode(modaBlue);    
                
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
    
    static int Mode(int[] n){
        int t = 0;
        for(int i=0; i<n.length; i++){
            for(int j=1; j<n.length-i; j++){
                if(n[j-1] > n[j]){
                    t = n[j-1];
                    n[j-1] = n[j];
                    n[j] = t;
                }
            }
        }

        int mode = n[0];
        int temp = 1;
        int temp2 = 1;
        for(int i=1;i<n.length;i++){
            if(n[i-1] == n[i]){
                temp++;
            }
            else {
                temp = 1;
            }
            if(temp >= temp2){
                mode = n[i];
                temp2 = temp;
            }
        }
        return mode;
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
