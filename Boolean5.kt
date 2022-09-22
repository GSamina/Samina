fun celoechislo(A:Int,B:Int){//где A>=2 и B<-2
    if (A >= 0 || B < -2){

        println("Правильно")
    } else {
        println("Не правильно")
    }
}
fun main(args: Array<String>){
    celoechislo(0,-3)
}
