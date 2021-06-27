const val op:Int = 9 
const val MIN_OP:Int = 1
const val MAX_OP:Int = 5

fun main() {
	println("Hello! Welcome to Android Kotlin Calculator")
    var a:Float? = null
    var b:Float? = 40.3F
    
    /* 
     *Operators:
     	1-sum
        2-sub
        3-mult
        4-div 
        5-mod(module)
     */
    var res:Float? = calculate(a,b,op)
    println(res)
    
    
    
}

fun sum(a:Float ,b:Float) = a.plus(b) //sum operation from calculator fun
fun sub(a:Float ,b:Float) = a.minus(b) //subtraction operation from calculator fun
fun mult(a:Float ,b:Float) = a.times(b) //multply operation from calculator fun
fun div(a:Float ,b:Float) = a.div(b) //division operation from calculator fun
fun mod(a:Float ,b:Float) = a.mod(b) //division operation from calculator fun

fun Int.chooseOperation(a:Float,b:Float):Float?  //Just setting numbers as op controlers for the problem requirement
{
    when(this)
    {
    	1 -> return sum(a,b)
        2 -> return sub(a,b)
        3 -> return mult(a,b)
        4 -> return div(a,b)
        5 -> return mod(a,b)
        else -> return null //just in case it happens, but will not
    }
}
//operation:(Float,Float)->Float
fun calculate(a:Float?, b:Float?,op:Int):Float?{ //calculator fun
    if(op !in MIN_OP..MAX_OP)  //Security against invalid op param, but Int's
    {
        println("ERROR: Op is not a valid operation")
        return null
    }
    if((a==null)||(b==null)) {      //Security against null numbers as operanders
    	println("ERROR: at least one of parameters is null")
    	return null
    }
    else return op.chooseOperation(a,b) 
}
