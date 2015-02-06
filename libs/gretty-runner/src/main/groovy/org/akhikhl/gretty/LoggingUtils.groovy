/*
 * Gretty
 *
 * Copyright (C) 2013-2014 Andrey Hihlovskiy and contributors.
 *
 * See the file "LICENSE" for copying and usage permission.
 * See the file "CONTRIBUTORS" for complete list of contributors.
 */
package org.akhikhl.gretty

//import ch.qos.logback.classic.Level
//import ch.qos.logback.classic.LoggerContext
//import ch.qos.logback.classic.encoder.PatternLayoutEncoder
//import ch.qos.logback.classic.jul.LevelChangePropagator
//import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter
//import ch.qos.logback.classic.util.ContextInitializer
//import ch.qos.logback.core.ConsoleAppender
//import ch.qos.logback.core.rolling.RollingFileAppender
//import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import org.slf4j.LoggerFactory

final class LoggingUtils {

  static void configureLogging(Map options) {
//    Level loggingLevel = Level.toLevel(options.loggingLevel)
//    boolean consoleLogEnabled = options.consoleLogEnabled as boolean
//    boolean fileLogEnabled = options.fileLogEnabled as boolean
//    String logFileName = options.logFileName
//    String logDir = options.logDir
//
//    resetLogging()
//    LoggerContext logCtx = LoggerFactory.getILoggerFactory()
//
//    logCtx.addTurboFilter(new ReconfigureOnChangeFilter().with {
//      context = logCtx
//      refreshPeriod = 60 * 1000 // milliseconds
//      start()
//      it
//    })
//
//    def levelChangePropagator = new LevelChangePropagator()
//    levelChangePropagator.setContext(logCtx)
//    logCtx.addListener(levelChangePropagator)
//
//    def logConsoleAppender
//    if(consoleLogEnabled && loggingLevel != Level.OFF)
//      logConsoleAppender = new ConsoleAppender().with {
//        context = logCtx
//        name = 'console'
//        encoder = new PatternLayoutEncoder().with {
//          context = logCtx
//          pattern = '%-12date{YYYY-MM-dd HH:mm:ss.SSS} %-5level - %msg%n'
//          start()
//          it
//        }
//        start()
//        it
//      }
//
//    def logFileAppender
//    if(fileLogEnabled && loggingLevel != Level.OFF) {
//      logFileAppender = new RollingFileAppender()
//      logFileAppender.with {
//        context = logCtx
//        name = 'logFile'
//        encoder = new PatternLayoutEncoder().with {
//          context = logCtx
//          pattern = '%-12date{YYYY-MM-dd HH:mm:ss.SSS} %-5level - %msg%n'
//          start()
//          it
//        }
//        append = true
//        file = "${logDir}/${logFileName}.log"
//        rollingPolicy = new TimeBasedRollingPolicy().with {
//          context = logCtx
//          parent = logFileAppender
//          fileNamePattern = "${logDir}/${logFileName}-%d{yyyy-MM-dd_HH}.log"
//          maxHistory = 7
//          start()
//          it
//        }
//        start()
//      }
//    }
//
//    logCtx.getLogger('root').with {
//      additive = false
//      level = loggingLevel
//      if(logConsoleAppender)
//        addAppender(logConsoleAppender)
//      if(logFileAppender)
//        addAppender(logFileAppender)
//    }
  }

  private static void resetLogging() {
//    LoggerContext logCtx = LoggerFactory.getILoggerFactory()
//    logCtx.stop()
//    Map loggerCache = LoggerFactory.getILoggerFactory().@loggerCache
//    for(String loggerName in new HashSet(loggerCache.keySet()))
//      if(!loggerName.startsWith('org.eclipse.jetty'))
//        loggerCache.remove(loggerName)
  }

  static void useConfig(String logbackConfigFile) {
//    resetLogging()
//    LoggerContext logCtx = LoggerFactory.getILoggerFactory()
//    new ContextInitializer(logCtx).configureByResource(new File(logbackConfigFile).toURI().toURL())
  }
}
