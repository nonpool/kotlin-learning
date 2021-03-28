package com.nonpool.model

import com.nonpool.delegate.PropertiesDelegate

/**
 * @author nonpool
 * @version 1.0
 * @since 2020/7/4
 */
class Person {
    var id: String by PropertiesDelegate()
}