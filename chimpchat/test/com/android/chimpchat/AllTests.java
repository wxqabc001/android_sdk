/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.chimpchat;

import com.android.chimpchat.adb.AdbChimpDeviceTest;
import com.android.chimpchat.adb.LinearInterpolatorTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Test suite to run all the tests for MonkeyRunner.
 */
public class AllTests {
    public static Test suite(Class<? extends TestCase>... classes) {
        TestSuite suite = new TestSuite();
        for (Class<? extends TestCase> clz : classes) {
            suite.addTestSuite(clz);
        }
        return suite;
    }

    public static void main(String args[]) {
        TestRunner tr = new TestRunner();
        TestResult result = tr.doRun(AllTests.suite(ImageUtilsTest.class,
                LinearInterpolatorTest.class, AdbChimpDeviceTest.class));
        if (result.wasSuccessful()) {
            System.exit(0);
        } else {
            System.exit(1);
        }
    }
}
