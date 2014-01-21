/*
 * (c) Copyright 2005-2013 JAXIO, http://www.jaxio.com
 * Source code generated by Celerio, a Jaxio product
 * Want to purchase Celerio ? email us at info@jaxio.com
 * Follow us on twitter: @springfuse
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Template pack-backend-jpa:src/test/java/service/RepositoryIT.e.vm.java
 */
package com.optima.opticarrier.repository;

import static com.google.common.collect.Sets.newHashSet;
import static org.fest.assertions.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.optima.opticarrier.domain.CpsQuoteResponsePenali;
import com.optima.opticarrier.domain.CpsQuoteResponsePenali_;
import com.optima.opticarrier.repository.support.SearchParameters;

/**
 * Integration test on CpsQuoteResponsePenaliRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class CpsQuoteResponsePenaliRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(CpsQuoteResponsePenaliRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private CpsQuoteResponsePenaliRepository cpsQuoteResponsePenaliRepository;

    @Inject
    private CpsQuoteResponsePenaliGenerator cpsQuoteResponsePenaliGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        CpsQuoteResponsePenali cpsQuoteResponsePenali = cpsQuoteResponsePenaliGenerator.getCpsQuoteResponsePenali();

        // add it to a Set before saving (force equals/hashcode)
        Set<CpsQuoteResponsePenali> set = newHashSet(cpsQuoteResponsePenali, cpsQuoteResponsePenali);
        assertThat(set).hasSize(1);

        cpsQuoteResponsePenaliRepository.save(cpsQuoteResponsePenali);
        entityManager.flush();

        // reload it from cache and check equality
        CpsQuoteResponsePenali model = new CpsQuoteResponsePenali();
        model.setId(cpsQuoteResponsePenali.getId());
        assertThat(cpsQuoteResponsePenali).isEqualTo(cpsQuoteResponsePenaliRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(cpsQuoteResponsePenali.getId()).isEqualTo(cpsQuoteResponsePenaliRepository.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(cpsQuoteResponsePenali).isNotEqualTo(cpsQuoteResponsePenaliRepository.get(model));
    }

    @Test
    @Rollback
    public void saveAndGetWithExplicitNullPropertySelector() {
        CpsQuoteResponsePenali cpsQuoteResponsePenali = cpsQuoteResponsePenaliGenerator.getCpsQuoteResponsePenali();

        // add it to a Set before saving (force equals/hashcode)
        Set<CpsQuoteResponsePenali> set = newHashSet(cpsQuoteResponsePenali, cpsQuoteResponsePenali);
        assertThat(set).hasSize(1);

        // explicitly set toOne relationship to null
        cpsQuoteResponsePenali.setFile(null);

        cpsQuoteResponsePenaliRepository.save(cpsQuoteResponsePenali);
        entityManager.flush();

        // clear cache to force reload from db
        entityManager.clear();

        SearchParameters searchParameters = new SearchParameters() //
                .caseInsensitive() //
                .anywhere() //
                .property(CpsQuoteResponsePenali_.file, (Object) null);

        List<CpsQuoteResponsePenali> elements = cpsQuoteResponsePenaliRepository.find(searchParameters);
        assertThat(elements).isNotEmpty();
        for (CpsQuoteResponsePenali element : elements) {
            assertThat(element.getFile()).isNull();
        }
    }
}