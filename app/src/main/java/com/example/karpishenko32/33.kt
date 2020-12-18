package com.example.karpishenko32

data class Person(val name: String, val age: Int, var Mother: Person? = null,
                  var Father: Person? = null,var SisAndBro: Array<Person>?=null){

     companion object {
         var counter: Int = 0
         fun counter(): Int {
             return (counter-1)
         }
     }
     init {
         counter++
     }
    fun get( ){   // Вывод всех сестер и братьев для выбраного элемента класса
        val person = SisAndBro
        if (person != null) {
    for(element in person){
        println(element)
    }}}
}

fun main () {
    val Iryna= Person("Iryna",18)
    val Volodymyr= Person("Volodymyr",49)
    val Leonid= Person("Leonid",77)
    val Volodtmyr2= Person("Volodtmyr2",80)
    val Natalia= Person("Natalia",75)
    val Lydmila= Person("Lydmila",79)
    val Daria= Person("Daria",44)
    val Olga=Person("Olga",38)
    val Ann=Person("Ann",40)
    val I= Person("I",19 )
    I.Mother=Iryna
    Iryna.Mother=Natalia
    Volodymyr.Mother=Lydmila
    I.Father=Volodymyr
    Iryna.Father=Leonid
    Volodymyr.Father=Volodtmyr2
    I.SisAndBro=arrayOf(Daria)
    Iryna.SisAndBro=arrayOf(Ann, Olga)
    println(Person.counter())
    Iryna.get()
}



