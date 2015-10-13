package com.example

import spock.lang.Specification

class SampleSpec extends Specification {

    def "one plus one" () {
        given:
        def a = 1

        when:
        def b = a + 1

        then:
        b == 2
    }
}
