//package cn.cjq.bomb.config;
//
//import cn.xydata.entity.*;
//import cn.xydata.service.impl.redis.HashMapRedisServiceImpl;
//import cn.xydata.service.impl.redis.QueueRedisServiceImpl;
//import cn.xydata.service.impl.redis.QueueWeightRedisServiceImpl;
//import cn.xydata.service.queue.MsgService;
//import cn.xydata.service.queue.QueueService;
//import cn.xydata.util.PersonGenBean;
//import cn.xydata.util.SystemConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.text.ParseException;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * @author kaiqian
// * @CreateDate 2017/9/3
// */
//@Component
//public class ScheduleConfig {
//
//    private static final Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);
//
//    @Value("${redis.key.listendeclare}")
//    private String listenDeclareKey;
//
//    @Value("${redis.key.queue}")
//    private String queue_key;
//
//    @Autowired
//    private QueueRedisServiceImpl queueRedisService;
//
//    @Autowired
//    private QueueWeightRedisServiceImpl queueWeightRedisService;
//
//    @Autowired
//    private HashMapRedisServiceImpl hashMapRedisService;
//
//    @Autowired
//    private QueueService queueService;
//
//    @Value("${rabbitmq.fanoutexchagename}")
//    private String fanoutExchange;
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    @Autowired
//    private PersonGenBean personGenBean;
//
//    @Autowired
//    private SystemConfig systemConfig;
//
//    @Autowired
//    private MsgService msgService;
//
////    //每隔10秒全局广播一次
////    @Scheduled(fixedRate = 10000)
////    void sendListenDeclarMsg(){
////
////        HashMap<String,String> ret = hashMapRedisService.get(this.listenDeclareKey);
////
////        try {
////            msgService.sendMsgLicense(ret);
////        } catch (Exception e) {
////            logger.error("====================HeartBeat Failed====================");
////            e.printStackTrace();
////        }
////
////    }
////
////
////    @Scheduled(fixedRate = 300000)
//////每隔60秒更新一次队列权重
////    void updateQueueWeight(){
////
////        if (systemConfig.getSystemLogger() == 0) logger.info("->更新队列权重开始.......");
////
////        List<Queue> queueList = queueRedisService.getAll();
////
////        for (Queue q : queueList) {
////            QueueWeight queueWeight = queueWeightRedisService.get(q.getClientId());
////            if (systemConfig.getQueueLogger() == 0)
////                logger.info("队列权重变更： ID(" + q.getClientId() + ") (" + q.getWeight() + ")->(" + queueWeight.getCurrentWeight() + ")");
////            q.setWeight(queueWeight.getCurrentWeight());
////            q.setPriority(q.getWeight() * q.getCount());
////            queueRedisService.put(q.getClientId(), q, -1);
////        }
////        if (systemConfig.getSystemLogger() == 0) logger.info("<-更新队列权重完毕.......");
////    }
////
////    //每隔5秒同步一次HIS
////    @Scheduled(fixedRate = 5000)
////    void genPerson(){
////        if (systemConfig.getSystemLogger() == 0) logger.info("->新增人员.......");
////        try {
////            personGenBean.doSync();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        if (systemConfig.getSystemLogger() == 0) logger.info("<-新增人员完毕.......");
////    }
////
////
////    /**
////     * 每天清晨3点处理系统清0
////     */
////    @Scheduled(cron = "0 0 3 * * ?")
////    public void cronJob() {
////        try {
////            queueService.queueSystemInit();
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////    }
//    //每隔5秒同步一次SMS
//    @Scheduled(fixedRate = 5000)
//    void genSMS(){
//        if (systemConfig.getSystemLogger() == 0) logger.info("->同步SMS.......");
//        try {
//            personGenBean.dosynSMS();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (systemConfig.getSystemLogger() == 0) logger.info("<-SMS同步完毕.......");
//    }
//
//
//
//}
