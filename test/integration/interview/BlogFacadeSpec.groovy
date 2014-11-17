package interview

import com.lerss.ent.api.BlogEntryDTO
import com.lerss.ent.api.BlogFacade
import spock.lang.Specification

class BlogFacadeSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    // This is injected by grails convension
    BlogFacade blogFacadeService

    void "newly published blog should at top of recent blog entries"() {
        given:
        def now = new Date()
        blogFacadeService.publish(new BlogEntryDTO(
                title: 'title',
                content: 'content',
                dateCreated: now
        ))
        def entry = blogFacadeService.getRecentEntries(1)[0]

        expect:
        entry.title == 'title'
        entry.content == 'content'
        entry.dateCreated == now
    }
}
