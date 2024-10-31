//十(hour)
// 分(minute)
//秒(second)

//方法:建構子(設定時分秒的初始直，需檢查資料是否格式正確)
//方法:tick(時間增加一秒)
//方法:是需要加入get/set
//方法:printUniversal(以24小時制輸出完整時間)
//方法:printStandard(以12小時制輸出完整時間)

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public Time1(int hour, int minute, int second) {
        if (hour >= 0 && hour<24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }

        if (minute >= 0 && minute<60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }

        if (second >= 0 && second<60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }


    public void tick() {
        second++;
        if (second ==60) {
            second = 0;
            minute++;
            if (minute ==60) {
                minute = 0;
                hour++;
                if (hour ==24) {
                    hour = 0;
                }
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <60) {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <60) {
            this.second = second;
        }
    }

    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public void printStandard() {
        int hour12 = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s\n", hour12, minute, second, amPm);
    }
}


