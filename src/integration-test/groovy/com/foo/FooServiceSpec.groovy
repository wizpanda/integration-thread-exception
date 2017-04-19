package com.foo

import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class FooServiceSpec extends Specification {

    FooService fooService

    def setup() {
    }

    def cleanup() {
    }

    void "test foo service"() {
        expect: "this should work"
        fooService.foo() == true
    }
}
