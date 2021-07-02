package bitmap.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;


public class BitMapTest {
    @Test
    public void testGetRGB(){
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(new Color(12,25,26));
        colors.add(new Color(12,25,250));
        colors.add(new Color(95,0,125));
        int expectedLength = 3;
        int actualOne = BitMap.getRGBA(colors).size();
        Assertions.assertEquals(expectedLength,actualOne);
    }

    @Test public void testCreateBitMap(){
        BitMap bitmap = new BitMap("app/src/main/resources/bitmap.bmp","app/src/main/resources/newbitmap.bmp");
        String expected = null;
        String actual = new BitMap("app/src/main/resources/bitmap.bmp","app/src/main/resources/").transformName;
    }

}
