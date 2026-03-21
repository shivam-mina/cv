class Leap {

    boolean isLeapYear(int year) {
        int a=year%100;
        int b=year%4;
        int c=year%400;

        if(a==0 && c==0) return true;
        if(a!=0 && b==0) return true;
        return false;
    }

}
