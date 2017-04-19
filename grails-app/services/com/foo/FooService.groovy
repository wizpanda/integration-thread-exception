package com.foo

import grails.transaction.Transactional

@Transactional
class FooService {

    boolean foo() {
        return true
    }
}
