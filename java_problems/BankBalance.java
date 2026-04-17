class BankBalance{
    String name;
    int balance;
    BankBalance(String name, int amount){
        this.name = name;
        balance = amount;
    }

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    int curr_balance(){
        return balance;
    }

    public static void main(String[] args){
        BankBalance new_user = new BankBalance("vyom", 4000);
        System.out.println(new_user.balance);
        new_user.deposit(300);
        System.out.println(new_user.curr_balance());
        new_user.withdraw(2000);
        System.out.println(new_user.curr_balance());
    }
}
