package usesitevariance

open class MyClassParent

class MyClass: MyClassParent()

interface Bag<T> {
    fun get(): T
    fun use(t: T): Boolean
}

class BagImpl : Bag<MyClassParent> {
    override fun get(): MyClassParent = MyClassParent()

    override fun use(t: MyClassParent): Boolean = true
}

// use-site contravariance
fun useBag(bag: Bag<in MyClass>): Boolean {
    // do something with bag
    return true
}

class BagImpl2 : Bag<MyClass> {
    override fun use(t: MyClass): Boolean = true
    override fun get(): MyClass = MyClass()
}

// use-site covariance
fun createBag(): Bag<out MyClassParent> = BagImpl2()

val bag = useBag(BagImpl())

