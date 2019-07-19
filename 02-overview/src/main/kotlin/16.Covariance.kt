package covariance

open class MyClassParent

class MyClass: MyClassParent()

// covariance is used when the type is only output (return values)
interface Bag<out T> {
    fun get(): T
}

class BagImpl : Bag<MyClass> {
    override fun get(): MyClass = MyClass()
}

val bag: Bag<MyClassParent> = BagImpl()

