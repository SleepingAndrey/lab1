package pack1;

public class SecondClass {
    private int a;
    private int b;

    public void setA(int a){                // Принимаем значение поля a
        this.a = a;
    }
    public void setB(int b){                // Принимаем значение поля b
        this.b = b;
    }
    public int getA(){                      // Возвращаем значение поля a
        return a;
    }
    public int getB(){                      // Возвращаем значение поля b
        return b;
    }
    public int getSum(){                    // Метод подсчета суммы
        return a + b;
    }
}
