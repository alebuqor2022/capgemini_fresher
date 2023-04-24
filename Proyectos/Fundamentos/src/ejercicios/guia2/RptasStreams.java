package ejercicios.guia2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RptasStreams {

	public static void main(String[] args) {
	List<Curso> cursos = new ArrayList<>();
	cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
	cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
	cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
	cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
	cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    
	
	long respuesta1 = cursos.stream()
            .filter(curso -> curso.getDuracion() > 5)
            .count();
    System.out.println("cantidad de cursos con una duración mayor a 5 horas: " + respuesta1);

    long respuesta2 = cursos.stream()
            .filter(curso -> curso.getDuracion() < 2)
            .count();
    System.out.println("cantidad de cursos con una duración menor a 2 horas: " + respuesta2);

    List<Curso> respuesta3 = cursos.stream()
            .filter(curso -> curso.getVideos() > 50)
            .collect(Collectors.toList());
    
    System.out.println(" cursos con una cantidad de vídeos mayor a 50: \n" + respuesta3);

    Comparator<Curso> comparator = Comparator.comparing(c -> c.getDuracion());
    
    List<Curso> respuesta4 = cursos.stream()
            .sorted(comparator.reversed())
            .limit(3).collect(Collectors.toList());
    System.out.println("los 3 cursos con mayor duración: " + respuesta4);
    
    
    double respuesta5 = cursos.stream().mapToDouble(c -> c.getDuracion()).sum();
    System.out.println("duración total de todos los cursos: " + respuesta5);
    
    double promedioDuracion = cursos.stream().mapToDouble(c -> c.getDuracion()).sum() / cursos.stream().count();
    List<Curso> respuesta6 = cursos.stream()
            .filter(curso -> curso.getDuracion() > promedioDuracion)
            .collect(Collectors.toList());
    System.out.println("libros que superen el promedio en cuanto a duración se refiere: " + respuesta6);

    List<Float> respuesta7 = cursos.stream()
            .filter(curso -> curso.getAlumnos() < 500)
            .map(c -> c.getDuracion()).collect(Collectors.toList());
    
    System.out.println("duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500: " + respuesta7);

    Curso respuesta8 = cursos.stream().max(Comparator.comparing(c -> c.getDuracion())).get();
    System.out.println("curso con mayor duración: " + respuesta8);
    
    List<String> respuesta9 = cursos.stream().map(c -> c.getTitulo()).collect(Collectors.toList());
    System.out.println("lista de Strings con todos los titulos de los cursos: " + respuesta9);

	}
	
}
