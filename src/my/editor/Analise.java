/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Marcelo
 */
public class Analise {
    
  
    
    int [] new_red = new int[256];
    int [] new_green = new int[256];
    int [] new_blue = new int[256];
    
    
    int l = 0;
    int a = 0;
    BufferedImage imagemFinal;
    int tipo = 0;
    
    ChartPanel CP;
    ChartPanel CP2;
    ChartPanel CP3;
    
    public Analise (BufferedImage img){
        this.l = img.getWidth();
        this.a = img.getHeight();
        this.imagemFinal = img;
        this.tipo = img.getType();
        
    }
    public void toMatrix(){
        
        int [][][] finalArray = new int[l][a][4];
        for(int i=0; i<l; i++){
            for(int j=0; j<a; j++){
                Color rgb = new Color(imagemFinal.getRGB(i,j));
        
                int r = rgb.getRed();
        
                int g = rgb.getGreen();
                int b = rgb.getBlue();
                int alp = rgb.getAlpha();
              
                new_red[r] = new_red[r]+1;
                new_green[g] = new_blue[g]+1;
                new_blue[b] = new_blue[b]+1;
                
                
                    finalArray[i][j][0] = r;
                    finalArray[i][j][1] = g;
                    finalArray[i][j][2] = b;
                    finalArray[i][j][3] = alp;
                }
                
            }
        
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjRed = new Integer(getRed(i));
                Number numObjRed = (Number)intObjRed;
                dataset.addValue(numObjRed,"1", i);
            }
            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjGreen = new Integer(getGreen(i));
                Number numObjGreen = (Number)intObjGreen;
                dataset2.addValue(numObjGreen,"1", i);
            }
            DefaultCategoryDataset dataset3 = new DefaultCategoryDataset();
            for(int i = 0; i < 256; i++){
                Integer intObjBlue = new Integer(getBlue(i));
                Number numObjBlue = (Number)intObjBlue;
                dataset3.addValue(numObjBlue,"1", i);
            }
            
       
            JFreeChart chart = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            JFreeChart chart2 = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset2, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            JFreeChart chart3 = ChartFactory.createBarChart(
            "", // chart title
            "", // domain axis label
            "", // range axis label
            dataset3, // data
            PlotOrientation.VERTICAL, // orientation
            false, // include legend
            false, // tooltips
            false // urls
            );
            chart.setBackgroundPaint(Color.white);
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.lightGray);
            plot.setRangeGridlinePaint(Color.white);
            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, Color.red);
            renderer.setItemMargin(0.0);
            renderer.setDrawBarOutline(false);
            renderer.setMaximumBarWidth(0.1);
            
            chart2.setBackgroundPaint(Color.white);
            CategoryPlot plot2 = (CategoryPlot) chart2.getPlot();
            plot2.setBackgroundPaint(Color.lightGray);
            plot2.setRangeGridlinePaint(Color.white);
            BarRenderer renderer2 = (BarRenderer) plot2.getRenderer();
            renderer2.setSeriesPaint(0, Color.green);
            renderer2.setItemMargin(0.0);
            renderer2.setDrawBarOutline(false);
            renderer2.setMaximumBarWidth(0.1);
            
            chart3.setBackgroundPaint(Color.white);
            CategoryPlot plot3 = (CategoryPlot) chart3.getPlot();
            plot3.setBackgroundPaint(Color.lightGray);
            plot3.setRangeGridlinePaint(Color.white);
            BarRenderer renderer3 = (BarRenderer) plot3.getRenderer();
            renderer3.setSeriesPaint(0, Color.blue);
            renderer3.setItemMargin(0.0);
            renderer3.setDrawBarOutline(false);
            renderer3.setMaximumBarWidth(0.1);
            
            CP = new ChartPanel(chart);
            CP2 = new ChartPanel(chart2);
            CP3 = new ChartPanel(chart3);
            
        
    }
    public int getRed(int i){
        return new_red[i];
    }
    public int getGreen(int i){
        return new_green[i];
    }
    public int getBlue(int i){
        return new_blue[i];
    }
    
    public ChartPanel CP(int i){
        return CP;
    }
    public ChartPanel CP2(int i){
        return CP2;
    }
    public ChartPanel CP3(int i){
        return CP3;
    }
    
}
