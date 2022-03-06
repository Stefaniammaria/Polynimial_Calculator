import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setVisible(true);
        view.jButton1ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var1, var2;
                var1 = view.getjTextField1().getText(); // aceste stringuri trebuie convertite in polinoame
                var2 = view.getjTextField2().getText();
                Polynomial polinom1 = new Polynomial();
                Polynomial polinom2 = new Polynomial();
                Model m = new Model();
                polinom1 = m.conversieDinStringInPolinom(var1);
                polinom2 = m.conversieDinStringInPolinom(var2);
                Polynomial p3 = polinom1.adunarePolinom(polinom1, polinom2);
                view.getjTextField3().setText(p3 + "");
            }
        });

        view.jButton2ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var1, var2;
                var1 = view.getjTextField1().getText(); // aceste stringuri trebuie convertite in polinoame
                var2 = view.getjTextField2().getText();
                Polynomial polinom1 = new Polynomial();
                Polynomial polinom2 = new Polynomial();
                Model m = new Model();
                polinom1 = m.conversieDinStringInPolinom(var1);
                polinom2 = m.conversieDinStringInPolinom(var2);
                Polynomial p3 = polinom1.scaderePolinoame(polinom1, polinom2);
                view.getjTextField3().setText(p3 + "");
            }
        });

        view.jButton3ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String var1;
                var1 = view.getjTextField1().getText(); // aceste stringuri trebuie convertite in polinoame
                Polynomial polinom1 = new Polynomial();
                Model m = new Model();
                polinom1 = m.conversieDinStringInPolinom(var1);
                Polynomial p3 = polinom1.derivarePolinom(polinom1);
                view.getjTextField3().setText(p3 + "");
            }
        });

        view.jButton4ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        view.jButton5ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        view.jButton6ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton7ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton8ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton9ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton10ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton11ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton12ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton13ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton14ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton15ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton16ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton17ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton18ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton19ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.jButton20ActionPerformed(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
