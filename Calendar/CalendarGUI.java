package Calendar;

import javax.swing.*;
import java.awt.*;

/**
 * Created by BlazhkoS on 15.06.2016.
 */
public class CalendarGUI extends JFrame {

    private void createGUI() {
        JFrame frame = new JFrame("InterlinkTaskCalendar");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] columnName = CalendarLogic.columnName;
        Integer[][] data = CalendarLogic.arr;

        JTable table = new JTable(data, columnName);
        table.getCellRenderer(5, 5);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(400, 150));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        createGUI();
    }
}
