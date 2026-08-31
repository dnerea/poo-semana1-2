// Main.java — prueba de las clases Estudiante y Calculadora
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana García", 1001, 16.5);
        Estudiante e2 = new Estudiante("Luis Torres", 1002, 14.0);
        Estudiante e3 = new Estudiante("Rosa Díaz",  1003, 18.0);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());

        Calculadora calc = new Calculadora();
        System.out.println("Suma int: " + calc.sumar(5, 3));
        System.out.println("Suma double: " + calc.sumar(2.5, 1.5));
        System.out.println("Suma 3 int: " + calc.sumar(1, 2, 3));
        calc.mostrarHistorial();
        System.out.println("Total operaciones: " + Calculadora.getTotalOperaciones());
    }
}
