import org.assertj.core.api.Assertions.assertThat
import org.junit.Test as Specification  //Use an alias

/**
 * AnnotationsTest
 *
 *
 * @author bigkahuna
 * @since 05/03/2017
 */

class AnnotationsTest {
    
    @Specification fun testAnnotation() {
        assertThat(true).isTrue()
    }
}