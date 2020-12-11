package com.example.karpishenko32

data class Person(val age: Int)

fun main () {
    var map = hashMapOf<Person, String>()
    map.put(Person(2), "a")
    map.put(Person(3), "b")
    map.put(Person(4), "c")
    map.put(Person(7), "d")
    map.put(Person(1), "e")
    var list= map.toList()
val result = map.toSortedMap(compareBy<Person> { it.age })
     for (i in result) {
        print( i.key)
        println(i.value)
    }
}



