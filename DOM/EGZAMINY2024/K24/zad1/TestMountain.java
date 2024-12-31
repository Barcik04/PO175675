package zad1;

import java.util.Arrays;

public class TestMountain {
    public static void main(String[] args){
        double[] heights = {1299, 1921, 2590, 3826, 4511};

        Mountain m1 = new Mountain("Mount Blanc", heights);

        try {
            Mountain mCloned = m1.clone();

            heights[2] = 8888.91;
            mCloned.setHeights(heights);

            System.out.println(Arrays.toString(m1.getHeights()));
            System.out.println(Arrays.toString(mCloned.getHeights()));
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
