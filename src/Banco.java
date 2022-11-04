import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Banco {
    private static LocalDateTime dt;

    public static void validarOperacao(String tipo){
        dt = LocalDateTime.now();

        System.out.println(String.format("Operação de tipo %s realizada em ", tipo)+ dt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss")));
    }
}
