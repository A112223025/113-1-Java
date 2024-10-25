package edu.shu.Angela;

 public CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber(){ 2usages
    return this.number;
    }
    int getBalance(){ 2usages
    return this.balance;
    }
    int getBonus(){2usages
    return this.bonus;
    }
    void setNumber(String number){ no usages
    this.number = number;
    }
    //儲值
    public void store(int money) {
        if(money > 0) {
            this.balance += money;
            if(money >= 1000) {
                this.bonus += money/1000;
            }
        }
        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }
    else{
        System.out.println("卡號不符");
     }

    public void charge(int money) {
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠啦！");
            }
        }
        else {
            System.out.println("扣負數？這不是叫我儲值嗎？");
        }
    }

    int exchange(int bonus) {
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    int getBalance() {
        return balance;
    }

    int getBonus() {
        return bonus;
    }

    String getNumber() {
        return number;
    }
}
