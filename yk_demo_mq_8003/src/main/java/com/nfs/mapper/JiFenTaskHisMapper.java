package com.nfs.mapper;

import com.nfs.bean.JiFen;
import com.nfs.bean.JiFenTaskHis;
import com.nfs.bean.OrderTask;

public interface JiFenTaskHisMapper {
    JiFenTaskHis selectById(String task_id);

    Boolean updateScore(JiFen jiFen);

    Boolean addjiFenHisTask(OrderTask orderTask);
}
