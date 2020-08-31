fun main(){
    var summ=Summation(5,7)
//println("This from function on class=\t"+summ.sum(4,8))

    emp (1,"Ahmed")
}
class Summation(num1:Int,num2:Int){
//    var num1:Int=0;
//    var num2:Int=0;
    init{
    print("this from init constructor=\t")
  println(num1.plus(num2))
 }
    fun sum(num1:Int,num2:Int):Int{
        var num3=num1.plus(num2)
        return num3;
    }
}
/////////u////////////////////////////The answer of 3 Question
class emp{
    constructor(id:Int,name:String):this(id,name,"Male"){
     println("Emp id =$id Emp Name :$name")
    }
    constructor(id:Int,name:String,gender:String){
        println("Emp id=$id Emp Name :$name  gender:$gender")
    }
}