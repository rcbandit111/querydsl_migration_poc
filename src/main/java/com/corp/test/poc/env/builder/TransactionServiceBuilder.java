package com.corp.test.poc.env.builder;

import com.corp.test.poc.env.domain.QTransaction;

import com.querydsl.core.BooleanBuilder;

import org.springframework.stereotype.Component;

@Component
public class TransactionServiceBuilder {

  public BooleanBuilder findAll() {

    QTransaction transaction = QTransaction.transaction;
    BooleanBuilder where = getTransactionCommonWhereClause();
    return where;
  }

  public BooleanBuilder getTotalNumber() {

    BooleanBuilder where = new BooleanBuilder();
    QTransaction transaction = QTransaction.transaction;
    return where;
  }
}
