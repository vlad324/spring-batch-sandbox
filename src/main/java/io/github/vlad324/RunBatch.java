package io.github.vlad324;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author v.radkevich
 * @since 12/27/17
 */
public class RunBatch {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        JobLauncher jobLauncher = context.getBean(JobLauncher.class);
        Job generateReportJob = context.getBean(Job.class);
        jobLauncher.run(generateReportJob, new JobParameters());
    }
}
