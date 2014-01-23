package com.optima.opticarrier.repository;

import com.optima.opticarrier.domain.DbuRequest;
import com.optima.opticarrier.repository.support.GenericRepository;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class DbuRequestRepository extends GenericRepository<DbuRequest, Integer> {

    public DbuRequestRepository() {
        super(DbuRequest.class);
    }

    @Override
    public DbuRequest getNew() {
        return new DbuRequest();
    }

    @Override
    public DbuRequest getNewWithDefaults() {
        return getNew().withDefaults();
    }

}
