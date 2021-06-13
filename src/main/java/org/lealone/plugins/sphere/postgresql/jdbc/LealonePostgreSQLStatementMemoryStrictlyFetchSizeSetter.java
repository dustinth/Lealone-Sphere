/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.sphere.postgresql.jdbc;

import org.lealone.plugins.sphere.jdbc.LealoneStatementMemoryStrictlyFetchSizeSetter;

public class LealonePostgreSQLStatementMemoryStrictlyFetchSizeSetter
        extends LealoneStatementMemoryStrictlyFetchSizeSetter {

    @Override
    public String getType() {
        return "LealonePostgreSQL";
    }
}
