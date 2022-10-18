//import java.util.*;

public class Produkt {
    public Produkt(float _basispreis, int _tage) {
        if (_basispreis % 0.05 != 0)
            _basispreis -= _basispreis % 0.05;
        this.basispreis = _basispreis;
        this.tage = _tage;
    }

    public float getBasispreis() {
        return basispreis;
    }

    public int getTage() {
        return tage;
    }

    private float basispreis;
    private final int tage;


    public void addRabatt() {
        if (this.tage > 10 && this.tage < 20) {
            this.basispreis += this.basispreis * 0.9;
        } else {
            this.basispreis += this.basispreis * 0.8;
        }
    }

}

