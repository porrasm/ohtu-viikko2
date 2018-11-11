package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface KirjanpitoObject {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
