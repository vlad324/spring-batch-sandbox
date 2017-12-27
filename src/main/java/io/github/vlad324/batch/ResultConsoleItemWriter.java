package io.github.vlad324.batch;

import io.github.vlad324.model.RequestResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
@Log4j2
public class ResultConsoleItemWriter implements ItemWriter<RequestResult> {
    @Override
    public void write(final List<? extends RequestResult> items) throws Exception {

        items.forEach(log::info);
    }
}
