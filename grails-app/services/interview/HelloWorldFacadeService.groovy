package interview

import com.lerss.ent.api.HelloWorldFacade
import grails.transaction.Transactional

@Transactional
class HelloWorldFacadeService implements HelloWorldFacade {

    @Override
    String greet(String name) {
        "Hello $name!"
    }
}
