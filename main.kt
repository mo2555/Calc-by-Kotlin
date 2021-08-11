fun main(args:Array<String>) {
    var num1: Int = 0
    var num2: Int = 0
    var op: String = ""
    var count = 1
    while (true) {
        try {
            if (count == 1) {
                println("Enter Number 1 : ")
                num1 = readLine()!!.toInt()
                count = 2
            }
            if (count == 2) {
                println("Enter Number 2 : ")
                num2 = readLine()!!.toInt()
                count = 3
            }
            if (count == 3) {
                println("Enter operator between ( + , - , * , / or %) : ")
                op = readLine()!!
                if (op=="+"||op=="-"||op=="*"||op=="/"||op=="%")
                    break
                else
                    throw Exception()
            }
        }catch (e:Exception){
        if(count==1){
            println("Number 1 not number")
        }
            else if(count==2){
            println("Number 2 not number")
        }
            else
        {
            println("Can not find this operator")
        }
        }
    }
   println(calc(num1,num2,op))
}
fun calc(num1:Int,num2:Int,op:String):String{
    when(op){
        "+"->{
            return "The Sum = ${num1+num2}"
        }
        "-"->{
            return "The Subtract = ${num1-num2}"
        }
        "*"->{
            return "The Multiply = ${num1*num2}"
        }
        "/"->{
            return "The Div = ${num1.toDouble()/num2}"
        }
        "%"->{
            return "The Mod = ${num1%num2 }"
        }
        else ->{
            return "Operator not true"
        }
    }
}
