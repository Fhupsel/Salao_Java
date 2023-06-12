package Java;
///Importando bibliotecas

import java.awt.*;
import java.util.ArrayList;

import javax.swing.BoxLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

///Elementos da tela principal

public class TelaPrincipal extends JFrame {
    public JButton carrinhoButton;
    public JButton adicionarButton;
    public JButton removerButton;
    public JButton adicionarMechasButton;
    public JButton removerMechasButton;
    public JButton adicionarManicureButton;
    public JButton removerManicureButton;
    public JButton adicionarCorteButton;
    public JButton removerCorteButton;
    public JButton adicionarPedicureButton;
    public JButton removerPedicureButton;
    public JButton adicionarProgressivaButton;
    public JButton removerProgressivaButton;
    public JButton finalizarButton;
    public DefaultListModel<String> carrinhoModel;
    public JList<String> carrinhoList;
    public ArrayList<String> itensCarrinho;
    ///Valor incial carrinho
    public Double valor = 0.0;
    public JPanel panel;
    ///Imagem plano de fundo
    JLabel background = new JLabel(new ImageIcon("Imagem/Fundolbl.jpg"));
    


    public TelaPrincipal() {
        setTitle("Tela Principal");
        setSize(700, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        itensCarrinho = new ArrayList<>();

       
        JPanel rightPanel = new JPanel(new GridBagLayout());
        
        GridBagConstraints paineldireito = new GridBagConstraints();
            paineldireito.gridx = 1;
            paineldireito.gridy = 1;
            paineldireito.fill = GridBagConstraints.BOTH;
            paineldireito.weightx = 1.0;
            paineldireito.weighty = 1.0;
            paineldireito.insets = new Insets(5, 5, 5, 5);
            rightPanel.setPreferredSize(new Dimension(150, 540));
        JPanel panel = new JPanel(new GridBagLayout());
        Color cordopanel = new Color(50, 50, 50);
        panel.setBackground(cordopanel);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;
    
        ///Criando o carrinho
        carrinhoModel = new DefaultListModel<>();
        carrinhoList = new JList<>(carrinhoModel);
        JScrollPane scrollPane = new JScrollPane(carrinhoList);
        panel.add(scrollPane);
        rightPanel.add(scrollPane, paineldireito);


        ///Criando botão de adicionar pintura
        adicionarButton = new JButton("Adicionar Pintura");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarButton.addActionListener(e -> adicionarPinturaCapilar());
        panel.add(adicionarButton, constraints);
            ///Imagem
            ImageIcon iconCcolor = new ImageIcon("Imagem/CabeloColorido1.jpg" );
            JLabel imagecolor = new JLabel(iconCcolor);
            constraints.gridx = 1;
            constraints.gridy = 0;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imagecolor, constraints);
            //

        ///Criando botão de remover pintura
        removerButton = new JButton("Remover Pintura");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerButton.addActionListener(e -> removerPinturaCapilar());
        panel.add(removerButton, constraints);

        ////

        ///Criando botão de adicionar corte
        adicionarCorteButton = new JButton("Adicionar Corte");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarCorteButton.addActionListener(e -> adicionarCorte());
        panel.add(adicionarCorteButton, constraints);
            ///Imagem
            ImageIcon iconCcorte = new ImageIcon("Imagem/CabeloCortado1.jpg" );
            JLabel imagecorte = new JLabel(iconCcorte);
            constraints.gridx = 1;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imagecorte, constraints);
            //
        ///Criando botão de remover corte
        removerCorteButton = new JButton("Remover Corte");
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = 1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerCorteButton.addActionListener(e -> removerCorte());
        panel.add(removerCorteButton, constraints);

