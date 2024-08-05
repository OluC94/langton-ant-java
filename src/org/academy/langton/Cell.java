package org.academy.langton;

import processing.core.PApplet;

import java.util.Objects;

public class Cell {
    private boolean isActive;
    private final GridPosition gridPosition;
    private int cellColour;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        isActive = false;
        cellColour = 255;
    }

    public boolean toggleActive(){
        isActive = !isActive;
        return isActive;
    }

    public void setActive(boolean value){
        isActive = value;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setCellColour(String newColour) {
        if (Objects.equals(newColour, "white")){
            cellColour = 42;
        }
        if (Objects.equals(newColour, "black")){
            cellColour = 255;
        }
        if (Objects.equals(newColour, "red")){
            PApplet p5 = new PApplet();
            cellColour = p5.color(255, 0, 0);
        }
    }

    public int getCellColour() {
        return cellColour;
    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
