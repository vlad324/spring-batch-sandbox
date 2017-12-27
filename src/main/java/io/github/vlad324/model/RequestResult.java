package io.github.vlad324.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class RequestResult {
    private String url;
    private boolean result;
}
