import java.util.*
fun main(args: Array<String>)
{

        val myAge:Int = 18;
        val isTeenager:Boolean = myAge >=13 && myAge<=19;
        println(isTeenager);

        val theirAge = 30;
        val bothTeenagers:Boolean = theirAge>= 13 && theirAge<=19 && isTeenager;
        println(bothTeenagers);

        val reader:String = "Влад, Мага";
        val author:String = "Richard Lucas";
        val authorIsReader:Boolean = reader == author;
        println(authorIsReader);

        val readerBeforeAuthor = reader < author;
        println(readerBeforeAuthor);

        val myAge2:Int = 18;
        if(myAge2>=13&&myAge2<=19) println("Подросток");
        else println("Не подросток");

        val answer = if (myAge2>=13&&myAge2<=19) "Подросток" else "Не подросток"
        println(answer);

        var counter:Int = 0;
        while (counter<10)
        {
            println(counter);
            counter+=1;
        }

        counter = 0;
        var roll:Int = 0;
        do
        {
            roll = Random().nextInt(6);
            counter+=1;
            println("После $counter бросков, roll равен $roll")
        }
        while (roll!=0)

        val range=1..10
        for (i in range)
            println(i*i)

        for (i in range)
            println(Math.sqrt(i.toDouble()))

        var sum:Int=0
        for (row in 1 until 8 step 2)
        {
            for (column in 0 until 8)
            {
                sum+=row*column
            }
        }
        println ("Результат: $sum")
}