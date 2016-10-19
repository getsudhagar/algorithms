/**
 * 
 */
package com.learn.algo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.learn.algo.string.StringPermutation;
import com.learn.algo.string.SubsStringSearch;

/**
 * @author StringAlgorithmsTest
 *
 */
public class StringAlgorithmsTest {

	private SubsStringSearch matcher = null;
	StringPermutation perm  = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		matcher = new SubsStringSearch();
		perm = new StringPermutation();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		matcher =null;
	}

	@Test
	public void test() {
		List<String> kp = perm.getpermutationsOf("abc");
		kp.isEmpty();
		//assertEquals(matcher.findIndexOfPatterninString("sdsdsdspasdfgt", "dada"),-1);
		//assertEquals(matcher.findIndexOfPatterninString("dfgt", "fgt"),1);
	}

}
