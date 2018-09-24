import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        final String NAME_CLASS_REGEX = ("^[CAP]\\d{4}[GHIKLM]$");
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        System.out.println("Nhập vào tên lớp học cần kiểm tra:");
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.next();
        Matcher matcher = pattern.matcher(nameClass);
        boolean res = matcher.matches();
        if (res) {
            System.out.println("Tên lớp hợp lệ!");
        } else {
            System.out.println("Tên lớp không hợp lệ!");
        }
    }
}
