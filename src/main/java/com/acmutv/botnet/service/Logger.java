/*
  The MIT License (MIT)
  <p>
  Copyright (c) 2016 Giacomo Marciani and Michele Porretta
  <p>
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  <p>
  <p>
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
  <p>
  <p>
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
 */

package com.acmutv.botnet.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class realizes logging utilities.
 * @author Giacomo Marciani {@literal <gmarciani@acm.org>}
 * @author Michele Porretta {@literal <mporretta@acm.org>}
 * @since 1.0
 * @see DateTimeFormatter
 */
public class Logger {

  private static final boolean INFO = true;
  private static final boolean ERROR = true;

  private static final String HEADER = "BOT";
  private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:n");

  /**
   * Logs the specified information message (if debug mode is active).
   * @param message the information message.
   */
  public static void info(final String message) {
    if (Logger.INFO) {
      System.out.format("[%s %s]> %s\n", HEADER, DTF.format(LocalDateTime.now()), message);
    }
  }

  /**
   * Logs the specified error message (if debug mode is active).
   * @param message the error message.
   */
  public static void error(final String message) {
    if (Logger.ERROR) {
      System.err.format("[%s %s]> ERROR :: %s\n", HEADER, DTF.format(LocalDateTime.now()), message);
    }
  }
}