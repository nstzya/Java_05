public class FizzBuzz {

//Написать код, который будет возвращать массив String[]
//Fizz - для всех чисел % 3 == 0, Buzz - для % 5 == 0
// и FizzBuzz - для тех, которые одновременно % 3 == 0 && % 5 == 0.
//Во всех других случаях будет возвращаться число, но -
// - в строковом формате.
    public String[] fizzBuzz(int start, int end) {
        if (start <= end) {// проверка всегда начинается с happy path!!!!
            String[] array = new String[end - start + 1];
//мы не будем делать вложенные циклы for, чтобы заполнить индексы ячеек массива и затем заполнить значениями
//эти ячейки. мы просто делаем дополнительный инкремент от start ++
// и вписываем дополнительное условие выхода из цикла: && start<=end
            for (int i = 0; i < array.length && start <= end; i ++) { //поскольку start дальше ++, поэтому проверка здесь также будет нужна каждый раз прохождения по циклу
                if (start % 15 == 0) { //то есть одновременно делится и на 3 и на 5 без остатка
                    array[i] = "FizzBuzz";
                } else if (start % 3 == 0) {
                    array[i] = "Fizz";
                } else if (start % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(start);
                }

                start ++; //после всех проверок увеличиваем число на 1 и проверки пойдут заново, но с уже увеличенным start

            }
            return array; //после прогона цикла for вовзвращаем наш массив

        }
        return new String[0];//создаем через NEW новый массив, который просто выводится, если первое условие не выполнится
    }



}