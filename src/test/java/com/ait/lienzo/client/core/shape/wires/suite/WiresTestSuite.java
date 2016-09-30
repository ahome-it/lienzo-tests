/*
 *
 *    Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *  
 */

package com.ait.lienzo.client.core.shape.wires.suite;

import com.ait.lienzo.client.core.shape.wires.WiresContainerTest;
import com.ait.lienzo.client.core.shape.wires.WiresManagerTest;
import com.ait.lienzo.client.core.shape.wires.WiresShapeControlHandleListTest;
import com.ait.lienzo.client.core.shape.wires.WiresShapeTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Wires testing suite.
 * 
 * @author Roger Martinez
 * @since 1.0.0-RC2
 * 
 */
@RunWith( Suite.class )
@Suite.SuiteClasses({
        WiresContainerTest.class,
        WiresShapeTest.class,
        WiresShapeControlHandleListTest.class,
        WiresManagerTest.class
})
public class WiresTestSuite {

        @BeforeClass
        public static void setUpClass() {
        }

        @AfterClass
        public static void tearDownClass() {
        }
        
}
