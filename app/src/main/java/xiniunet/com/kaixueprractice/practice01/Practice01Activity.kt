package xiniunet.com.kaixueprractice.practice01

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import xiniunet.com.kaixueprractice.R

/**
 * kaixue  第一篇Kotlin 的变量、函数和类型 相关练习
 * @author yangxia
 * @since 2019-09-11 15:08
 */
open  class Practice01Activity : AppCompatActivity() {

    //声明延迟初始化
    private lateinit var tv :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice01)
        initViews()
        printId(tv)
    }
    private  fun initViews(){
        tv = findViewById(R.id.tv_sample01)
        tv.text = "我是Practice01Activity"
    }

    private fun printId(view:View?){
        println("========"+view.hashCode())
    }

   protected override fun onResume() {
        super.onResume()
    }

}