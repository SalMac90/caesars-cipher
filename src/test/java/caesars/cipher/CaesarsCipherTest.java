package caesars.cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {
    CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffsetOf12(){


        assertEquals("nai mdq kag pauzs fapmk",caesarsCipher.cipher("How are you doing today", 12));
    }

    @Test
    void cipher() {
        //GIVEN
        CaesarsCipher caesarsCipher = new CaesarsCipher();

        //WHEN
        caesarsCipher.cipher("How are you doing today", 12);

        //THEN
        assertEquals("nai mdq kag pauzs fapmk", caesarsCipher.cipher("How are you doing today", 12));
    }

    @Test
    void testEmptyString () {
        //GIVEN
        CaesarsCipher caesarsCipher = new CaesarsCipher();
        //WHEN
        caesarsCipher.cipher("",12);
        //THEN
        assertEquals("", caesarsCipher.cipher("",12));
    }

}