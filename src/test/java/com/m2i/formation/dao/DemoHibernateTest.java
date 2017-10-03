package com.m2i.formation.dao;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.m2i.formation.dao.entity.Formation;
import com.m2i.formation.dao.entity.TravauxPratiques;

public class DemoHibernateTest {
	DemoHibernate demo = new DemoHibernate();


	@Test
	public void testCreateFormation() {

		TravauxPratiques tp1 = new TravauxPratiques("tp1", 40L);
		TravauxPratiques tp2 = new TravauxPratiques("tp2", 50L);
		TravauxPratiques tp3 = new TravauxPratiques("tp3", 60L);

		Set<TravauxPratiques> formationTps = new HashSet<TravauxPratiques>(0);
		formationTps.add(tp1);
		formationTps.add(tp2);
		formationTps.add(tp3);

		Formation f = new Formation("JAVA", formationTps);

		demo.createFormation(f);

	}

}
