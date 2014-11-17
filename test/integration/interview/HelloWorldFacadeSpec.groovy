package interview

import com.lerss.ent.api.HelloWorldFacade
import spock.lang.Specification

/**
 * Spock的用法参见：http://docs.spockframework.org/en/latest/index.html
 */
class HelloWorldFacadeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    // This is injected by grails convension
    HelloWorldFacade helloWorldFacadeService

    void "greeting should have name in it"() {
        expect:
        greeting == helloWorldFacadeService.greet(name)

        where:
        name || greeting
        'Jim' || 'Hello Jim!'
        'Mike' || 'Hello Mike!'
    }
}
