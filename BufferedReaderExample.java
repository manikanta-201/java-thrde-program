import java.io.*;

public class BufferedReaderExample{
public static void main(String[] args) throws IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Your Age : ");

int age = Integer.parseInt(reader.readLine());
System.out.println(" you are " + age + " years old ");
}
}
