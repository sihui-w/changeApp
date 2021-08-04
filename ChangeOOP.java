import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ChangeOOP {

    Scanner scanner = new Scanner(System.in);
    String key = "";
    String canteen = "";
    boolean loop = true;


    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    String details = "================零钱通明细===============";

    //    主菜单
    public void MainMenu() {

        do {

            System.out.println("\n================零钱通菜单(OOP)===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.print("请选择(1-4): ");
            key = scanner.next();

//                根据输入结果，分情况处理

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.expense();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");

            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    //      收益入账
    public void income() {
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;
    }

    //        消费
    public void expense() {
        System.out.print("消费地点: ");
        canteen = scanner.next();

        System.out.print("消费金额: ");
        money = scanner.nextDouble();

        date = new Date();
        balance -= money;
        details += "\n" + canteen + "\t-" + money + "\t" + simpleDateFormat.format(date) + "\t" + balance;

    }

    //        退出

    public void exit() {
        String check = "";
        while (true) {
            System.out.print("确定要退出吗？Y/N");
            check = scanner.next();

            if ("Y".equals(check)) {
                break;
            } else if ("N".equals(check)) {
                break;
            }
        }
        if (check.equals("y")) {
            loop = false;

        }

    }
}
