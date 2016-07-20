package com.synword.dao;

import org.skife.jdbi.v2.sqlobject.*;
import com.synword.representations.Words;
import com.synword.dao.mappers.ConnectMapper;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface ConnectDAO {

        @Mapper(ConnectMapper.class)
       @SqlQuery("SELECT DISTINCT Ankerword, Syn1, Syn2, NoSyn1, NoSyn2, NoSyn3, NoSyn4 FROM floki.ankerwords a Inner Join floki.synonyms s on a.id = s.synid Inner Join floki.nosynonyms n on a.id = n.nosynid where a.sprache = 'DE' Order by Rand() LIMIT 1")
    Words getWords(String Ankerword, String Syn1, String Syn2, String NoSyn1, String NoSyn2, String NoSyn3, String NoSyn4);

}