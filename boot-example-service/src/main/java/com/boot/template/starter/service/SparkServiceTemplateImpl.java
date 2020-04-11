package com.boot.template.starter.service;

import com.boot.template.starter.remote.SparkServiceTemplate;
import org.apache.dubbo.config.annotation.Service;

@Service
public class SparkServiceTemplateImpl implements SparkServiceTemplate {
    @Override
    public int wordCount(String s) {
        return 0;
    }
}
