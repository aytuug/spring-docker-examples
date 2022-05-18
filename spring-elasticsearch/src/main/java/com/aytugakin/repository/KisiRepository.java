package com.aytugakin.repository;


import java.util.List;

import com.aytugakin.entity.Kisi;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends ElasticsearchRepository<Kisi, String> {


    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\": \"?0\"}}]}}")
    List<Kisi> getByCustomQuery(String search);
    List<Kisi>  findByAdLikeOrSoyadLike(String ad, String soyad);


}
