package com.fei.wx.task;

import com.fei.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TaskStartupRunner implements ApplicationRunner {

//    @Autowired
//    private LitemallOrderService orderService;
    @Autowired
    private TaskService taskService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        List<LitemallOrder> orderList = orderService.queryUnpaid(SystemConfig.getOrderUnpaid());
//        for (LitemallOrder order : orderList) {
//            LocalDateTime add = order.getAddTime();
//            if (add == null) {
//                continue;
//            }
//            LocalDateTime now = LocalDateTime.now();
//            LocalDateTime expire = add.plusMinutes(SystemConfig.getOrderUnpaid());
//            if (expire.isBefore(now)) {
//                // 已经过期，则加入延迟队列
//                taskService.addTask(new OrderUnpaidTask(order.getId(), 0));
//            } else {
//                // 还没过期，则加入延迟队列
//                long delay = ChronoUnit.MILLIS.between(now, expire);
//                taskService.addTask(new OrderUnpaidTask(order.getId(), delay));
//            }
//        }
    }
}
