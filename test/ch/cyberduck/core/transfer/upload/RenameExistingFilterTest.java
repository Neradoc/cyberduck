package ch.cyberduck.core.transfer.upload;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.AttributedList;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.NullLocal;
import ch.cyberduck.core.NullPath;
import ch.cyberduck.core.NullProtocol;
import ch.cyberduck.core.NullSession;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.Session;
import ch.cyberduck.core.transfer.symlink.NullSymlinkResolver;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version $Id$
 */
public class RenameExistingFilterTest extends AbstractTestCase {

    @Test
    public void testAccept() throws Exception {
        RenameExistingFilter f = new RenameExistingFilter(new NullSymlinkResolver());
        assertTrue(f.accept(new NullSession(new Host("h")), new NullPath("t", Path.FILE_TYPE) {
            @Override
            public Session getSession() {
                return new NullSession(new Host("t")) {
                    @Override
                    public boolean isRenameSupported(final Path file) {
                        return true;
                    }
                };
            }
        })
        );
        assertFalse(f.accept(new NullSession(new Host("h")), new NullPath("t", Path.FILE_TYPE) {
            @Override
            public Session getSession() {
                return new NullSession(new Host("t")) {
                    @Override
                    public boolean isRenameSupported(final Path file) {
                        return false;
                    }
                };
            }
        })
        );
    }

    @Test
    public void testPrepare() throws Exception {
        RenameExistingFilter f = new RenameExistingFilter(new NullSymlinkResolver());
        final NullPath p = new NullPath("t", Path.FILE_TYPE) {
            @Override
            public Session getSession() {
                return new NullSession(new Host(new NullProtocol(), "t"));
            }

            @Override
            public Path getParent() {
                return new NullPath("p", Path.DIRECTORY_TYPE) {
                    @Override
                    public AttributedList<Path> list() {
                        final AttributedList<Path> l = new AttributedList<Path>();
                        l.add(new NullPath("t", Path.FILE_TYPE));
                        return l;
                    }

                    @Override
                    public void rename(final Path renamed) {
                        assertNotSame(this.getName(), renamed.getName());
                    }
                };
            }
        };
        p.setLocal(new NullLocal("/Downloads", "n"));
        f.prepare(new NullSession(new Host("h")), p);
    }
}
