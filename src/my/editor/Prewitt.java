
package my.editor;

import java.awt.image.BufferedImage;
import java.awt.Color;

public class Prewitt {
    double [] red = new double[256];
    double [] green = new double[256];
    double [] blue = new double[256];
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    public Prewitt(BufferedImage img){
        this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
    }
    
    public BufferedImage prewittArit(){
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
        
        
        for(int i=1; i<l-1; i++){
            for(int j=1; j<a-1; j++){
                double tempRedx = finalArray[i][j][0]*0 + finalArray[i+1][j][0]*0 + finalArray[i+1][j-1][0]*1 + finalArray[i][j-1][0]*1 + finalArray[i-1][j-1][0]*1 + finalArray[i-1][j][0]*0 + finalArray[i-1][j+1][0]*(-1) + finalArray[i][j+1][0]*(-1) + finalArray[i+1][j+1][0]*(-1);
                double tempRedy = finalArray[i][j][0]*0 + finalArray[i+1][j][0]*(-1) + finalArray[i+1][j-1][0]*(-1) + finalArray[i][j-1][0]*0 + finalArray[i-1][j-1][0]*1 + finalArray[i-1][j][0]*1 + finalArray[i-1][j+1][0]*1 + finalArray[i][j+1][0]*0 + finalArray[i+1][j+1][0]*(-1);
                tmpfinalArray[i][j][0] = (int)Math.sqrt((tempRedx * tempRedx) + (tempRedy * tempRedy));
                if(finalArray[i][j][0]> 255){
                    finalArray[i][j][0]= 255;
                }
                if(finalArray[i][j][0]< 0){
                    finalArray[i][j][0]= 0;
                }
                double tempGreenx = finalArray[i][j][1]*0 + finalArray[i+1][j][1]*0 + finalArray[i+1][j-1][1]*1 + finalArray[i][j-1][1]*1 + finalArray[i-1][j-1][1]*1 + finalArray[i-1][j][1]*0 + finalArray[i-1][j+1][1]*(-1) + finalArray[i][j+1][1]*(-1) + finalArray[i+1][j+1][1]*(-1);
                double tempGreeny = finalArray[i][j][1]*0 + finalArray[i+1][j][1]*(-1) + finalArray[i+1][j-1][1]*(-1) + finalArray[i][j-1][1]*0 + finalArray[i-1][j-1][1]*1 + finalArray[i-1][j][1]*1 + finalArray[i-1][j+1][1]*1 + finalArray[i][j+1][1]*0 + finalArray[i+1][j+1][1]*(-1);
                tmpfinalArray[i][j][1] = (int)Math.sqrt((tempGreenx * tempGreenx) + (tempGreeny * tempGreeny));
                if(finalArray[i][j][1]> 255){
                    finalArray[i][j][1]= 255;
                }
                if(finalArray[i][j][1]< 0){
                    finalArray[i][j][1]= 0;
                }
                double tempBluex = finalArray[i][j][2]*0 + finalArray[i+1][j][2]*0 + finalArray[i+1][j-1][2]*1 + finalArray[i][j-1][2]*1 + finalArray[i-1][j-1][2]*1 + finalArray[i-1][j][2]*0 + finalArray[i-1][j+1][2]*(-1) + finalArray[i][j+1][2]*(-1) + finalArray[i+1][j+1][2]*(-1);
                double tempBluey = finalArray[i][j][2]*0 + finalArray[i+1][j][2]*(-1) + finalArray[i+1][j-1][2]*(-1) + finalArray[i][j-1][2]*0 + finalArray[i-1][j-1][2]*1 + finalArray[i-1][j][2]*1 + finalArray[i-1][j+1][2]*1 + finalArray[i][j+1][2]*0 + finalArray[i+1][j+1][2]*(-1);
                tmpfinalArray[i][j][2] = (int)Math.sqrt((tempBluex * tempBluex) + (tempBluey * tempBluey)); //(int) Math.round(tempBlue);
                if(finalArray[i][j][2]> 255){
                    finalArray[i][j][2]= 255;
                }
                if(finalArray[i][j][2]< 0){
                    finalArray[i][j][2]= 0;
                }
//    finalArray[i][j][3] = finalArray[i][j][3] + finalArray[i+1][j][3] + finalArray[i+1][j-1][3] + finalArray[i][j-1][3] + finalArray[i-1][j-1][3] + finalArray[i-1][j][3] + finalArray[i-1][j+1][3] + finalArray[i][j+1][3];
                
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
    
    public BufferedImage getImageFromArray(int[][][]matrix, int width, int height, int tipo) {
            BufferedImage image = new BufferedImage(width, height, tipo);
            
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    
                    int r = matrix[i][j][0];
                    int g = matrix[i][j][1];
                    int b = matrix[i][j][2];
                    int alp = matrix[i][j][3];
                    
                   // Color col = new Color(r,g,b);
                   int col = (alp << 24) | (r << 16) | (g << 8) | b;
                    //System.out.println(col);
                    image.setRGB(i, j, col);
                }
            }
            //System.out.println(image);
            return image;
    }
}