        ////
        ///Criando botão de adicionar mechas
        adicionarMechasButton = new JButton("Adicionar Mechas");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarMechasButton.addActionListener(e -> adicionarMechas());
        panel.add(adicionarMechasButton, constraints);
            ///Imagem
            ImageIcon iconCmechas = new ImageIcon("Imagem/CabeloMechas1.jpg" );
            JLabel imagemechas = new JLabel(iconCmechas);
            constraints.gridx = 1;
            constraints.gridy = 2;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imagemechas, constraints);
            //
            ///Criando botão de remover mechas
        removerMechasButton = new JButton("Remover Mechas");
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = 2;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerMechasButton.addActionListener(e -> removerMechas());
        panel.add(removerMechasButton, constraints);

        //////
        ///Criando botão de adicionar manicure
        adicionarManicureButton = new JButton("Adicionar Manicure");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarManicureButton.addActionListener(e -> adicionarManicure());
        panel.add(adicionarManicureButton, constraints);
            ///Imagem
            ImageIcon iconManicure = new ImageIcon("Imagem/Manicure1.jpg" );
            JLabel imagemanicure = new JLabel(iconManicure);
            constraints.gridx = 1;
            constraints.gridy = 3;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imagemanicure, constraints);
            //
            ///Criando botão de remover manicure
        removerManicureButton = new JButton("Remover Manicure");
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = 3;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerManicureButton.addActionListener(e -> removerManicure());
        panel.add(removerManicureButton, constraints);

        ////////
        ///Criando botão de adicionar pedicure
        adicionarPedicureButton = new JButton("Adicionar Pedicure");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarPedicureButton.addActionListener(e -> adicionarPedicure());
        panel.add(adicionarPedicureButton, constraints);
            ///Imagem
            ImageIcon iconPedicure = new ImageIcon("Imagem/Pedicure1.jpg" );
            JLabel imagepedicure = new JLabel(iconPedicure);
            constraints.gridx = 1;
            constraints.gridy = 4;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imagepedicure, constraints);
            //
            ///Criando botão de remover pedicure
        removerPedicureButton = new JButton("Remover Pedicure");
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = 4;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerPedicureButton.addActionListener(e -> removerPedicure());
        panel.add(removerPedicureButton, constraints);
        /////

        ///Criando botão de adicionar progressiva
        adicionarProgressivaButton = new JButton("Adicionar Progressiva");
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        adicionarProgressivaButton.addActionListener(e -> adicionarProgressiva());
        panel.add(adicionarProgressivaButton, constraints);
            ///Imagem
            ImageIcon iconProgressiva = new ImageIcon("Imagem/Progressiva1.jpg" );
            JLabel imageProgressiva = new JLabel(iconProgressiva);
            constraints.gridx = 1;
            constraints.gridy = 5   ;
            constraints.gridwidth = 1;
            constraints.weightx = 0;
            panel.add(imageProgressiva, constraints);
            //
            ///Criando botão de remover progressiva
        removerProgressivaButton = new JButton("Remover Progressiva");
        constraints.gridx = GridBagConstraints.RELATIVE;
        constraints.gridy = 5;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 0;
        removerProgressivaButton.addActionListener(e -> removerProgressiva());
        panel.add(removerProgressivaButton, constraints);

        ///Criando botão de finalizar pedido
        finalizarButton = new JButton("Finalizar Pedido");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        finalizarButton.addActionListener(e -> finalizarPedido());
        rightPanel.add(finalizarButton, constraints);


    add(panel, BorderLayout.WEST);
    add(rightPanel);
    
    }

    ///Métodos que serão chamados ao clicar em algum botão

        ///Método para adicionar pintura no carrinho
        private void adicionarPinturaCapilar() {
            String novaPinturaCapilar = "Pintura Capilar";
            carrinhoModel.addElement(novaPinturaCapilar);
            itensCarrinho.add(novaPinturaCapilar);
            ///Incremento de valor no carrinho
            valor+=89.90;
        }
        
        ///Método para remover pintura do carrinho
        private void removerPinturaCapilar() {
        ///Usando um for para procurar no carrinho e remover
         for (String item : itensCarrinho) {
             if(item=="Pintura Capilar"){
                 carrinhoModel.removeElement(item);
                 itensCarrinho.remove(item);
                 ///Decréscimo do valor
                 valor = valor - 89.90;
     
             }
         }
       }///Método para adicionar corte no carrinho
        private void adicionarCorte() {
            String novoCorte = "Corte";
            carrinhoModel.addElement(novoCorte);
            itensCarrinho.add(novoCorte);
            ///Incremento de valor no carrinho
            valor+=49.90;
     }
     
        ///Método para remover corte do carrinho
        private void removerCorte() {
            ///Usando um for para procurar no carrinho e remover
            for (String item : itensCarrinho) {
                if(item=="Corte"){
                    carrinhoModel.removeElement(item);
                    itensCarrinho.remove(item);
                    ///Decréscimo do valor
                    valor = valor - 49.90;
        
                }
            }
        }
        
        ///Método para finalizar pedido
        private void finalizarPedido() {
            String mensagem = "Valor: " + valor + "\n" +"Itens do carrinho:\n";
            for (String item : itensCarrinho) {
                mensagem += item + "\n";
            }
            JOptionPane.showMessageDialog(this, mensagem, "Pedido Finalizado", JOptionPane.INFORMATION_MESSAGE);
            ///Zerando carrinho
            carrinhoModel.removeAllElements();
            itensCarrinho.removeAll(itensCarrinho);
            valor = 0.0;
            
        }

        ///Método para adicionar mechas no carrinho
        private void adicionarMechas() {
            String novaMecha = "Mechas";
            carrinhoModel.addElement(novaMecha);
            itensCarrinho.add(novaMecha);
            ///Incremento de valor no carrinho
            valor+=350.00;
        }
        

        ///Método para remover mechas do carrinho
        private void removerMechas() {
        ///Usando um for para procurar no carrinho e remover
         for (String item : itensCarrinho) {
             if(item=="Mechas"){
                 carrinhoModel.removeElement(item);
                 itensCarrinho.remove(item);
                 ///Decréscimo do valor
                 valor = valor - 350.00;
     
             }
         }
       }

       ///Método para adicionar manicure no carrinho
       private void adicionarManicure() {
        String novaManicure = "Manicure";
        carrinhoModel.addElement(novaManicure);
        itensCarrinho.add(novaManicure);
        ///Incremento de valor no carrinho
        valor+=20.00;
    }
    
        ///Método para remover manicure do carrinho
        private void removerManicure() {
        ///Usando um for para procurar no carrinho e remover
        for (String item : itensCarrinho) {
            if(item=="Manicure"){
                carrinhoModel.removeElement(item);
                itensCarrinho.remove(item);
                ///Decréscimo do valor
                valor = valor - 20.00;
    
            }
        }
    }

        ///Método para adicionar pedicure no carrinho
        private void adicionarPedicure() {
            String novaPedicure = "Pedicure";
            carrinhoModel.addElement(novaPedicure);
            itensCarrinho.add(novaPedicure);
            ///Incremento de valor no carrinho
            valor+=25.00;
        }

        ///Método para remover pedicure do carrinho
        private void removerPedicure() {
        ///Usando um for para procurar no carrinho e remover
        for (String item : itensCarrinho) {
            if(item=="Pedicure"){
                carrinhoModel.removeElement(item);
                itensCarrinho.remove(item);
                ///Decréscimo do valor
                valor = valor - 25.00;

            }
        }
        }

        ///Método para adicionar progressiva no carrinho
        private void adicionarProgressiva() {
            String novaProgressiva = "Progressiva";
            carrinhoModel.addElement(novaProgressiva);
            itensCarrinho.add(novaProgressiva);
            ///Incremento de valor no carrinho
            valor+=200.00;
        }

        ///Método para remover progressiva do carrinho
        private void removerProgressiva() {
        ///Usando um for para procurar no carrinho e remover
        for (String item : itensCarrinho) {
            if(item=="Progressiva"){
                carrinhoModel.removeElement(item);
                itensCarrinho.remove(item);
                ///Decréscimo do valor
                valor = valor - 200.00;

            }
        }
        }  
        
        ///Inicializando
        public static void main(String[] args) {
         TelaPrincipal tela1 = new TelaPrincipal();
         tela1.setVisible(true);
     }

    
}