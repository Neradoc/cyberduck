package ch.cyberduck.core.urlhandler;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SchemeHandlerFactoryTest {

    @Test
    public void testGet() {
        assertNotNull(SchemeHandlerFactory.get());
    }
}
