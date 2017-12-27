package io.github.vlad324.batch;

import io.github.vlad324.model.RequestResult;
import lombok.Setter;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.web.client.RestTemplate;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
@Setter
public class RequestItemProcessor implements ItemProcessor<String, RequestResult> {

    private RestTemplate restTemplate;

    @Override
    public RequestResult process(final String url) {
        Boolean result = restTemplate.getForObject(url, Boolean.class);

        return new RequestResult(url, result);
    }
}
