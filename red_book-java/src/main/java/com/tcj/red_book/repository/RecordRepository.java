package com.tcj.red_book.repository;

import com.tcj.red_book.entity.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record,Integer> {
}
