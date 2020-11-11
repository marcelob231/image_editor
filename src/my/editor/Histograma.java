
package my.editor;

import java.awt.image.BufferedImage;
import java.awt.Color;


public class Histograma {
    double [] red = new double[256];
    double [] green = new double[256];
    double [] blue = new double[256];
    
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    
    public Histograma(BufferedImage img){
        
        this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
        
    }
    
    public BufferedImage histo(){
               
        int [][][] finalArray = new int[l][a][4];
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
        
        
        
        int pix = l * a;
        
        for(int i=0; i < 256; i++){
            double tempr = red[i];
            double tempg = green[i];
            double tempb = blue[i];
            tempr = tempr/pix;
            tempg = tempg/pix;
            tempb = tempb/pix;
            red[i] = tempr;
            green[i] = tempg;
            blue[i] = tempb;
        
        }
        
       
        for(int i=1; i < 256; i++){
            red[i] = red[i]+red[i-1];
            green[i] = green[i]+green[i-1];
            blue[i] = blue[i]+blue[i-1];
        }
        
        for(int i=0; i < 256; i++){
            red[i] = red[i]*255;
            green[i] = green[i]*255;
            blue[i] = blue[i]*255;
        }
        
        for(int i=0; i < 256; i++){
            Math.round(red[i]);
            Math.round(green[i]);
            Math.round(blue[i]);
        }
        
         for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                double temp2r = red[finalArray[i][j][0]];
                double temp2g = green[finalArray[i][j][1]];
                double temp2b = blue[finalArray[i][j][2]];
                finalArray[i][j][0] = (int) temp2r;
                finalArray[i][j][1] = (int) temp2g;
                finalArray[i][j][2] = (int) temp2b;
        
            }
        }
       
     //    fillDataset(red);
        
        
         BufferedImage equalizada = getImageFromArray(finalArray, l, a, tipo);
         
       return equalizada; 
    }
    
    public int getRed(int i){
        return (int)red[i];
}
    public int getGreen(int i){
        return (int)green[i];
}
    public int getBlue(int i){
        return (int)blue[i];
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
       
            return image;
    }
    
    


    
    
            
}

   

