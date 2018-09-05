import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class tousendDaysAftrBrith {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String birthDay = in.readLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate after1000d = LocalDate.parse(birthDay, dateTimeFormatter).plusDays(999);

        System.out.println(dateTimeFormatter.format(after1000d));

    }
}