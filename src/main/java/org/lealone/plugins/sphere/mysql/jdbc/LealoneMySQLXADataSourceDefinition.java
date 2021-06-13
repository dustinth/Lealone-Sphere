/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.sphere.mysql.jdbc;

import org.lealone.plugins.sphere.jdbc.LealoneXADataSourceDefinition;

/**
 * XA data source definition for Lealone.
 */
public class LealoneMySQLXADataSourceDefinition extends LealoneXADataSourceDefinition {

    @Override
    public String getDatabaseType() {
        return "LealoneMySQL";
    }
}
