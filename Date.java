public class Date {

    private int day;
    private int month;
    private int year;


    public void setDate(int dy , int mnth, int yr ){
        if ((dy > 0 && dy < 32 ) && (mnth <= 12 && mnth > 0) && (year <= 2023)){
            day = dy;
            month = mnth ;
            year = yr;
        }

    }

    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}


    
}
