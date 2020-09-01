public class labTwo {
  public static void main(String args[]) {
    // Chanllenge 1
    String word = "picture";
    int halfLength = (int) word.length() / 2;
    String partOne = word.substring(halfLength);
    String partTwo = word.substring(0, halfLength);
    String combo = partOne + partTwo;
    System.out.println(combo);

    String word2 = "scissors";
    int halfWidth = (int) word2.length() / 2;
    String part1 = word2.substring(halfWidth);
    String part2 = word2.substring(0, halfWidth);
    String together = part1 + part2;
    System.out.println(together);

    String word3 = "computer";
    int HalfLength = (int) word3.length() / 2;
    String partOne1 = word3.substring(HalfLength);
    String partTwo2 = word3.substring(0, HalfLength);
    String mix = partOne1 + partTwo2;
    System.out.println(mix);

    // Challenge 2
    System.out.print(" __ \\/ __ \n/o \\{}/ o\\ \n\\\t()\t /\n '> /\\ <'\n (o/\\/\\o)\n  )\t   ( ");
  }
}