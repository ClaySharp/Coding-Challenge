public class question4 {

  public static void main(String[] args) {
    int[] newArgs = {Integer.parseInt(args[0])};

    question4 questionObj = new question4();
    int answer = questionObj.fibonacciSequence(newArgs[0]);
    System.out.println(answer);
  }

  public int fibonacciSequence(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacciSequence(n-1) + fibonacciSequence(n-2);
  }

}
