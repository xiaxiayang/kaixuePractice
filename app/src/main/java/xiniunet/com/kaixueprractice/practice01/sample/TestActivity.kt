package xiniunet.com.kaixueprractice.practice01

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import kotlinx.android.synthetic.main.activity_practice01.*
import xiniunet.com.kaixueprractice.R

/**
 * kaixue  第一篇Kotlin 的变量、函数和类型 相关练习
 * @author yangxia
 * @since 2019-09-11 15:08
 */
open  class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice01)
        ButterKnife.bind(this)
        initViews()
        asTest()
    }
    private  fun initViews(){
        tv_sample01.text = "我是Sample01Activity"
    }



    //用于测试子类重写该方法时的修饰符
//    abstract  fun test()

    //as及as？操作符使用练习
    private  fun asTest(){
//        activity as? NewActivity
//        activity as NewActivity?
//        activity as? NewActivity?

        var activity : Activity = ChildActivity()
        (activity as AsActivity)?.toast()


    }
}