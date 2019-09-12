package xiniunet.com.kaixueprractice.practice02

/**
 *
 * @author yangxia
 * @since 2019-09-12 14:59
 */
class A {
    private  constructor(){

        println("A constructor")
    }

    companion object{
        fun  getA ():A{
            return  A()
        }
    }

    fun doSomething(){
        println("==A==doSomething====")
    }
}