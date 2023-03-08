// 1.Прочитать прикреплённые в архиве лекции а так же выучить всю теорию, изученную на лекциях.
// 2.На любом языке C++ или C# реализовать следующий набор классов, при этом должна быть выделена их иерархия:
// 	2.1.Транспортное средство
// 	2.2.Автомобиль
// 	2.3.Мотоцикл
// 	2.4.Грузовик
// 	2.5.Велосипед
// Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
// В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем, 
// то есть показать значение всех его публичных свойств и вызвать метод ехать.

// program.java
package lesson1;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        var tr1 = new Transport();
        // System.out.println(tr1.getInfo());

    }


}

// transport.java
public class Transport{
    protected int color;
    protected String model;
    protected int wheelCount;
    protected double wight;
    protected int speed;

    public Transport (int color, String model, int wheelCount, double wight, int speed) {
        this.color = color;
        this.model = model;
        this.wheelCount = wheelCount;
        this.wight = wight;
        this.speed = speed;
    }
    public Transport () {
        this.color = 1;
        this.model = "Fiat";
        this.wheelCount = 4;
        this.wight = 1.45;
        this.speed = 160;
    }

    // public String getInfo() {
    //     return String.format("color = %d, model = %s, wheelCount = %d, wight = %f, speed = %d", color, model, wheelCount, wight, speed);
    // }
    
    // void drive() {
    //     System.out.println("Transport drive");
    // }
}

///пезагрузка
//super(String.format("Hero_Magician #%d", ++Magician.number),
//                Magician.r.nextInt(100, 200));
