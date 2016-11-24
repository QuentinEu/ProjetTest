package org.formation.ProjetTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjetTestTest {

	@Test
	public void verification_nom() {
		ProjetTest p = new ProjetTest("Toto");

		assertEquals("Toto", p.getName());
	}

}
