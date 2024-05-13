import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SliderDemo implements ChangeListener, MouseListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){
    frame = new JFrame("Slider Demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0,100,50);

    slider.setPreferredSize(new Dimension(400,200));

    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);

    slider.setPaintTrack(true);
    slider.setMajorTickSpacing(25);

    slider.setOrientation(SwingConstants.VERTICAL);

    label.setText("°C = " + slider.getValue());


    slider.setPaintLabels(true);
    slider.addChangeListener(this::stateChanged);
    slider.addMouseListener(this);

    slider.setFont(new Font("MV Boli",Font.PLAIN,15));
    label.setFont(new Font("MV Boli",Font.PLAIN,25));

    panel.add(slider);
    panel.add(label);
    frame.add(panel);

    frame.setSize(420,420);
    frame.setVisible(true);

    }


    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2){
            slider.setValue(50);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
