import geb.spock.GebReportingSpec

import spock.lang.*

@Stepwise
class GoogleWikipediaSpec extends GebReportingSpec {
    
    def "go to groupbuy"() {
        when:
        	to HomePage
        
        then:
        	at HomePage
		
			
    }
	
	def "I click on details button something happens"() {
		when:
			image_frame.click();
			sleep(20000)
			
		then:
			at DealPage
	}
/*    
    def "search for wikipedia"() {
        given:
        q = "wikipedia"
        
        and:
        waitFor { btnG().displayed }
        
        when:
        btnG().click()
        
        then:
        waitFor { title.endsWith("Google Search") }
    }
    
    def "the first result should be wikipedia"() {
        given:
        def firstLink = $("li.g", 0).find("a.l")
        
        expect:
        firstLink.text() == "Wikipedia"
        
        when:
        firstLink.click()
        
        then:
        waitFor { title == "Wikipedia" }
    }
    */
}