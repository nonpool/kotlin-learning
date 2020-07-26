package com.nonpool.delegate

import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @author nonpool
 * @version 1.0
 * @since 2020/7/4
 *
 * 也可以不实现 ReadWriteProperty 只要有getValue 和 setValue 方法即可(使用by代理时自动编译器自动检测)
 * @see ReadWriteProperty
 */
class PropertiesDelegate {

    private val property: Properties by lazy {
        val prop = Properties()
        javaClass
        prop
    }

    operator fun getValue(thisRef: Any, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        TODO("Not yet implemented")
    }

}