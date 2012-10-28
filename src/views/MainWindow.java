/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
import java.awt.*;

import static views.LayoutConstants.*;

/**
 *
 * @author tim
 */
public class MainWindow extends JFrame {

    private FilterPanel navpane;
    private ContentPanel contentpane;

    public MainWindow() {
        super(APP_NAME);
        setLayout(null);
        setBounds(0, 0, MAINWINDOW_WIDTH, MAINWINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(MAINWINDOW_WIDTH, MAINWINDOW_HEIGHT));

        setLayout(new GridBagLayout());

        // Default GridBagConstraints
        GridBagConstraints c = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,new Insets(0, 0, 0, 0), 0, 0);

        navpane = new FilterPanel();
        // Layout configuration for filter panel
        c.gridx = 1;
        c.weightx = 0;
        c.fill = GridBagConstraints.VERTICAL;
        c.ipadx = 200;
        add(navpane, c);

        contentpane = new ContentPanel();
        // Layout configuration for content panel
        c.ipadx = 0;
        c.gridx = 2;
        c.weightx = 1;
        c.fill = GridBagConstraints.BOTH;
        add(contentpane, c);

        setVisible(true);
    }

}
