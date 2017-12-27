package io.github.vlad324.executor;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.task.TaskExecutor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
public class CustomTaskExecutor extends ScheduledThreadPoolExecutor implements TaskExecutor {


    private static int CORE_POOL_SIZE = 4;

    @Setter
    private long delay;

    @Setter
    private TimeUnit delayTimeUnit;

    public CustomTaskExecutor() {
        super(CORE_POOL_SIZE);
    }

    @Override
    public void execute(final Runnable command) {
        this.schedule(command, delay, delayTimeUnit);
    }
}
