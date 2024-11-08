package com.mycompany.emanuelherencia;

// Superclase Formas
class Formas {
    protected String color;

    public void establecerColor(String color) {
        this.color = color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }
}

// Subclase Circulo
class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println("Dibujando un circulo.");
    }

    public double calcularRadio() {
        return this.radio;
    }
}

// Subclase Linea
class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    public void dibujar() {
        System.out.println("Dibujando una linea.");
    }

    public double obtenerLargo() {
        return this.largo;
    }
}

// Subclase Triangulo
class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    public void dibujar() {
        System.out.println("Dibujando un triangulo.");
    }

    public double calcularArea() {
        return (Math.sin(Math.toRadians(angulo)) / 2); // Ejemplo de cálculo simplificado
    }
}

// Subclase Cuadrado
class Cuadrado extends Formas {
    private double area;

    public Cuadrado(double lado) {
        this.area = lado * lado;
    }

    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }

    public double calcularArea() {
        return this.area;
    }
}

// Clase principal EmanuelHerencia
public class EmanuelHerencia {

    public static void main(String[] args) {
        // Crear instancias de cada forma
        Circulo circulo = new Circulo(5.0);
        Linea linea = new Linea(10.0);
        Triangulo triangulo = new Triangulo(60.0);
        Cuadrado cuadrado = new Cuadrado(4.0);

        // Establecer color
        circulo.establecerColor("Rojo");
        linea.establecerColor("Azul");
        triangulo.establecerColor("Verde");
        cuadrado.establecerColor("Amarillo");

        // Dibujar cada forma
        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();

        // Calcular propiedades específicas
        System.out.println("Radio del circulo: " + circulo.calcularRadio());
        System.out.println("Largo de la linea: " + linea.obtenerLargo());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
