package me.leminhbao;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import me.leminhbao.view.Application;

public class Main {

    public static void main(String[] args) {
        /* Set the FlatLaf look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        // If FlatLaf look and feel is not available, stay with the default look and feel.
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("Button.arc", 10);
            UIManager.put("Component.arc", 10);
            UIManager.put("CheckBox.arc", 10);
            UIManager.put("ProgressBar.arc", 10);
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Component.arrowType", "chevron");
            UIManager.put("TabbedPane.showTabSeparators", true);
            UIManager.put("TabbedPane.selectedBackground", Color.white);
            UIManager.put("flatlaf.menuBarEmbedded", true);
            UIManager.put("TitlePane.titleMargins", new Insets(0, 0, 0, 0));
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Application app = Application.getInstance();

                app.setVisible(true);
            }
        });
    }
}
