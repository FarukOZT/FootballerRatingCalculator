package com.football;

public class StrikerDataBase extends FootballerDataBase {

    public int hesapla() {
        int gol = 30;
        int assist = 20;
        //-----------------------------------------------
        int golSayisi = 1;
        int assistSayısı = 2;
        int ikiliMücadeleKazanmaSayısı = 1;
        int kafaTopuKazanmaSayısı = 2;
        int kilitPasSayısı = 3;
        int topKapmaSayısı = 5;
        int pasArasıYapmaSayısı = 5;
        int şutEngellemeSayısı = 5;

        if (golSayisi > 0 || assistSayısı > 0 || ikiliMücadeleKazanmaSayısı > 0 || kafaTopuKazanmaSayısı > 0 ||
                kilitPasSayısı > 0 || topKapmaSayısı > 0 || pasArasıYapmaSayısı > 0 || şutEngellemeSayısı > 0)
            totalRating = totalRating + golSayisi * gol + assistSayısı * assist +
                    ikiliMücadeleKazanmaSayısı * ikiliMücadeleKazanma + kafaTopuKazanmaSayısı * kafaTopuKazanma +
                    kilitPasSayısı * kilitPas + topKapma * topKapmaSayısı + pasArasıYapma * pasArasıYapmaSayısı +
                    şutEngelleme * şutEngellemeSayısı;

        if (totalRating >= 100) {
            totalRating = 100;
        }
        return totalRating;

    }
}

