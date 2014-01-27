import spock.lang.Specification

class FooTest extends Specification {

    def "Should create Foo"() {

        expect:
            new Foo()

    }
}
