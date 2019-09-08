package com.feigong.nacoscustomer.compoent;/**
 * .::::.
 * .::::::::.
 * :::::::::::    佛主保佑、永无Bug
 * ..:::::::::::'
 * '::::::::::::'
 * .::::::::::
 * '::::::::::::::..
 * ..::::::::::::.
 * ``::::::::::::::::
 * ::::``:::::::::'        .:::.
 * ::::'   ':::::'       .::::::::.
 * .::::'      ::::     .:::::::'::::.
 * .:::'       :::::  .:::::::::' ':::::.
 * .::'        :::::.:::::::::'      ':::::.
 * .::'         ::::::::::::::'         ``::::.
 * ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 * '.:::::'                    ':'````..
 */

import com.feigong.nacoscustomer.feignInterface.ProviderFeignClient;
import org.springframework.stereotype.Component;

/**
 *
 * @Author GF
 * @Date 2019/9/8 15:39
 */
@Component
public class ProviderHystrix implements ProviderFeignClient {
    @Override
    public String provider(String str) {
        return "错误：" + str;
    }
}
