//JTable:
import java.awt.*;
import javax.swing.*;
public class addTable extends JFrame{
JTable table;
public addTable(){
setLayout(new FlowLayout());
String [] columnNames = {"First name", "Last name", "Header"};
Object [][] data = {{ "Bill", "George", "Male"},
{"Marry", "Anna", "Female"}, {"Rick",
"Bernard", "Male"}};
table = new JTable(data, columnNames);
table.setPreferredScrollableViewportSize(new Dimension(650, 75) );
table.setFillsViewportHeight(true);
JScrollPane scrollPane = new JScrollPane(table);
add(scrollPane);
}
public static void main(String args[]){
addTable t = new addTable();
t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
t.setSize(800, 400);
t.setTitle("My Table");
t.setLocationRelativeTo(null);
t.setVisible(true);
}
}
//JTree:
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample {
JFrame f;
TreeExample(){
f=new JFrame();
DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
style.add(color);
style.add(font);
DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
color.add(red); color.add(blue); color.add(black); color.add(green);JTree jt=new JTree(style);
f.add(jt);
f.setSize(200,200);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new TreeExample();
}}
