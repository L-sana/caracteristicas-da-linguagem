package ExercicioComIntStream;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.stream.IntStream;

public class ExercicioIntStream {
    public static void main(String[] args) {

        // teste basico IntStream laço de repetição

        IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
            System.out.println(n);
        });

        IntStream.range(0,5).forEach( n ->{
            System.out.println("Número = " + n);
        });

    }
}
