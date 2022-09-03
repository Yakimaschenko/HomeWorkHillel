package Lesson11.HomeWor17;

public class Androids extends Actions implements Smartphones, LinuxOS {

    public Androids(){
        super(12,20,100,15);
    };

    @Override
    public void call() {
        System.out.println("Кол-во звонков поступило на Androids : ");

    }

    @Override
    public void sms() {
        System.out.println("Кол-во смс поступило на Androids : ");

    }

    @Override
    public void internet() {
        System.out.println("Кол-во трафика потраченого на Androids : ");

    }

    @Override
    public void getLinuxVersion() {
        System.out.println("Версия Androids : ");

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
