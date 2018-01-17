package cn.cjq.bomb.config;

  /** @author cjq
   *  @CreateDate 2018/01/17
   */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduleConfig {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);

    //每隔10秒全局广播一次
    @Scheduled(fixedRate = 10000)
    void sendListenDeclarMsg(){
        logger.info("定时任务");
        System.out.println("同步ing。。。。。。");
    }

    /**
     * 每天清晨3点记录日志
     */
    @Scheduled(cron = "0 0 3 * * ?")
    void slf4j(){
        logger.info("清晨3点");
    }

}
