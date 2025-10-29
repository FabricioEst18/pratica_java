package CursoJava.OrientacaoObjeto.entities;

public class Student {
    public String name;
    public float nota1;
    public float nota2;
    public float nota3;

    public float finalGrade() {
        return nota1 + nota2 + nota3;
    }

    public String result() {
        float total = finalGrade();
        if (total >= 60.0f) {
            return "PASS";
        } else {
            float missing = 60.0f - total;
            return String.format("FAILED%nMISSING %.2f POINTS", missing);
        }
    }

    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + result();
    }
}
