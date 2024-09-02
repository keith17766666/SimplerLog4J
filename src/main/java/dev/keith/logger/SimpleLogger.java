package dev.keith.logger;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

public abstract class SimpleLogger implements Logger {
    protected String name;
    protected SimpleLogger(String name) {
        this.name = name;
    }

    protected abstract boolean isLevelEnabled(Level level);
    protected abstract void log(Level level, String s);

    //places for Logger interface's method

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isTraceEnabled() {
        return isLevelEnabled(Level.TRACE);
    }

    @Override
    public void trace(String s) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(String s, Object o) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(String s, Object o, Object o1) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(String s, Object... objects) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(String s, Throwable throwable) {
        log(Level.TRACE, s);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return isEnabledForLevel(Level.TRACE);
    }

    @Override
    public void trace(Marker marker, String s) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(Marker marker, String s, Object o) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(Marker marker, String s, Object... objects) {
        log(Level.TRACE, s);
    }

    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        log(Level.TRACE, s);
    }

    @Override
    public boolean isDebugEnabled() {
        return isLevelEnabled(Level.DEBUG);
    }

    @Override
    public void debug(String s) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(String s, Object o) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(String s, Object o, Object o1) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(String s, Object... objects) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(String s, Throwable throwable) {
        log(Level.DEBUG, s);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return isLevelEnabled(Level.DEBUG);
    }

    @Override
    public void debug(Marker marker, String s) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(Marker marker, String s, Object o) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(Marker marker, String s, Object... objects) {
        log(Level.DEBUG, s);
    }

    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        log(Level.DEBUG, s);
    }

    @Override
    public boolean isInfoEnabled() {
        return isLevelEnabled(Level.INFO);
    }

    @Override
    public void info(String s) {
        log(Level.INFO, s);
    }

    @Override
    public void info(String s, Object o) {
        log(Level.INFO, s);
    }

    @Override
    public void info(String s, Object o, Object o1) {
        log(Level.INFO, s);
    }

    @Override
    public void info(String s, Object... objects) {
        log(Level.INFO, s);
    }

    @Override
    public void info(String s, Throwable throwable) {
        log(Level.INFO, s);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return isLevelEnabled(Level.INFO);
    }

    @Override
    public void info(Marker marker, String s) {
        log(Level.INFO, s);
    }

    @Override
    public void info(Marker marker, String s, Object o) {
        log(Level.INFO, s);
    }

    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        log(Level.INFO, s);
    }

    @Override
    public void info(Marker marker, String s, Object... objects) {
        log(Level.INFO, s);
    }

    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        log(Level.INFO, s);
    }

    @Override
    public boolean isWarnEnabled() {
        return isLevelEnabled(Level.WARN);
    }

    @Override
    public void warn(String s) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(String s, Object o) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(String s, Object... objects) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(String s, Object o, Object o1) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(String s, Throwable throwable) {
        log(Level.WARN, s);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return isLevelEnabled(Level.WARN);
    }

    @Override
    public void warn(Marker marker, String s) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(Marker marker, String s, Object o) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(Marker marker, String s, Object... objects) {
        log(Level.WARN, s);
    }

    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        log(Level.WARN, s);
    }

    @Override
    public boolean isErrorEnabled() {
        return isLevelEnabled(Level.ERROR);
    }

    @Override
    public void error(String s) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(String s, Object o) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(String s, Object o, Object o1) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(String s, Object... objects) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(String s, Throwable throwable) {
        log(Level.ERROR, s);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return isLevelEnabled(Level.ERROR);
    }

    @Override
    public void error(Marker marker, String s) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(Marker marker, String s, Object o) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(Marker marker, String s, Object... objects) {
        log(Level.ERROR, s);
    }

    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        log(Level.ERROR, s);
    }
}
