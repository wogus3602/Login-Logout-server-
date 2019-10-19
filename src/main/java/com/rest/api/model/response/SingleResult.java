package com.rest.api.model.response;
import com.rest.api.model.response.CommonResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SingleResult<T> extends CommonResult {
    private T data;
}