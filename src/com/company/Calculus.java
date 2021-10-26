package com.company;

public class Calculus {
    protected int x;
    protected int y;
    protected String operator;

    public Calculus(){}
    public Calculus(int x, int y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double Calc()
    {
        if(operator == "*") return x*y;
        if(operator == "+") return x+y;
        if(operator == "-") return x-y;
        if(operator == "/")
        {
            if(y == 0) return 0;
            else return x/y;
        }
        else return 0;
    }
}
