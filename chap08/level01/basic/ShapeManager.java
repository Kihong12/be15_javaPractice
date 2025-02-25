package com.kihongkim.level01.basic;

import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
    public void addShape(Shape shape) {
        if (index >= shapes.length) {
            shapes = Arrays.copyOf(shapes, shapes.length * 2);
        }
        shapes[index++] = shape;
    }

    /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
    public void removeShape(Shape shape) {
        for (int i = 0; i < index; i++) {
            if (shapes[i].equals(shape)) {
                for (int j = i; j < index - 1; j++) {
                    shapes[j] = shapes[j + 1];
                }
                shapes[index - 1] = null;
                index--;
                break;
            }
        }
    }

    /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
    public void printAllShapes() {
        for (int i = 0; i < index; i++) {
            System.out.println("Shape : " + shapes[i].getClass().getSimpleName());
            System.out.println("Area : " + shapes[i].calculateArea());
            System.out.println("Perimeter : " + shapes[i].calculatePerimeter());
        }
    }

    /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
    public double getTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < index; i++) {
            totalArea += shapes[i].calculateArea();
        }
        return totalArea;
    }

    /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < index; i++) {
            totalPerimeter += shapes[i].calculatePerimeter();
        }
        return totalPerimeter;
    }








}
