package calculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

//    @Test
//    public void sumaTest(){
//        fail("Debe fallar");
//    }

    private Calculadora calculadora;
    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }
    @AfterEach
    public void tearDown(){
        calculadora = null;
    }

    @Test
    public void sumaTestCincoMasCinco(){
        //assertEquals(10, calculadora.suma(5, 5), 0.001);
        assertThat(calculadora.suma(5,5), is(10.0));
    }

    @Test
    public void restaTestCincoMenosCinco(){
        assertEquals(0, calculadora.resta(5,5), 0.005);
    }

    @Test
    public void multiplicacionTest(){
        assertEquals(4, calculadora.multiplicacion(2,2), 0.001);
    }



}
