import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ScorePanel extends JTextPane {
ArrayList<Integer> list;


    public ScorePanel(){



        list= new ArrayList<>();
        this.setSize(200,300);
        this.setOpaque(false);

        JLabel title = new JLabel("HIGH SCORES");
        title.setForeground(Color.white);
        Font t = new Font("Bangla MN",Font.BOLD,16);
        title.setFont(t);
        title.setBounds(80,0,150,50);
        this.add(title);

        Collections.sort(list);













    }
    public void display(){
        int x=10;int y=50;

        for(int j=0;j<5;j++){

            JLabel order= new JLabel(list.get(j).toString());
            order.setBackground(Color.gray);
            order.setBounds(x,y,180,50);
            this.add(order);
            y=y+50;

        }
    }

    public void setList(int score) {
        list.add(score);
    }

    public Integer getList(int i) {
        return list.get(i);
    }
}
