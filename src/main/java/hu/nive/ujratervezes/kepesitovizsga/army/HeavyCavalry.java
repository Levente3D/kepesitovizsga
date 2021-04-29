package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry {

    int HitPoints = 150;
    int Damage = 20;

    public int doDamage() {

        int j = 0;

        for (int i = 0; i < 100; i++) {
            if (i = 1) {
                int j += Damage * 3;
            } else {
               int j += Damage;
            }
        }
        return j;
    }

    public void sufferDamage(int i) {
    }

    public int getHitPoints() {
    }
}
