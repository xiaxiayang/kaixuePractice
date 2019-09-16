package xiniunet.com.kaixueprractice.practice03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xiniunet.com.kaixueprractice.R

/**
 *
 * @author yangxia
 * @since 2019-09-12 14:50
 */
class Practice03Activity :AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice01)
        test()
    }

   private fun test(){
       val s = Student("wenny")
        s.printProperty()

        val s1  = Student("wenny","11123","F")
        s1.printProperty()

        val bean = StudentBean();
        bean.name = "wenny1"
        bean.number="11124"
        bean.gender = "M"
       val s2 = Student(bean)
       s2.printProperty()

       s2.getList()
    }


}