public class DemoASCII {
  public static void main(String[] args) {
    // char(0-65535) -> int (21xxxxx)
    char c1 = 'a';

    // Auto-conversion(promotion)
    int asciiValue = 'a';

    System.out.println(asciiValue);// 97

    // ascii標準代碼
    int ascii2 = 'C';
    System.out.println(ascii2);

    int ascii3 = '8';
    System.out.println(ascii3);

    int ascii4 = '好';
    System.out.println(ascii4);// 22909

    int ascii6 = 97;
    // char c2 = ascii6; //potentially risk
    char c2 = 97;
    char c3 = 65000;

    byte b1 = 100;
    byte b2 = 110;
    // byte or short value.. (+-*/) -> int + int
    // 大可以裝細 細唔可以裝大
    int i2 = b1 + b2;
    System.out.println(i2); // 210

  }

}
