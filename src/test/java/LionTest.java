import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
@Mock
    Feline feline;

@Test
    public void testGetKittens() throws Exception {
    Lion lion = new Lion("Самец", feline);
    Mockito.when(feline.getKittens()).thenReturn(1);
    assertEquals(1, lion.getKittens());
}

@Test
    public void testWhenSexFemaleDoesHaveManeFalse () throws Exception {
    Lion lion = new Lion("Самка", feline);
    assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testWhenSexMaleDoesHaveManeTrue () throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }
@Test
    public void testInvalidSexException() {
        InterruptedException exception = assertThrows(InterruptedException.class, () -> {
                Lion lion = new Lion("Другое", feline);});
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
