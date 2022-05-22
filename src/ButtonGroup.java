import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGroup extends Button {



    public ButtonGroup(){
       super();
        JMenuBar x = new JMenuBar();
        x.setSize(200,70);
        x.setBorderPainted(false);

        JMenu l1 = new JMenu("Game start");

        l1.setSize(200,70);
        l1.setBorderPainted(false);
        l1.setContentAreaFilled(false);

        x.add(l1, BorderLayout.CENTER);


        //JMenu l2= new JMenu("l2");
        JMenuItem level1 = new JMenuItem("level 1");
        JMenuItem level2 = new JMenuItem("level 2");
        JMenuItem level3 = new JMenuItem("level 3");
        l1.add(level1);
        l1.add(level2);
        l1.add(level3);
        level1.addActionListener((e)->Tertris.setTime(1000));
        level2.addActionListener((e)->Tertris.setTime(500));
        level3.addActionListener((e)->Tertris.setTime(200));



        this.add(x,BorderLayout.CENTER);

        level1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You have clicked the paste！");
            }
        });








    }

}
