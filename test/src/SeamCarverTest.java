import edu.princeton.cs.algs4.Picture;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SeamCarverTest {


    @Test
    public void energyCalculationTest(){
        Picture pic = new Picture("pics/3x4.png");
        SeamCarver sc = new SeamCarver(pic);
        Assert.assertEquals(Math.sqrt(52024), sc.energy(1,2), 0);
        Assert.assertEquals(Math.sqrt(52225), sc.energy(1,1), 0);
    }


    @Test
    public void findVerticalSeamTest(){
        Picture pic = new Picture("pics/6x5.png");
        SeamCarver sc = new SeamCarver(pic);
        int[] verticalSeam = sc.findVerticalSeam();
        Assert.assertArrayEquals(new int[]{4,3,2}, Arrays.copyOfRange(verticalSeam, 1, verticalSeam.length - 1));
    }


    @Test
    public void findHorizontalSeamTest(){
        Picture pic = new Picture("pics/6x5.png");
        SeamCarver sc = new SeamCarver(pic);
        int[] horizontalSeam =  sc.findHorizontalSeam();
        Assert.assertArrayEquals(new int[]{2,1,2,1}, Arrays.copyOfRange(horizontalSeam, 1, horizontalSeam.length - 1));
//        pic = new Picture("pics/10x12.png");
//        sc = new SeamCarver(pic);
//        horizontalSeam =  sc.findHorizontalSeam();
    }


    @Test
    public void removeVerticalSeamTest(){
        Picture pic = new Picture("pics/6x5.png");
        SeamCarver sc = new SeamCarver(pic);
        int[] verticalSeam = new int[] {2, 2, 1, 0, 1};
        sc.removeVerticalSeam(verticalSeam);
        Assert.assertEquals( 5 ,sc.height());
        Assert.assertEquals(5 ,sc.width());
    }
}
