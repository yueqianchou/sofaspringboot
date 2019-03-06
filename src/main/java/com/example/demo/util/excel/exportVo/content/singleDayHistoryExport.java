package com.example.demo.util.excel.exportVo.content;

import com.example.demo.util.excel.annotation.ExcelField;

/**
 * @Author: duanww
 * @Date: 2019/1/31 17:20
 */
public class singleDayHistoryExport {
    //日期
    private String statDay;
    //pv
    private String pagePv;
    //uv
    private String pageUv;
    //人均访问次数
    private String pageAvg;
    //页面平均停留时长（秒）
    private String restTime;
    @ExcelField(title = "日期", type = 1, align = 1, fieldType = String.class, sort = 1)
    public String getStatDay() {
        return statDay;
    }

    public void setStatDay(String statDay) {
        this.statDay = statDay;
    }
    @ExcelField(title = "pv", type = 1, align = 1, fieldType = String.class, sort = 2)
    public String getPagePv() {
        return pagePv;
    }

    public void setPagePv(String pagePv) {
        this.pagePv = pagePv;
    }
    @ExcelField(title = "uv", type = 1, align = 1, fieldType = String.class, sort = 3)
    public String getPageUv() {
        return pageUv;
    }

    public void setPageUv(String pageUv) {
        this.pageUv = pageUv;
    }
    @ExcelField(title = "人均访问次数", type = 1, align = 1, fieldType = String.class, sort = 4)
    public String getPageAvg() {
        return pageAvg;
    }

    public void setPageAvg(String pageAvg) {
        this.pageAvg = pageAvg;
    }
    @ExcelField(title = "页面平均停留时长（秒）", type = 1, align = 1, fieldType = String.class, sort = 5)
    public String getRestTime() {
        return restTime;
    }

    public void setRestTime(String restTime) {
        this.restTime = restTime;
    }
}
