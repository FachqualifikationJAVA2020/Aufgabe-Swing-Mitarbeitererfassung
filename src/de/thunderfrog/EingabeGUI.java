package de.thunderfrog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EingabeGUI extends JFrame implements ActionListener {

    private JFrame frame;
    private JTextField vorname;
    private JTextField nachname;
    private JTextField gehalt;
    private JTextField persoNummer;
    private JButton eintragen;
    private JLabel anzahlMitarbeiter;

    public EingabeGUI(){
        frame = new JFrame();
        frame.setTitle("Mitarbeiter Verwaltung");
        frame.setSize(450,300);

        GridLayout layout = new GridLayout(6,5);
        layout.setHgap(5);
        layout.setVgap(5);
        frame.setLayout(layout);

        JLabel title = new JLabel();
        title.setText(frame.getTitle());
        title.setFont(new Font("Comic Sans MS",Font.BOLD,18));
        frame.add(title);
        frame.add(new JLabel(""));

        frame.add(new JLabel("Vorname: "));
        vorname = new JTextField();
        frame.add(vorname);

        frame.add(new JLabel("Nachname: "));
        nachname = new JTextField();
        frame.add(nachname);

        frame.add(new JLabel("Gehalt: "));
        gehalt = new JTextField();
        frame.add(gehalt);

        frame.add(new JLabel("Personalnummer: "));
        persoNummer = new JTextField();
        frame.add(persoNummer);

        anzahlMitarbeiter = new JLabel();
        anzahlMitarbeiter.setText("Anzahl der Mitarbeiter: 0");
        frame.add(anzahlMitarbeiter);
        eintragen = new JButton("Eintragen");
        frame.add(eintragen);

        eintragen.addActionListener(this);

        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
	    new EingabeGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!vorname.getText().equals("") || !nachname.getText().equals("") || !gehalt.getText().equals("") || !persoNummer.getText().equals("")){

            //  Eine Zeile Lösung:
            //  Mitarbeiter newMa = new Mitarbeiter(vorname.getText(),nachname.getText(),Double.parseDouble(gehalt.getText()),Integer.parseInt(persoNummer.getText()));

            Mitarbeiter newMa = new Mitarbeiter();
            newMa.setVorname(vorname.getText());
            newMa.setNachname(nachname.getText());
            newMa.setGehalt(Double.parseDouble(gehalt.getText()));
            newMa.setPersonalnummer(Integer.parseInt(persoNummer.getText()));

            anzahlMitarbeiter.setText("Anzahl der Mitarbeiter: " + Mitarbeiter.getPersoAnzahl());

            vorname.setText("");
            nachname.setText("");
            gehalt.setText("");
            persoNummer.setText("");
        }
    }
}
