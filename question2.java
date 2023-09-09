public class question2 {

  public static void main(String[] args) {
    int[] newArgs = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};

    question2 questionObj = new question2();
    int answer = questionObj.findLargestInt(newArgs[0], newArgs[1], newArgs[2]);
    System.out.println(answer);
  }

  public int findLargestInt(int x, int y, int z) {
    int biggestXY = Math.max(x, y);
    return Math.max(biggestXY, z);
  }

}
