public class Actividad2 {

    public static String fullName = "";
    public static Float[] grades = new Float[5];

    public static float grade_average(Float[] grades){
        float gpa = 0.0f;
        for (Float grade : grades) {
            gpa += grade;
        }
        gpa = gpa/grades.length;
        return gpa;
    }

    public static char final_grade(float gpa){
        char fg='?';
        if(gpa>=91 && gpa<=100){
            fg='A';
        }else if(gpa>=81 && gpa<=90){
            fg='B';
        }else if(gpa>=71 && gpa<=80){
            fg='C';
        }else if(gpa>=61 && gpa<=70){
            fg='D';
        }else if(gpa>=51 && gpa<=60){
            fg='E';
        }else if(gpa>=0 && gpa<=50){
            fg='F';
        }else{
            System.out.println("El promedio no es valido, debe estar entre 0 a 100.");
        }
        return fg;
    }

    public static void program_results(String fullName, float gpa, char fg){
        String result = String.format("Nombre del estudiante: %s \nCalificación 1: %.2f \nCalificación 2: %.2f \nCalificación 3: %.2f \nCalificación 4: %.2f \nCalificación 5: %.2f \nPromedio: %.2f \nCalificación: %c",fullName,grades[0],grades[1],grades[2],grades[3],grades[4],gpa,fg);
        System.out.println(result);
    }
    public static void main(String[] args) {
        fullName = "Linda Gómez";
        grades[0] = 88.0f;
        grades[1] = 92.5f;
        grades[2] = 75.0f;
        grades[3] = 95.5f;
        grades[4] = 98.0f;
        float gpa= grade_average(grades);
        char fg = final_grade(gpa);
        program_results(fullName,gpa,fg);
    }
}