package Lesson11.HomeWor17;

public class iPhones extends Actions implements Smartphones, iOS {

    iPhones(){
        super(100,150,1000,16);
    }

    @Override
    public void call() {
        System.out.println("Кол-во звонков поступило на iPhones : ");

    }

    @Override
    public void sms() {
        System.out.println("Кол-во смс поступило на iPhones : ");

    }

    @Override
    public void internet() {
        System.out.println("Кол-во трафика потраченого на iPhones : ");


    }

    @Override
    public void getIosVersion() {
        System.out.println("Версия iPhones : ");

    }

    @Override
    public String toString() {
        return  " Кол-во звонков: " + getCalls() +
                ", Кол-во смс: " + getSms() +
                ", Потраченно трафика: " + getTraficInthernet() +
                ", Версия: " + getVersion() + "}"
                ;
    }
}
