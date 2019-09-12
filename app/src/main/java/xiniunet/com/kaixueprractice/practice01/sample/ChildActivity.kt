package xiniunet.com.kaixueprractice.practice01

import android.os.Bundle

/**
 *
 * @author yangxia
 * @since 2019-09-11 16:01
 */
class ChildActivity : TestActivity(){

    //重写父类的方法时修饰符范围要大于等于父类的范围，比如父类方法为 public ，子类只能试 public的，如果父类方法为 protected ，则子类只能用 protected/public修饰
//    override fun test() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        println("222222")
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



}