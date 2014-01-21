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

import com.optima.opticarrier.domain.WlrRequestAggiuntivis;
import com.optima.opticarrier.domain.WlrRequestAggiuntivis_;
import com.optima.opticarrier.repository.support.SearchParameters;

/**
 * Integration test on WlrRequestAggiuntivisRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class WlrRequestAggiuntivisRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(WlrRequestAggiuntivisRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private WlrRequestAggiuntivisRepository wlrRequestAggiuntivisRepository;

    @Inject
    private WlrRequestAggiuntivisGenerator wlrRequestAggiuntivisGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        WlrRequestAggiuntivis wlrRequestAggiuntivis = wlrRequestAggiuntivisGenerator.getWlrRequestAggiuntivis();

        // add it to a Set before saving (force equals/hashcode)
        Set<WlrRequestAggiuntivis> set = newHashSet(wlrRequestAggiuntivis, wlrRequestAggiuntivis);
        assertThat(set).hasSize(1);

        wlrRequestAggiuntivisRepository.save(wlrRequestAggiuntivis);
        entityManager.flush();

        // reload it from cache and check equality
        WlrRequestAggiuntivis model = new WlrRequestAggiuntivis();
        model.setId(wlrRequestAggiuntivis.getId());
        assertThat(wlrRequestAggiuntivis).isEqualTo(wlrRequestAggiuntivisRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(wlrRequestAggiuntivis.getId()).isEqualTo(wlrRequestAggiuntivisRepository.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(wlrRequestAggiuntivis).isNotEqualTo(wlrRequestAggiuntivisRepository.get(model));
    }

    @Test
    @Rollback
    public void saveAndGetWithExplicitNullPropertySelector() {
        WlrRequestAggiuntivis wlrRequestAggiuntivis = wlrRequestAggiuntivisGenerator.getWlrRequestAggiuntivis();

        // add it to a Set before saving (force equals/hashcode)
        Set<WlrRequestAggiuntivis> set = newHashSet(wlrRequestAggiuntivis, wlrRequestAggiuntivis);
        assertThat(set).hasSize(1);

        // explicitly set toOne relationship to null
        wlrRequestAggiuntivis.setRequest(null);

        wlrRequestAggiuntivisRepository.save(wlrRequestAggiuntivis);
        entityManager.flush();

        // clear cache to force reload from db
        entityManager.clear();

        SearchParameters searchParameters = new SearchParameters() //
                .caseInsensitive() //
                .anywhere() //
                .property(WlrRequestAggiuntivis_.request, (Object) null);

        List<WlrRequestAggiuntivis> elements = wlrRequestAggiuntivisRepository.find(searchParameters);
        assertThat(elements).isNotEmpty();
        for (WlrRequestAggiuntivis element : elements) {
            assertThat(element.getRequest()).isNull();
        }
    }
}