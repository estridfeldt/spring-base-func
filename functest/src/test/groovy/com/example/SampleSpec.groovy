package com.example

import groovyx.net.http.RESTClient
import spock.lang.Specification

class SampleSpec extends Specification {

    def "sample test" () {
        given:
        def client = new RESTClient("http://localhost:8080")
        client.handler.failure = { resp, reader -> [ status: resp.status, data: reader ] }

        when:
        def response = client.get(path: "/health")

        then:
        response.status == 200
        response.responseData.status == "UP"
    }
}
