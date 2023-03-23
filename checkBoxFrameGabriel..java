// Figura 14.17: CheckBoxFrame.java
// Criando botões JCheckBox.
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class checkBoxFrameMurilo extends JFrame
{    
   private JTextField textField; // exibe o texto na alteração de fontes
   private JCheckBox boldJCheckBox; // para selecionar/remover estilo negrito
   private JCheckBox italicJCheckBox; // para selecionar/remover itálico
   
   // contrutor CheckBoxFrame adiciona JCheckBoxes ao Jframe
   public checkBoxFrameMurilo()
   {
       super( "JCheckBox Test" );
       setLayout( new FlowLayout() ); // confira o layout de frame
       
       // Configura JTextField e sua fonte
       textField = new JTextField( "Watch the font style change", 20 );
       texField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
       add( textField ); // adiciona textField ao JFrame
       
       boldJCheckBox = new JCheckBox( "Bold" ); // cria caixa de seleção para negrito
       italicJCheckBox = new JCheckBox( "Italic" ); // cria itálico
       add( boldJCheckBox ); // adiciona caixa de seleção de estilo negrito ao JFrame
       add( italicJCheckBox ); // adiciona caixa de seleção de itálico ao JFrame
       
       // listeners registradores para JCheckBoxes
       CheckBoxHandler handler = new CheckBoxHandler();
       boldJCheckBox.addItemListener((ItemListener) handler);
       italicJCheckBox.addItemListener((ItemListener) handler);
   } // fim do construtor CheckBoxFrame
   
   //classe inte3rna private para tratamento de evento ItemListener
   private class CheckBoxFrameMurilo implements ItemListener
   {
       // responde aos eventos de caixa de seleção
       public void itemStateChanged( ItemEvent event ) {
           {
               Font nu11 = null;
               Font font = nu11; // armazena a nova Font
               
               if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
                   font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
               else if (boldJCheckBox.isSelected() )
                   font = new Font( "Serif", Font.BOLD, 14 );
               else if (italicJCheckBox.isSelected() )
                   font = new Font("Serif", Font.ITALIC, 14 );
               else
                   font = new Font( "Serif", Font.PLAIN, 14 );
               
               textField.setFont(font);
           }
       }    
   }
}