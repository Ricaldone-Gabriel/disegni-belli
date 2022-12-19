/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdisegni;

import java.awt.Color;

/**
 *
 * @author gabriel.ricaldone
 */
public class Pallina {
    private int x;
    private int y;
    private int width;
    private int height;
    private int xSpeed;
    private int ySpeed;
    private Color color;
    
    Pallina(int width,int height) {
        
        int r,g,b;
        
        r = (int) (Math.random() * 255);
        g = (int) (Math.random() * 255);
        b = (int) (Math.random() * 255);
        
        x = (int) (Math.random() * width + 20);
        y = (int) (Math.random() * height + 20);
        this.width = (int)(Math.random() * 15 + 5);
        this.height = this.width;
        xSpeed = (int)(Math.random() * 5 + 1);
        ySpeed = (int)(Math.random() * 5 + 1);
        color = new Color(r,g,b);
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public Color getColor() {
        return color;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}

