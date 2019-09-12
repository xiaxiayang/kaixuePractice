package xiniunet.com.kaixueprractice.practice01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xiniunet.com.kaixueprractice.R

/**
 *
 * @author yangxia
 * @since 2019-09-11 16:20
 */
class AsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice01)
    }

    fun  toast(){
//        Toast.makeText(this,"toast", Toast.LENGTH_SHORT).show();
        println("========toast======")
    }
}