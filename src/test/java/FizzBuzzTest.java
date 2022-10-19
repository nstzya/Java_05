import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive Testing - Happy path
    //if (start <= end) // - выписываем первое позитивное условие на основе кода!!!
    //return array;

    //1.1. Positive Scenario: start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {//99% Unit-тестов у нас будут без параметров внутри()
        ///Triple A (AAA) Pattern:
        //Arrange:
        int start = 1; //значения для Happy Path Scenario
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
        "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //Act:
//        FizzBuzz fizzBuzz = new FizzBuzz(); //метод из другого класса вызываем, создавая новый объект класса FizzBuzz
//        String[] actualResult = fizzBuzz.fizzBuzz(start, end);
        //НО - МОЖНО СДЕЛАТЬ В ОДНУ СТРОКУ:
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert:
        //в TestNG встроен специальный метод Assert. и нам не нужно создавать свой метод verifyEquals:
        Assert.assertEquals(actualResult, expectedResult);

    }

    //1.2. Positive Scenario: start == end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        ///Triple A (AAA) Pattern:
        //Arrange:
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};//ожидаем при таких входных данных получить массив с одной ячейкой со значением 1

        //Act:
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert:
        Assert.assertEquals(actualResult, expectedResult);

    }

    //1.3. Positive Scenario: start < end and they are negative
    @Ignore //аннотация, чтобы этот тест, что ниже, не запускался
    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        ///Triple A (AAA) Pattern:
        //Arrange:
        int start = -20;
        int end = -1;
        String[] expectedResult = {};

        //Act:
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert:
        Assert.assertEquals(actualResult, expectedResult);

    }

   //2. Negative Testing
   //if (start > end) // - меняем значение на то, которое будет противоположным Happy path,- просто согласно логике
   //return new String[0];

    //2.1. Negative Scenario: start > end
    @Test
    public void testStartGreaterThanEnd_Negative() {
        ///Triple A (AAA) Pattern:
        //Arrange:
        int start = 20;
        int end = 1;
        String[] expectedResult = {}; //это означает пустой массив - что мы и ожидаем в негативном сценарии

        //Act:
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert:
        Assert.assertEquals(actualResult, expectedResult);

    }

}
