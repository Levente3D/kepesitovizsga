package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

        int Damage;

        public int getHitPoints() {
                return HitPoints;
        }

        int HitPoints;

        public int getDamage() {
                return Damage;
        }


        public abstract int doDamage();

        public abstract void sufferDamage(int i);
}
