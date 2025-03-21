package wk09.order;

import wk09.cafe.CoffeeFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterTest {

    Register reg;
    static final String location = "src/test/java/order/";
    static final String logFilename = location + "log.txt";
    static FileOutputStream logWriter;
    static PrintStream oldOut;

    @BeforeAll
    static void logSetup() throws IOException {
        oldOut = System.out;
        logWriter = new FileOutputStream(logFilename);
        PrintStream ps = new PrintStream(logWriter);
        System.setOut(ps);
    }

    @AfterAll
    static void logClose() throws IOException {
        logWriter.close();
        System.setOut(oldOut);
    }

    @BeforeEach
    void setUp() {
        reg = new Register();
        reg.addOrderable(new CoffeeFactory());
    }


    @Test
    void orderOneCoffee() throws IOException {
        String filename = location + "order_one_coffee.txt";
        FileReader fr = new FileReader(filename);
        Scanner fs = new Scanner(fr);
        reg.order(fs);
        assertEquals("Total: $2.50", reg.getOrder().getTotalString());

        fr.close();
    }
}