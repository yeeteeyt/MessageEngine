package msg.version;

import msg.i;
import org.junit.jupiter.api.Test;

/** All tests for the <strong>URLreader</strong> class. */
class URLreaderTest {

    /** This tests the <strong>check</strong> method in the <strong>URLreader</strong> class. */
    @Test void check () {
        System.out.println("\nURLreaderTest.check  [\n");

        String e = "";
        try {
            e = msg.version.URLreader.check("https://raw.githubusercontent.com/afkvido-development/MessageEngine-API/master/src/api/API.yml");
        } catch (Exception i) {
            i.printStackTrace();
        }
        System.out.println(e);
        System.out.println(i.white + "\n]");

    }

    /** Private constructor prevents utility class <strong>URLreaderTest</strong> from being initialized. */
    private URLreaderTest () {}
}