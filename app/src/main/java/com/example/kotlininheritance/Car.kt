package com.example.kotlininheritance

 open class Car(name: String, model: Int, wheel: Int) {
    var name: String? = name
        private set
        get
    var model: Int? = model
        private set
        get
    var wheel: Int? = wheel
        private set
        get
/*
Kotlin Class yapısı Final olarak default bir şekilde sayılır. Bunu diğer sınıflarda miras olarak kullanmak için
Open değeriyle erişilebilir olarak açıyoruz.
 */
}