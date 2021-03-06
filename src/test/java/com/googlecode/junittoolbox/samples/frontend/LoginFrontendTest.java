package com.googlecode.junittoolbox.samples.frontend;

import com.googlecode.junittoolbox.WildcardPatternSuiteTest;
import com.googlecode.junittoolbox.samples.FlakyTests;
import com.googlecode.junittoolbox.samples.SlowTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * For {@link WildcardPatternSuiteTest}.
 */
public class LoginFrontendTest {

    @Test
    public void fastTest() {}

    @Test
    @Category(SlowTests.class)
    public void slowTest() {}

    @Test
    @Category(FlakyTests.class)
    public void flakyTest() {}
}
