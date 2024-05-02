class Example1 extends ConsoleProgram {
  public void run() {
    int[] marks;
    marks = new int[5];

    marks[0] = 75;
    marks[1] = 81;
    marks[2] = 67;
    marks[3] = 85;
    marks[4] = 91;

    int[] absences = {3, 2, 1, 0, 4};

    String[] names;
    names = new String[5];

    names[0] = "Aaron";
    names[1] = "Bob";
    names[2] = "Charles";
    names[3] = "David";
    names[4] = "Edward";

    System.out.println(names[2] + ":");
    System.out.println("Mark = " + marks[2]);
    System.out.println("Absences = " + absences[2]);
  }
}
