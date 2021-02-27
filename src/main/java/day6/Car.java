package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear) {
        if (carYear <=0 ) {
            System.out.println("Год выпуска автомобиля целочисленное число строго больше нуля");
        } else {
            year = carYear;
        }
    }

    public int getYear() {
      if (year == 0) {
          System.out.println("Не установлено значение поля объекта Year");
          return 0;
      } else {
          return year;
      }
    }

    public void setColor(String carColor) {
        if (carColor.isEmpty()) {
            System.out.println("Цвет автомобиля не задан");
        } else {
            color = carColor;
        }
    }

    public String getColor() {
        if (color.isEmpty()) {
            System.out.println("Не установлено значение поля объекта Color");
            return null;
        } else {
            return color;
        }
    }

    public void setModel(String carModel) {
        if (carModel.isEmpty()) {
            System.out.println("Модель автомобиля не задана");
        } else {
            model = carModel;
        }
    }

    public String getModel() {
        if (model.isEmpty()) {
            System.out.println("Не установлено значение поля объекта Model");
            return null;
        } else {
            return model;
        }
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }
}