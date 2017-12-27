package io.github.vlad324.batch;

import lombok.extern.log4j.Log4j2;
import org.springframework.batch.item.ItemReader;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
@Log4j2
public class UrlItemReader implements ItemReader<String> {
    private volatile long count = 0;

    @Override
    public synchronized String read() {
        count++;

        if (count <= 50) {
            String url = "http://localhost:8080/?id=" + count;

            return url;
        }

        return null;
    }
}
