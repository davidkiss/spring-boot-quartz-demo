package com.kaviddiss.bootquartz.job;

import com.kaviddiss.bootquartz.service.SampleService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by david on 2015-01-20.
 */
public class SampleJob extends QuartzJobBean {
    @Autowired
    private SampleService service;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        service.hello();
    }
}
