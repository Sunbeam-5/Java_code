import java.util.Scanner;

public class 字符串最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split("\\s+");
        int length = s[s.length - 1].length();
        System.out.println(length);
    }
}
