public class Forloop {

  public int sum1To100() {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    return sum;
    
  }

  public static void main(String[] args) {
    // 1️⃣ 印出 1～100
    // for (int i = 1; i <= 100; i++) {
    // System.out.println(i);
    // }

    // 2️⃣ 印出 1～100 的偶數
    // for (int i = 1; i <= 100; i++) {
    // if (i % 2 == 0) {
    // System.out.println(i);
    // }
    // }

    // 3️⃣ 計算 1～100 總和
    // int sum = 0;
    // for (int i = 1; i<=100; i++){
    // sum = sum + i ;
    // }
    // System.out.println(sum);
    
        Forloop f = new Forloop();
    System.out.println(f.sum1To100());



  }
}
