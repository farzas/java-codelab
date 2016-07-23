package com.codelab;

/**
 * Efficient storage of Loto results.
 */
class Lotto {
    private long data;
    private long mask4 = 0xFL;
    private long mask5 = 0x1FL;
    private long mask6 = 0x3FL;
    private long mask12 = 0xFFFL;
    private long DAY = mask5 << 52;
    private long MONTH = mask4 << 48;
    private long YEAR = mask12 << 36;
    private long NUMBER1 = mask6 << 30;
    private long NUMBER2 = mask6 << 24;
    private long NUMBER3 = mask6 << 18;
    private long NUMBER4 = mask6 << 12;
    private long NUMBER5 = mask6 << 6;
    private long NUMBER6 = mask6 << 0;

    public Lotto(long tag, long monat, long jahr, long[] number) {
        data = (number[5] << 0)+
               (number[4] << 6)+
               (number[3] << 12)+
               (number[2] << 18)+
               (number[1] << 24)+
               (number[0] << 30)+
               (tag << 52)+
               (monat << 48)+
               (jahr << 36);
    }

    public String getDate() {
        String day = Long.toString((data & DAY) >> 52);
        String month = Long.toString((data & MONTH) >> 48);
        String year = Long.toString((data & YEAR) >> 36);
        return month + "/" + day + "/" + year;
    }

    public long getNumber(int i) {
        switch (i) {
        case 1:
            return (data & NUMBER1)>>30;
        case 2:
            return (data & NUMBER2)>>24;
        case 3:
            return (data & NUMBER3)>>18;
        case 4:
            return (data & NUMBER4)>>12;
        case 5:
            return (data & NUMBER5)>>6;
        case 6:
            return (data & NUMBER6)>>0;
        }
        return 0;
    }

}
