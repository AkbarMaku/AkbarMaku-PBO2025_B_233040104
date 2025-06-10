package pertemuan15.tugas3;

import javax.swing.*;               // Untuk komponen GUI seperti JFrame, JLabel, JButton
import java.awt.*;                  // Untuk layout
import java.awt.event.*;           // Untuk event listener

public class HelloWorldForm3 extends JFrame implements ActionListener { //1
    private JLabel label;   //2
    private JButton button; //2

    //3 Konstruktor
    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello world!");

        button = new JButton("Klik Me!");
        button.addActionListener(this); // Tambah event ke tombol

        setLayout(new GridLayout(2, 1)); // 2 baris, 1 kolom
        add(label);
        add(button);

        setTitle("My First Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tambahkan ini agar bisa close
        setVisible(true);
    }

    // Event saat tombol diklik
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        new HelloWorldForm3(); // Menjalankan form
    }
}
