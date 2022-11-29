package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int length = cathetusLength * 2 - 1;
        int half = length / 2;
        for (int y = 0; y < cathetusLength; y++) {
            for (int x = 0; x < length; x++) {
                if (x >= half - y && x <= half + y) {
                    System.out.print(x <= half ? half+1-x : x - half + 1);
                }
                else if (x < half + y) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
