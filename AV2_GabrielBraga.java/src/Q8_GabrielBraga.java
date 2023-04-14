import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JogoAdivinhacao extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    private static final int NUM_TENTATIVAS = 5;
    private static final int NUM_MAXIMO = 20;
    private static final String MSG_ACERTO = "Parabéns, você acertou!";
    private static final String MSG_ERRO = "Infelizmente você errou, tente novamente!";
    
    private JLabel labelDica;
    private JTextField campoTentativa;
    private JButton[] botoesNumeros;
    private int numeroEscolhido;
    private int tentativaAtual;

    public JogoAdivinhacao() {
        super("Jogo da Adivinhação");
        
        Random rand = new Random();
        numeroEscolhido = rand.nextInt(NUM_MAXIMO) + 1;
        tentativaAtual = 1;
        
        labelDica = new JLabel("Escolha um número entre 1 e " + NUM_MAXIMO + " (" + NUM_TENTATIVAS + " tentativas)");
        labelDica.setFont(new Font("Arial", Font.BOLD, 16));
        campoTentativa = new JTextField(2);
        campoTentativa.setFont(new Font("Arial", Font.BOLD, 16));
        campoTentativa.setEditable(false);
        
        JPanel painelDica = new JPanel(new FlowLayout());
        painelDica.add(labelDica);
        JPanel painelCampo = new JPanel(new FlowLayout());
        painelCampo.add(campoTentativa);
        
        JPanel painelBotoes = new JPanel(new GridLayout(4, 5, 5, 5));
        botoesNumeros = new JButton[NUM_MAXIMO];
        for (int i = 0; i < NUM_MAXIMO; i++) {
            JButton botao = new JButton("" + (i+1));
            botao.setFont(new Font("Arial", Font.BOLD, 16));
            botao.addActionListener(this);
            botoesNumeros[i] = botao;
            painelBotoes.add(botao);
        }
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        painelPrincipal.add(painelDica, BorderLayout.NORTH);
        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
        painelPrincipal.add(painelCampo, BorderLayout.SOUTH);
        
        getContentPane().add(painelPrincipal);
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        int tentativa = Integer.parseInt(botao.getText());
        campoTentativa.setText("" + tentativaAtual);
        tentativaAtual++;
        
        if (tentativa == numeroEscolhido) {
            botao.setBackground(Color.GREEN);
            labelDica.setText(MSG_ACERTO);
            for
