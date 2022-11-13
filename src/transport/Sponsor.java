package transport;

import java.util.Objects;
import utility.Utility;

public class Sponsor {

    private String name;
    private int amountOfSupport;

    public Sponsor(String name, int amountOfSupport) {
        this.name = Utility.checkNull(name,"default");
        this.amountOfSupport = Utility.checkInt(amountOfSupport,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Utility.checkNull(name,"default");
    }

    public float getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(int amountOfSupport) {
        this.amountOfSupport = Utility.checkInt(amountOfSupport,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amountOfSupport == sponsor.amountOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }

    public void sponsorTheRace () {
        System.out.printf("Спонсор \"%s\" спонсировал заезд на сумму %d рублей.", name,amountOfSupport);
    }
}