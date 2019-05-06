import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void testPrintingCopies(){
        printer.printCopies(5, 6);
        assertEquals(20, printer.getSheets());
    }

    @Test
    public void testNotEnoughPaper(){
        printer.printCopies(25, 5);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void testRefillSheets(){
        printer.printCopies(5, 6);
        printer.refillSheets();
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void testTonerLevel(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void testTonerAfterPrinting(){
        printer.printCopies(5,6);
        assertEquals(70, printer.getToner());
    }


}
