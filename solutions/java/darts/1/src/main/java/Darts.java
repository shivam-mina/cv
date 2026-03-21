class Darts {
    int score(double x, double y) {
        double hyp=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if(hyp<=1)
            return 10;
        else if( hyp<=5)
            return 5;
        else if (hyp<=10)
            return 1;
        else
            return 0;     
    }
}
