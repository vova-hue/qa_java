import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;

    @Test
    public void testGetKittensNoParamReturnOne() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testGetKittensParamFiveReturnFive() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeatPredator() throws Exception {
        List<String> list = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(list, feline.eatMeat());
    }
}
