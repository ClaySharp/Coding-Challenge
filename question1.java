public class question1 {

  public static void main(String[] args) {
    question1 questionObj = new question1();
    String answer = questionObj.reverseInput(args[0]);
    System.out.println(answer);
  }

  public String reverseInput(String input) {
    StringBuilder sb = new StringBuilder();
    for(int i = (input.length()-1); i >= 0; i--) {
      sb.append(input.charAt(i));
    }
    return sb.toString();
  }

}
