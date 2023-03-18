public class Match {
    Fighter f1;
    Fighter f2;
    int MaxWeight;
    int MinWeight;

    Match(int maxWeight, int minWeight, Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.MaxWeight = maxWeight;
        this.MinWeight = minWeight;
    }

    void Fight() {

        if (WhoIsFirst()){
            this.f1=f1;
            this.f2=f2;

        }else {
            this.f1=f2;
            this.f2=f1;
        }
        if (isAccurate()) {
            while (this.f1.health > 0 && this.f2.health > 0) {

                System.out.println("****** YENİ ROUND ******");
                System.out.println("                         ");
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println("Mehmet'in Canı: "+this.f1.health);
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                System.out.println("Hüseyin'in Canı: "+this.f2.health);
            }
        } else {
            System.out.println("Sporcuların Sikletleri Uyuşmuyor!");
        }
    }

    boolean isAccurate() {
        return ((this.f1.weight >= MinWeight && this.f1.weight <= MaxWeight) && (this.f2.weight >= MinWeight && this.f2.weight <= MaxWeight));
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("                ");
            System.out.println(f2.Name + " Kazandı! ");
            return true;
        }

        if (f2.health == 0) {
            System.out.println("                  ");
            System.out.println(f1.Name + " Kazandı! ");
            return true;

        }
        return false;

    }

    boolean WhoIsFirst(){
        double randomNumber1 = Math.random() * 100;
        return randomNumber1 <= 50;

    }
}
