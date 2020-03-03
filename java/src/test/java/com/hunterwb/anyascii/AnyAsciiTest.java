package com.hunterwb.anyascii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AnyAsciiTest {

    @Test public void test() {
        check("", "");
        check("René François Lacôte", "Rene Francois Lacote");
        check("Großer Hörselberg", "Grosser Horselberg");
        check("Trần Hưng Đạo", "Tran Hung Dao");
        check("Nærøy", "Naeroy");
        check("Φειδιππίδης", "Feidippidis");
        check("Δημήτρης Φωτόπουλος", "Dimitris Fotopoylos");
        check("Борис Николаевич Ельцин", "Boris Nikolaevich El'tsin");
        check("دمنهور", "dmnhwr");
        check("אברהם הלוי פרנקל", "'vrhm hlvy frnkl");
        check("სამტრედია", "samt'redia");
        check("Աբովյան", "Abovyan");
        check("สงขลา", "sngkhla");
        check("ສະຫວັນນະເຂດ", "sahvannaekhd");
        check("深圳", "ShenZhen");
        check("深水埗", "ShenShuiBu");
        check("화성시", "hwaseongsi");
        check("華城市", "HuaChengShi");
        check("さいたま", "saitama");
        check("埼玉県", "QiYuXian");
        check("トヨタ", "toyota");
        check("⠠⠎⠁⠽⠀⠭⠀⠁⠛", "^say x ag");
        check("ময়মনসিংহ", "mymnsimh");
        check("પોરબંદર", "porbmdr");
        check("महासमुंद", "mhasmumd");
        check("ಬೆಂಗಳೂರು", "bemgluru");
        check("കളമശ്ശേരി", "klmsseri");
        check("ਜਲੰਧਰ", "jlmdhr");
        check("ଗଜପତି", "gjpti");
        check("රත්නපුර", "rtnpur");
        check("கன்னியாகுமரி", "knniyakumri");
        check("శ్రీకాకుళం", "srikakulm");
        check("😎 👑 🍎", ":sunglasses: :crown: :apple:");
        check("☆ ♯ ♰ ⚄ ⛌", "* # + 5 X");
        check("№ ℳ ⅋ ⅍", "No M & A/S");
    }

    private static void check(String s, String expected) {
        String actual = AnyAscii.transliterate(s);
        Assertions.assertTrue(AnyAscii.isAscii(actual));
        Assertions.assertEquals(expected, actual);
    }
}
