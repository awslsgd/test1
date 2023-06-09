package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }

    @Test
    @DisplayName("等边三角形")
    void Equilateral_triangle_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 3, 3);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName("等腰三角形")
    void isosceles_triangle_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 3, 1);
        assertEquals("等腰三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void Non_triangular_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(1, 2, 3);
        assertEquals("非三角形", type);
    }
}
