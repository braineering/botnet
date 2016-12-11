/*
  The MIT License (MIT)

  Copyright (c) 2016 Giacomo Marciani, Michele Porretta

  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:


  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.


  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
 */

package com.acmutv.botnet;

import com.acmutv.botnet.attack.TestAllAttack;
import com.acmutv.botnet.bot.TestAllBot;
import com.acmutv.botnet.config.TestAllConfig;
import com.acmutv.botnet.report.TestAllReport;
import com.acmutv.botnet.service.TestAllService;
import com.acmutv.botnet.target.TestAllTarget;
import com.acmutv.botnet.time.TestAllTime;
import com.acmutv.botnet.tool.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class realizes the JUnit test suite that encapsulates all the JUnit tests for the whole app.
 * @author Giacomo Marciani {@literal <gmarciani@acm.org>}
 * @author Michele Porretta {@literal <mporretta@acm.org>}
 * @since 1.0
 * @see TestAllAttack
 * @see TestAllBot
 * @see TestAllConfig
 * @see TestAllReport
 * @see TestAllService
 * @see TestAllTarget
 * @see TestAllTime
 * @see TestAllTool
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestAllAttack.class,
    TestAllBot.class,
    TestAllConfig.class,
    TestAllReport.class,
    TestAllService.class,
    TestAllTarget.class,
    TestAllTime.class,
    TestAllTool.class
})
public class TestAll {

}
