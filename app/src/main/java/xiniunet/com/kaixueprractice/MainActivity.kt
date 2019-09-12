package xiniunet.com.kaixueprractice

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import kotlinx.android.synthetic.main.activity_main.*
import xiniunet.com.kaixueprractice.practice02.Practice02Activity

class MainActivity : AppCompatActivity() {

    //声明控件
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        toPage()
    }

    private fun toPage(){
        val context:Context = this
        bt_sample01.setOnClickListener(object :View.OnClickListener {
            override fun onClick(p0: View?) {
                startActivity(Intent(context, Practice02Activity::class.java))
            }

        })
    }
}
