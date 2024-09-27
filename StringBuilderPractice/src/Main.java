//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('r');
        sb.append("ohith");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(3,sb.length()-1));
    }
}