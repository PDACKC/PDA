
class Age
{
    private int days;
    private int months;
    private int years;

    private Age()
    {
        //Prevent default constructor
    }

    public Age(int days, int months, int years)
    {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public int getDays()
    {
        return this.days;
    }

    public int getMonths()
    {
        return this.months;
    }

    public int getYears()
    {
        return this.years;
    }

    @Override
    public String toString()
    {
        return years + " Years, " + months + " Months, " + days + " Days";
    }

    public String results() {
    int y = years;
    int m = months;
    String yes = "yeah, but you already know that";
    String no = "Pls don't oh god";
        if (y<=1997 && m<2)
        {
       return yes;
    }
    else{
        return no;
    }
    }

}

