package contravariance

open class MyClassParent

class MyClass: MyClassParent()

// contravariance is used when the type is only input (arguments)
interface Bag<in T> {
    fun use(t: T): Boolean
}

class BagImpl : Bag<MyClassParent> {
    override fun use(t: MyClassParent): Boolean = true
}

val bag: Bag<MyClass> = BagImpl()