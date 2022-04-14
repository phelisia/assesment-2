fun main(){
    var Sang=Currentaccount("Phelisia","234567",10000.00)
    Sang.deposit(5000.00)
    println(Sang.accountBalance)
    Sang.withdrawn(1000.00)
    println( Sang.accountBalance)
    Sang.details()
    fruits("Banana")
    var Jeruto=savingsAccount("PJ","12345",20000.00,7)
    Jeruto.withdrawn(200000.00)
    Jeruto.deposit(500.00)
    println(Jeruto.withdrawals)





}
 open class Currentaccount(var accountName:String,var accountNumber:String,var accountBalance:Double){
    fun deposit(amount:Double){
        accountBalance+=amount
        println(amount)


    }
    open fun withdrawn(amount: Double){
        accountBalance-=amount
        println(amount)
    }
    fun details(){
        println("Account number $accountNumber with balance ${accountBalance} is operated by $accountName")
    }

}
  open class savingsAccount(accountName: String,accountNumber: String,accountBalance: Double , var withdrawals:Int ):Currentaccount(accountName,accountNumber,accountBalance,) {
     override fun withdrawn(amount: Double) {
         withdrawals=4
         var z= amount-withdrawals
         println(z)
      if(withdrawals<=4){
     accountBalance-amount
      }
         println(accountBalance)
         withdrawals++
     }


}
//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)

data class Product(var name :String,var weight:String,var price:Int,var category: String){
    fun takecategory(cate:List<Product>){
        var newlist= mutableListOf<String>()
        cate.forEach { b->

        }

    }

}

//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
fun fruits(fruit:String):String{
    var f=""
    fruit.forEachIndexed { index, c ->
        if (index%2==0){
            f+=c
            println(f)

        }
    }
    return fruit
}