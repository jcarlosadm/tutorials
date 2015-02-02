/*
 * ClassTest_test.cpp
 *
 *  Created on: 02/02/2015
 *      Author: jcarlos
 */

#include <new>
#include <cppunit/TestAssert.h>
#include <cppunit/TestFixture.h>
#include <cppunit/TestCaller.h>
#include <cppunit/ui/text/TestRunner.h>
#include "ClassTest.hpp"

class ClassTest_test : public CppUnit::TestFixture{
public:
    ClassTest_test(){
        test = new ClassTest();
    }

    ~ClassTest_test(){
        delete test;
    }

    void testSum(){
        CPPUNIT_ASSERT(4 == test->sum(2,2));
    }

    void testMinus(){
        CPPUNIT_ASSERT(4 == test->minus(7, 3));
    }

    void static runTest(){
        CppUnit::TextUi::TestRunner runner;
        runner.addTest(new CppUnit::TestCaller<ClassTest_test>(
                "test sum",&ClassTest_test::testSum));
        runner.addTest(new CppUnit::TestCaller<ClassTest_test>(
                "test minus",&ClassTest_test::testMinus));
        runner.run();
    }
private:
    ClassTest * test;
};
