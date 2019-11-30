package com.outseaeasy.feignserviceconsumer.fallback;

import com.outseaeasy.feignserviceconsumer.api.FeignServiceInterface;
import org.springframework.stereotype.Component;
import feign.hystrix.FallbackFactory;

@Component
public class FeignServiceInterfaceFallbackFactory implements FallbackFactory<FeignServiceInterface> {

    @Override
    public FeignServiceInterface create(Throwable cause) {
        return new FeignServiceInterface() {

            @Override
            public String hello(String name) {
                try {
                    /*
                     * 休眠2s，模拟被hystrix监控的服务发生异常后的处理过程
                     */
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return "【/hello】服务异常。。。。。";
            }

        };
    }

}