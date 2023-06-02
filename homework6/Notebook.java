import java.util.*;

public class Notebook {
    /*Подумать над структурой класса Ноутбук для магазина техники -     
выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     * 
    */
        
    private Integer coast;
    private Integer ramCount;
    private Integer hardDriveCount;
    private String operationSystem;
    private String color;
    private Integer videoCardCapacity;

    public Notebook(Integer coast, Integer ramCount, Integer hardDriveCount, String operationSystem, String color, Integer videoCardCapacity){
        this.coast = coast;
        this.ramCount = ramCount;
        this.hardDriveCount = hardDriveCount;
        this.operationSystem = operationSystem;
        this.color = color;
        this.videoCardCapacity = videoCardCapacity;
    }

    public Integer getcoast(){
        return coast;
    }

    public Integer getramCount(){
        return ramCount;
    }

    public Integer gethardDriveCount(){
        return hardDriveCount;
    }

    public Integer getvideoCardCapacity(){
        return videoCardCapacity;
    }

    public String getcolor(){
        return color;
    }

    public String getoperationSystem(){
        return operationSystem;
    }
            
    public String toString() {
        String result = String.format("coast: %s; ramCount: %s; hardDriveCount: %s; operationSystem: %s; color: %s; " +
                "videoCardCapacity: %s.", coast, ramCount, hardDriveCount, operationSystem, color, videoCardCapacity);
        return result;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook note = (Notebook) obj;
        return operationSystem.equals(note.operationSystem) && color.equals(note.color) && coast == note.coast && ramCount == note.ramCount && hardDriveCount == note. hardDriveCount && videoCardCapacity == note. videoCardCapacity;
    }

    @Override
    public int hashCode() {
        // return Objects.hash(coast, ramCount, hardDriveCount, operationSystem, color, videoCardCapacity);
        return coast + ramCount + hardDriveCount+ operationSystem.hashCode() + color.hashCode() + videoCardCapacity;
    }


}
