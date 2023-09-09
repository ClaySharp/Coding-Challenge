public class question3 {

  public static void main(String[] args) {
    int[] newArgs = {Integer.parseInt(args[0])};

    question3 questionObj = new question3();
    int answer = questionObj.findFactorial(newArgs[0]);
    System.out.println(answer);
  }

  public int findFactorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * findFactorial(n-1);
  }

}
