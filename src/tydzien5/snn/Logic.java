package tydzien5.snn;

public class Logic {

    int greatest (int a, int b, int c) {
        if (((a >= b) && (a > c))) { return a; } else
        if (((b >= a) && (b > c))) { return b; } else
        {return c;}
    }

    int least (int a, int b, int c) {
        if (((a <= b) && (a < c))) {return a; } else
        if (((b <= a) && (b < c))) {return b; } else
        { return c; }
    }

    double average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}