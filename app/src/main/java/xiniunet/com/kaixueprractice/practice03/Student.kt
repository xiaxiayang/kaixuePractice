package xiniunet.com.kaixueprractice.practice03

/**
 *
 * @author yangxia
 * @since 2019-09-16 14:39
 */
class Student (val name:String?) {

    private var sName = name
    private  var sNumber = ""
    private var sGender:String? =null

    constructor(name:String, number:String , gender:String?) : this(name){
        sNumber = number
        sGender = gender
    }
    constructor(s:StudentBean):this(s.name,s.number,s.gender){
        sNumber = s.number
        sGender = s.gender
    }

    fun printProperty(){
        println("===name: $sName")
        println("===number: $sNumber")
        println("===gender:${if(sGender == "F"){"女"}else{"男"}}")

    }

    fun getList(){
        val array = intArrayOf(21, 40, 11, 33, 78)
        array.filter { item->item %3 ==0 }
            .forEach{item->println("===$item")}
    }


}