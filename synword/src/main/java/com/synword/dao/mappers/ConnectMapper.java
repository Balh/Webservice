package com.synword.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import com.synword.representations.Words;


public class ConnectMapper implements ResultSetMapper<Words> {
    public Words map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Words(r.getString("Ankerword"), r.getString("Syn1"), r.getString("Syn2"), r.getString("NoSyn1"), r.getString("NoSyn2"), r.getString("NoSyn3"), r.getString("NoSyn4"));
    }
}

