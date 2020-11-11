/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.editor;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author Marcelo
 */
public class PassaBanda {
    
  
    
    int [] new_red = new int[256];
    int [] new_green = new int[256];
    int [] new_blue = new int[256];
    
    
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    int verm = 0;
    int verd = 0;
    int azu = 0;
    
    
    
    public PassaBanda (BufferedImage img, int vermelho, int verde, int azul){
        this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
        
        verm = vermelho;
        verd = verde;
        azu = azul;
        
        
        
    }
    public BufferedImage passaBandaFiltro(){
        
        int [][][] finalArray = new int[l][a][4];
        
        for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                Color rgb = new Color(imagemFinal.getRGB(i,j));
        
                int r = rgb.getRed();
                int g = rgb.getGreen();
                int b = rgb.getBlue();
                int alp = rgb.getAlpha();
              
                finalArray[i][j][0] = r;
                finalArray[i][j][1] = g;
                finalArray[i][j][2] = b;
                finalArray[i][j][3] = alp;
            }
                
        }
        
        for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                finalArray[i][j][0] = finalArray[i][j][0]+ verm;
                if(finalArray[i][j][0]<0){
                    finalArray[i][j][0] = 0;
                }
                if(finalArray[i][j][0]>255){
                    finalArray[i][j][0] = 255;
                }
            }
        }
         for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                finalArray[i][j][1] = finalArray[i][j][1]+ verd;
                if(finalArray[i][j][1]<0){
                    finalArray[i][j][1] = 0;
                }
                if(finalArray[i][j][1]>255){
                    finalArray[i][j][1] = 255;
                }
            }
        }
        for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                finalArray[i][j][2] = finalArray[i][j][2]+ azu;
                if(finalArray[i][j][2]<0){
                    finalArray[i][j][2] = 0;
                }
                if(finalArray[i][j][2]>255){
                    finalArray[i][j][2] = 255;
                }
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
    
