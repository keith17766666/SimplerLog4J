package dev.keith.logger;

public abstract class SimpleLoggerFactory<L extends SimpleLogger> {
    public abstract L create(String name);

    public L create(Class<?> clazz) {
        return this.create(clazz.getName());
    }
}
