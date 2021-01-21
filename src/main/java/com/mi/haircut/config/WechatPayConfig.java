package com.mi.haircut.config;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 支付配置
 */
@Component
public class WechatPayConfig {

    @Autowired
    private WechatAccounConfig accounConfig;


    @Bean
    public BestPayServiceImpl bestPayService(){

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayH5Config(wxPayH5Config());
        return bestPayService;

    }

    @Bean
    public WxPayH5Config wxPayH5Config(){
        WxPayH5Config wxPayH5Config = new WxPayH5Config();
        wxPayH5Config.setAppId(accounConfig.getMpAppId());
        wxPayH5Config.setAppSecret(accounConfig.getMpAppSecret());
        wxPayH5Config.setMchId(accounConfig.getMchId());
        wxPayH5Config.setMchKey(accounConfig.getMchKey());
        wxPayH5Config.setKeyPath(accounConfig.getKeyPath());
        wxPayH5Config.setNotifyUrl(accounConfig.getNotifyUrl());
        return wxPayH5Config;
    }
}