package pertemuan15.tugas4;

import javax.swing.*;       // Untuk komponen GUI
import java.awt.*;          // Untuk layout
import java.awt.event.*;    // Untuk event listener

public class PenjumlahanForm extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JButton btnJumlah;

    public PenjumlahanForm() {
        // Inisialisasi komponen
        textField1 = new JTextField();
        textField2 = new JTextField();
        btnJumlah = new JButton("Jumlah");

        // Tambahkan event listener ke tombol
        btnJumlah.addActionListener(this);

        // Atur layout dan tambahkan komponen
        setLayout(new GridLayout(3, 1));
        add(textField1);
        add(textField2);
        add(btnJumlah);

        // Atur properti form
        setTitle("Penjumlahan");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Event saat tombol diklik
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int nilai1 = Integer.parseInt(textField1.getText());
            int nilai2 = Integer.parseInt(textField2.getText());
            int hasil = nilai1 + nilai2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid! Masukkan angka saja.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new PenjumlahanForm();
    }
}
