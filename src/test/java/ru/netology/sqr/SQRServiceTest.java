package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdataequals.csv"})
    void shouldFindForEqualsExpected(int first, int second, int expected) {
        SQRService service = new SQRService();

        int numbers = SQRService.SQRFind(first, second);

        assertEquals(expected, numbers);
        System.out.println(numbers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdatanotequals.csv"})
    void shouldFindForNotEqualsExpected(int first, int second, int unexpected) {
        SQRService service = new SQRService();

        int numbers = SQRService.SQRFind(first, second);

        assertNotEquals(unexpected, numbers);
        System.out.println(numbers);
    }
}
