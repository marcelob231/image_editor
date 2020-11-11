
package my.editor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;


public class XorArit {

    int l1 = 0;
    int a1 = 0;
    BufferedImage imagemFinal1;

    int l2 = 0;
    int a2 = 0;
    BufferedImage imagemFinal2;
    
    
    int tipo = 0;
    int finalL;
    int finalA;
   
    
    public XorArit(BufferedImage img1, BufferedImage img2){
        l1 = img1.getWidth();
        a1 = img1.getHeight();
        imagemFinal1 = img1;
        l2 = img2.getWidth();
        
        a2 = img2.getHeight();
        imagemFinal2 = img2;
        tipo = img2.getType();
        
    }
    
    public BufferedImage xorDuas(){
        
        
        if (l1 >l2){
            finalL = l1;
        }else{
            finalL = l2;
        } 
        if (a1 >a2){
            finalA = a1;
        }else{
            finalA = a2;
        }
        int [][][] finalArray3 = new int [finalL][finalA][4];
        
        int [][][] finalArray1 = new int[l1][a1][4];
        
        for(int i=0; i<l1; i++){
            for(int j=0; j<a1; j++){
                Color rgb1 = new Color(imagemFinal1.getRGB(i,j));
          
                int r = rgb1.getRed();

                int g = rgb1.getGreen();
                int b = rgb1.getBlue();
                int alp = rgb1.getAlpha();
       
                finalArray1[i][j][0] = r;
                finalArray1[i][j][1] = g;
                finalArray1[i][j][2] = b;
                finalArray1[i][j][3] = alp;
            }
        }
        
    
        int [][][] finalArray2 = new int[l2][a2][4];
        
        for(int i=0; i<l2; i++){
            for(int j=0; j<a2; j++){
                Color rgb2 = new Color(imagemFinal2.getRGB(i,j));
          
                int r = rgb2.getRed();

                int g = rgb2.getGreen();
                int b = rgb2.getBlue();
                int alp = rgb2.getAlpha();
       
                finalArray2[i][j][0] = r;
                finalArray2[i][j][1] = g;
                finalArray2[i][j][2] = b;
                finalArray2[i][j][3] = alp;
            }
        }
    
         for(int i=0; i<finalL; i++){
            for(int j=0; j<finalA; j++){
                finalArray3[i][j][0] = finalArray1[i][j][0] ^ finalArray2[i][j][0];
                finalArray3[i][j][1] = finalArray1[i][j][1] ^ finalArray2[i][j][1];
                finalArray3[i][j][2] = finalArray1[i][j][2] ^ finalArray2[i][j][2];
                finalArray3[i][j][3] = finalArray1[i][j][3] ^ finalArray2[i][j][3];
                
                if(finalArray3[i][j][0]<0){
                    finalArray3[i][j][0] = 0;
                }
                if(finalArray3[i][j][1]<0){
                    finalArray3[i][j][1] = 0;
                }
                if(finalArray3[i][j][2]<0){
                    finalArray3[i][j][2] = 0;
                }
                if(finalArray3[i][j][3]<0){
                    finalArray3[i][j][3] = 0;
                }

            }
         }
         
         BufferedImage equalizada = getImageFromArray(finalArray3, finalL, finalA, tipo);
         
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
                    
                   
                   int col = (alp << 24) | (r << 16) | (g << 8) | b;
                    
                    image.setRGB(i, j, col);
                }
            }
            
            return image;
    }
    
   
    
}
