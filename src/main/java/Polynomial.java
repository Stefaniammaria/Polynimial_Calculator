import java.util.ArrayList;
import java.util.List;

public class Polynomial {

    List<Monomial> polinom = new ArrayList<Monomial>();

    public Polynomial() {
    }

    public Polynomial(List<Monomial> polinom) {
        this.polinom = polinom;
    }

    public List<Monomial> getPolinom() {
        return polinom;
    }

    public void setPolinom(List<Monomial> polinom) {
        this.polinom = polinom;
    }

    public void add(Monomial m){
        polinom.add(m);
    }

    public Polynomial adunarePolinom(Polynomial polinom1, Polynomial polinom2) {
        int p1 = 0, p2 = 0;
        for (Monomial x : polinom1.getPolinom()) {
            if (p1 > x.getPutere()) {
                p1 = x.getPutere();
            }
        }

        for (Monomial x : polinom2.getPolinom()) {
            if (p2 > x.getPutere()) {
                p2 = x.getPutere();
            }
        }

        if (p1 > p2) {
            for (Monomial x : polinom1.getPolinom()) {
                for (Monomial y : polinom2.getPolinom()) {
                    if (x.getPutere() == y.getPutere()) {
                        x.setCoeficient(x.getCoeficient() + y.getCoeficient());
                    }
                }
            }
            Polynomial p3 = new Polynomial(polinom1.getPolinom());
            return p3;

        } else {
            for (Monomial x : polinom2.getPolinom()) {
                for (Monomial y : polinom1.getPolinom()) {
                    if (x.getPutere() == y.getPutere()) {
                        x.setCoeficient(x.getCoeficient() + y.getCoeficient());
                    }
                }
            }
            Polynomial p3 = new Polynomial(polinom2.getPolinom());
            return p3;

        }

    }

    public Polynomial scaderePolinoame(Polynomial polinom1, Polynomial polinom2) {
        int p1 = 0, p2 = 0;
        for (Monomial x : polinom1.getPolinom()) {
            if (p1 > x.getPutere()) {
                p1 = x.getPutere();
            }
        }

        for (Monomial x : polinom2.getPolinom()) {
            if (p2 > x.getPutere()) {
                p2 = x.getPutere();
            }
        }

        if (p1 > p2) {
            for (Monomial x : polinom1.getPolinom()) {
                for (Monomial y : polinom2.getPolinom()) {
                    if (x.getPutere() == y.getPutere()) {
                        x.setCoeficient(x.getCoeficient() - y.getCoeficient());
                    }
                }
            }
            for (Monomial x: polinom1.getPolinom()) {
                x.setCoeficient(-1*x.getCoeficient());
            }
            Polynomial p3 = new Polynomial(polinom1.getPolinom());
            return p3;

        } else {
            for (Monomial x : polinom2.getPolinom()) {
                for (Monomial y : polinom1.getPolinom()) {
                    if (x.getPutere() == y.getPutere()) {
                        x.setCoeficient(x.getCoeficient() - y.getCoeficient());
                    }
                }
            }
            for (Monomial x: polinom2.getPolinom()) {
                x.setCoeficient(-1*x.getCoeficient());
            }
            Polynomial p3 = new Polynomial(polinom2.getPolinom());
            return p3;
        }
    }

    public Polynomial derivarePolinom(Polynomial polinom1) {
        for (Monomial x : polinom1.getPolinom()) {
            x.setCoeficient(x.getCoeficient() * x.getPutere());
            x.setPutere(x.getPutere() - 1);
        }
        Polynomial p3 = new Polynomial(polinom1.getPolinom());
        return p3;
    }

    @Override
    public String toString() {
        return polinom + "";
    }
}
