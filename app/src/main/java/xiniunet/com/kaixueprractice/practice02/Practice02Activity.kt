package xiniunet.com.kaixueprractice.practice02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xiniunet.com.kaixueprractice.R

/**
 *
 * @author yangxia
 * @since 2019-09-12 14:50
 */
class Practice02Activity :AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice01)

        A.getA().doSomething()
        B.doSomething()
        val max = 100000
        sumOfArray(max)
        sumOfIntArray(max)
        sumOfList(max)


    }


    private fun sumOfArray(max:Int){
        var arrays = Array(max){it-> it *1 }
        val startMillis = System.currentTimeMillis()
        var sum  = 0
        for (i in  arrays){
            sum += i
        }
        val endMills = System.currentTimeMillis()
        println("===sumOfArray=====耗时= " + (endMills-startMillis))
        println(sum)
    }

    private fun sumOfIntArray(max:Int){
        var arrays = IntArray(max){ i->i*1}
        val startMillis = System.currentTimeMillis()
        var sum  = 0
        for (i in  arrays){
            sum += i
        }
        val endMills = System.currentTimeMillis()
        println("===sumOfIntArray=====耗时= " + (endMills-startMillis))
        println(sum)
    }

    private fun sumOfList(max:Int){
        var arrays = List(max){i->i*1}
//        var arrays = IntArray(max){ i->i*1}.toList()

        val startMillis = System.currentTimeMillis()
        var sum  = 0
        for (i in  arrays){
            sum += i
        }
        val endMills = System.currentTimeMillis()
        println("===sumOfList=====耗时= " + (endMills-startMillis))
        println(sum)

    }

}