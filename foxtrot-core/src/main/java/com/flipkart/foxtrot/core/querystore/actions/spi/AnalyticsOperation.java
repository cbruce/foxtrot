package com.flipkart.foxtrot.core.querystore.actions.spi;

/**
 * Created by rishabh.goyal on 06/04/15.
 */
public enum AnalyticsOperation {
    query,
    group,
    count,
    distinct,
    histogram,
    stats,
    trend,
    statstrend,
    test_non_cacheable
}
