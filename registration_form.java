import javax.swing.*; import java.awt.*; import java.awt.event.*;
class Frame extends JFrame implements ActionListener{
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton other;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel pr;
    private JRadioButton student;
    private JRadioButton engineer;
    private JRadioButton teacher;
    private JRadioButton other;
    private ButtonGroup prgp;
    private JLabel ad;
    private JTextArea tad;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private String dates[]={
        "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "18", "19",
        "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String month[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String years[] = { "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };
    public Frame(){
        setTitle("Registration form for volenteering");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        c=getContentPane();
        c.setLayout(null);
        
        title=new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
        
        name=new JLabel("Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
        
        tname=new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
        
        mno=new JLabel("Mobile Number:");
        mno=.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(200, 150);
        c.add(mno);
        
        tmno=new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);
        
        gender=new JLabel("Gender:");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
        
        male=new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
        
        female=new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(true);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
        
        others=new JRadioButton("Other");
        others.setFont(new Font("Arial", Font.PLAIN, 15));
        others.setSelected(true);
        others.setSize(85, 20);
        others.setLocation(350, 200);
        c.add(others);
        
        gengp=new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        gengp.add(others);
        
        dob=new JLabel("DOB:");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);
        
        date=new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
        
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 250); 
        c.add(month);
        
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 250); 
        c.add(year); 
        
        ad=new JLabel("Address:");
        ad.setFont(new Font("Arial", Font.PLAIN, 20));
        ad.setSize(100, 20);
        ad.setLocation(100, 300);
        c.add(ad);
        
        tad=new JTextArea();
        tad.setFont(new Font("Arial", Font.PLAIN, 15));
        tad.setSize(200, 75); 
        tad.setLocation(200, 300); 
        tad.setLineWrap(true); 
        c.add(tad);
        
        pr=new JLabel("Profession:");
        pr.setFont(new Font("Arial", Font.PLAIN, 20));
        pr.setSize(100, 20);
        pr.setLocation(100, 350);
        c.add(pr);
        
        student=new JRadioButton("Student");
        student.setFont(new Font("Arial", Font.PLAIN, 15));
        student.setSelected(true);
        student.setSize(75, 20);
        student.setLocation(200, 350);
        c.add(student);
        
        teacher=new JRadioButton("Teacher");
        teacher.setFont(new Font("Arial", Font.PLAIN, 15));
        teacher.setSelected(true);
        teacher.setSize(80, 20);
        teacher.setLocation(275, 350);
        c.add(teacher);
        
        engineer=new JRadioButton("Engineer");
        engineer.setFont(new Font("Arial", Font.PLAIN, 15));
        engineer.setSelected(true);
        engineer.setSize(85, 20);
        engineer.setLocation(350, 350);
        c.add(engineer);
        
        other=new JRadioButton("Other");
        other.setFont(new Font("Arial", Font.PLAIN, 15));
        other.setSelected(true);
        other.setSize(90, 20);
        other.setLocation(425, 350);
        c.add(other);
        
        prgp=new ButtonGroup();
        prgp.add(student);
        prgp.add(teacher);
        prgp.add(engineer);
        prgp.add(other);
        
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 400); 
        c.add(term); 
        
        sub = new JButton("Submit"); 
        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(150, 450); 
        sub.addActionListener(this); 
        c.add(sub); 
        
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(270, 450); 
        reset.addActionListener(this); 
        c.add(reset); 
        
        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
        
        res = new JLabel(""); 
        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
        res.setSize(500, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
        
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sub){
            if(term.isSelected()){
                String data1;
                
                String data="Name: "
                +tname.getText()+"\n"
                +"Mobile Number: "
                +tmno.getText()+"\n";
                
                if(male.isSelected())
                data1="Gender: Male"+"\n";
                else if(female.isSelected())
                data1="Gender: Female"+"\n";
                else
                data1="Gender: Other"+"\n";
                
                String data2="DOB: "+(String)date.getSelectedItem()+"/"+(String)date.getSelectedItem()+"/"+(String)date.getSelectedItem()+"\n";
                
                String data3="Address: "+tad.getText();
                
                String data4;
                if(student.isSelected())
                data4="Profession: Student"+"\n";
                else if(engineer.isSelected())
                data4="Profession: Engineer"+"\n";
                else
                data4="Profession: Other"+"\n";
                
                
                tout=setText(data+data1+data2+data3+data4);
                tout=setEditable(false);
                res.setText("Registration Successfully..");
            }
            else{
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"+" terms and conditions..");
            }
        }
        else if(e.getSource()==reset){
            String def="";
            tname.setText(def);
            tad.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def);
        }
    }
}
class reg_form{
    public static void main(String[] args)throws Exception{
        Frame fr=new Frame();
        
    }
}