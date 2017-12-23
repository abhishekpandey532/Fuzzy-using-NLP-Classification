
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class NewJFrame2 extends javax.swing.JFrame 
{
    public NewJFrame2() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EduList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SptList = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OthLIst = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form2");

        jButton1.setLabel("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Classifiy Document");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Education Document ");

        jScrollPane2.setViewportView(EduList);
        EduList.getAccessibleContext().setAccessibleName("");

        jLabel3.setText("Technical Document");

        jScrollPane3.setViewportView(SptList);

        jLabel4.setText("Sports Documents");

        jScrollPane4.setViewportView(OthLIst);

        jLabel5.setName("lbl_Doc"); // NOI18N

        jTextArea1.setColumns(40);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea1);

        jButton3.setText("Clear All List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Document Classification");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jButton4.setText("Training Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(85, 85, 85)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jButton3)))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel5)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Form1 f1 = new Form1();
      this.setVisible(false);
      f1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 public int GetTFTVal()
    {
         double a=0.0;   
         int b=0;
        a = java.lang.Math.random()*10;
        b = (int)a;
        return b;
    }
    DefaultListModel model = new   DefaultListModel();    
    //Method Declared to calc the TF score for all the term and Calc the Len Of Doc.
    public double Calc_TE_SCore(String[] str1 , String[] str2, String[] str3,String DocName)
    {
        /*
        double len=0,Termval=0,TotalVal=0;
        int b=0;
        jTextArea2.append("\n************* "+DocName+" *************\n");
        for(int i=0;i<str1.length;i++)
            {
            for(int j=0;j<str2.length;j++)
            {
                for(int k=0;k<str3.length;k++)
                {
                    if(str1[i].trim().equalsIgnoreCase(str2[j].trim()))
                    {     
                        if(str1[i].trim().equalsIgnoreCase(str3[k].trim()))
                        {
                            Termval=0.3;

                        }
                        else
                        {
                            Termval=0.5;

                        }
                    }
                    else
                    {
                        Termval=1;
                    }
                }
            
            }
              b=GetTFTVal();
              if(b%2==0)
              {
                  Termval=1.0;
                   jTextArea2.append("\n "+str1[i]+" => "+Termval);
              }
              else
              {
                  if(b>5)
                  {
                      Termval=0.3;
                   jTextArea2.append("\n "+str1[i]+" => "+Termval);
                  }
                  else
                  {
                   Termval=0.5;
                   jTextArea2.append("\n "+str1[i]+" => "+Termval);
                  }
              }
        }
              TotalVal += (Termval*Termval);
        
        len = java.lang.Math.sqrt(TotalVal);
        return len;
        */
        return 0;
    }
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int EstrCount=0, SstrCount=0,TstrCount=0;
      double EduLen,SptLen,TechLen;
      String s = jTextArea1.getText();
             
       
      /*
      String Estr[]=
       {
          "Education","process","facilitating","learning","acquisition","knowledge","skills","value","beliefs","habits","methods","educational","storytelling","discussion","teaching","training","research","educators","formal","informal","experience","stages","preschool","kindergarten","primary","school","secondary","college","university","structured","environment","explicit","purpose","students","classrooms","curriculum","country","children","nursery","physical","intellectual","age","compulsary","elementary","republic","adolescence","transition","comprehnsive","minors","higher","adults","system","profession","history","grammar","academies","fee-paying","charitable","foundation","community","degree","population","economies","liberal","arts","technical","vocational","apprenticeshipÂ ","internship","institutions","agriculture","medicine","engineering","architecture","technology","countries","significant","role","people","areas","impoverished","charities","Education","process","facilitating",  "competitive","forms" ,"laptop","child","dedicated","infrastructure","materials","major","corporations","mission","software","available","cost","donation","private","public","funding","schools","objectives","growing","international","policy","affordable","poor","quality","development","organisation","demand","success","equity","literature","schooling","girls","boys",	"social","studies","teacher","activity","pupil","government","parents","perception","facilities","instruction","language","groups","society","socail","status","sustainability","salaries","finanacial","socialization","communication","subjects","textbooks","libraries","internet","determination","resources","books","media","improve",	"change","abundantly","perpetuating","inequalities","exacerbating","Indigenous","model","method","recognition","communities","reclaim","revalue","lenguage","cultures","economic","co-peration", "home","work","interactions","acquistion","time","youth","programs","establishment","practical","requirement","management","natural","recreation",	"open",	"electronic","online","course","tution","large","campus","academic","traditional","universal","minority","goals","economics","sustainable","leadership","ownership",	"improvisation","grade","capacity","achivements","strategies","implementation"        

        }; 
        String Sstr[]=
        {
          "Education", "sports","forms","competitive","physical","activity","games","casual","organized","participation","aim","use","maintain","improve","ability","skills","providing","entertainment","paricipants","spectators","contest","sides","attempting","exceed","other","tie","winner","loser","twosided","contests","tournament","champion",	"leagues","annual","single","contestants","hundreds","simultaneous","competing","individuals","racing","attitude","strives","fair","play","courtesy","teammates","opponents","ethical","behaviour","integrity","grace","victory","defeat","aspiration","ethos","opposing","views","necessity","element","professional","governing","bodies",	"prerequisite","recognition","International","Olympic","Committee","Accord","advocate","widening","definition","Council","Europe","exercise","reduce","impact","losing","school","graded","classified","result","divided","comparable","performance","gender","weight","age","measurement","objective","subjective","corrected","handicaps","penalties","gymnastics","panel","judges","important","success","studio","every","walks","life","outdoor","indoor","athletics","ancient","Greece","principal","part","education","advanced","countries","present","day","regular","feature","college","curriculum","various","kinds","boys","girls","practice","races","jumps","discuss","throw","javelin","pass","afternoon","useful","activities","football","cricket","hockey","volleyball","basketball","badminton","affairs","held","winter","months","high","long","pole","different","foster","spirit","sportsmanship","student","interclass","tournaments","relation","tennis","cycling","disciplined","civilized","nation","importance","spends","large","sum","money","improving","standard","players","athletes","sports","forms","competitive","Technology ", "collection","forms","India","far","satisfactory","Government","steps","educational","institution","arrange","students","schools","playground","encourage","become","good","engineers","doctors","seldom","footballer"
        };
        
        String Tstr[]=
        {
           "Education","Technology ", "collection", "techniques", "skills", "methods", "processes", "production", "goods services ","accomplishment","objectives","scientific","investigation","Technology","knowledge","machines","computers","devices","factories","knowledge","workings","human","conversion","natural","resources","simple","tools"," prehistoric discovery","  Neolithic","Revolution available","sources","food","invention"," wheel ","humans","travel","control","environment.","Developments","historic","times"," printing","press"," telephone","Internet","lessened","physical","barriers"," communication ","allowed","interact","freely","global","scale.","steady","progress"," military","brought weapons ","ever-increasing","destructive","power"," clubs  nuclear","weapons.","advance","deconomies"," leisure","class","technological","unwanted","product pollution",	"deplete","resources,","detriment","influence"," values ","society","ethical","questions.","notion"," efficiency ","terms","term","originally","challenge","traditional","norms","development","ings,","Technology ", "collection", "techniques","sports","forms","competitive","21st","century"," primates ","productivitY","generations","Amerisociologist","Read","Bain","wrote","technology","tools,","utensils,","weapons","instruments","housing","clothing","communicating","transporting","skills Bain","definition","common","scholars","especially","social","scientists.","equally","prominent","applied","science,","among","scientists","self Dictionaries","variety","definitions.","practical","application","particular","area","capability","Ursula","Franklin,","Real","World","lecture","concept","practice","specific","field","technology"
        }; 
        */
       //  String[] docs = new String[]{"Education process facilitating","learning","acquisition","knowledge","skills","value","beliefs","habits","methods","educational","storytelling","discussion","teaching","training","research","educators","formal","informal","experience","stages","preschool","kindergarten","primary","school","secondary","college","university","structured","environment","explicit","purpose","students","classrooms","curriculum","country","children","nursery","physical","intellectual","age","compulsary","elementary","republic","adolescence","transition","comprehnsive","minors","higher","adults","system","profession","history","grammar","academies","fee-paying","charitable","foundation","community","degree","population","economies","liberal","arts","technical","vocational","apprenticeshipÂ ","internship","institutions","agriculture","medicine","engineering","architecture","technology","countries","significant","role","people","areas","impoverished","charities","Education","process","facilitating",  "competitive","forms" ,"laptop","child","dedicated","infrastructure","materials","major","corporations","mission","software","available","cost","donation","private","public","funding","schools","objectives","growing","international","policy","affordable","poor","quality","development","organisation","demand","success","equity","literature","schooling","girls","boys",	"social","studies","teacher","activity","pupil","government","parents","perception","facilities","instruction","language","groups","society","socail","status","sustainability","salaries","finanacial","socialization","communication","subjects","textbooks","libraries","internet","determination","resources","books","media","improve",	"change","abundantly","perpetuating","inequalities","exacerbating","Indigenous","model","method","recognition","communities","reclaim","revalue","lenguage","cultures","economic","co-peration", "home","work","interactions","acquistion","time","youth","programs","establishment","practical","requirement","management","natural","recreation",	"open",	"electronic","online","course","tution","large","campus","academic","traditional","universal","minority","goals","economics","sustainable","leadership","ownership",	"improvisation","grade","capacity","achivements","strategies","implementation", 
         //    "Technology Education people","Technology devices infrastructure software"};
        
         System.out.println("********* Calling Fuzzy now **************");
         String[] docs = new String[]{
            "Education process facilitating learning acquisition knowledge skills value beliefs habits methods educational storytelling discussion teaching training research educators formal informal experience stages preschool kindergarten primary school secondary college university structured environment explicit purpose students classrooms curriculum country children nursery physical intellectual age compulsary elementary republic adolescence transition comprehnsive minors higher adults system profession history grammar academies fee-paying charitable foundation community degree population economies liberal arts technical vocational apprenticeshipÂ  internship institutions agriculture medicine engineering architecture technology countries significant role people areas impoverished charities Education process facilitating competitive forms laptop child dedicated infrastructure materials major corporations mission software available cost donation private public funding schools objectives growing international policy affordable poor quality development organisation demand success equity literature schooling girls boys social studies teacher activity pupil government parents perception facilities instruction language groups society socail status sustainability salaries finanacial socialization communication subjects textbooks libraries internet determination resources books media improve change abundantly perpetuating inequalities exacerbating Indigenous model method recognition communities reclaim revalue lenguage cultures economic co-peration home work interactions acquistion time youth programs establishment practical requirement management natural recreation open electronic online course tution large campus academic traditional universal minority goals economics sustainable leadership ownership improvisation grade capacity achivements strategies implementation", 
            "Education sports forms competitive physical activity games casual organized participation aim use maintain improve ability skills providing entertainment paricipants spectators contest sides attempting exceed other tie winner loser twosided contests tournament champion leagues annual single contestants hundreds simultaneous competing individuals racing attitude strives fair play courtesy teammates opponents ethical behaviour integrity grace victory defeat aspiration ethos opposing views necessity element professional governing bodies prerequisite recognition International Olympic Committee Accord advocate widening definition Council Europe exercise reduce impact losing school graded classified result divided comparable performance gender weight age measurement objective subjective corrected handicaps penalties gymnastics panel judges important success studio every walks life outdoor indoor athletics ancient Greece principal part education advanced countries present day regular feature college curriculum various kinds boys girls practice races jumps discuss throw javelin pass afternoon useful activities football cricket hockey volleyball basketball badminton affairs held winter months high long pole different foster spirit sportsmanship student interclass tournaments relation tennis cycling disciplined civilized nation importance spends large sum money improving standard players athletes sports forms competitive Technology  collection forms India far satisfactory Government steps educational institution arrange students schools playground encourage become good engineers doctors seldom footballer",
            "Education Technology collection techniques skills methods processes production goods services  accomplishment objectives scientific investigation Technology knowledge machines computers devices factories knowledge workings human conversion natural resources simple tools  prehistoric discovery   Neolithic Revolution available sources food invention  wheel  humans travel control environment. Developments historic times  printing press  telephone Internet lessened physical barriers  communication  allowed interact freely global scale. steady progress  military brought weapons  ever-increasing destructive power  clubs  nuclear weapons. advance deconomies  leisure class technological unwanted product pollution deplete resources, detriment influence  values  society ethical questions. notion  efficiency  terms term originally challenge traditional norms development ings, Technology  collection techniques sports forms competitive 21st century  primates  productivitY generations Amerisociologist Read Bain wrote technology tools, utensils, weapons instruments housing clothing communicating transporting skills Bain definition common scholars especially social scientists. equally prominent applied science, among scientists self Dictionaries variety definitions. practical application particular area capability Ursula Franklin, Real World lecture concept practice specific field"};
         
         String udoc=jTextArea1.getText();
         
         
         
          String doc1,doc2,doc3;
         
          Fuzzy fu=new Fuzzy();
         
         
         doc1=fu.Stemmer(docs[0]);
         doc2=fu.Stemmer(docs[1]);
         doc3=fu.Stemmer(docs[2]);
         
         docs[0]=doc1;
         docs[1]=doc2;
         docs[2]=doc3;
         
         for(int i=0;i<3;i++)
         {
             System.out.println(docs[i]);
         }
         
         fu.Fuzz(docs,udoc);
         
         //Call the unknwondocument function here as well
         // Pass the unkowndocument as a field in the function

         
         System.out.println("Cosine value document 1 is: "+fu.cosine1);
         System.out.println("Cosine value document 2 is: "+fu.cosine2);
         System.out.println("Cosine value document 3 is: "+fu.cosine3);
         

            //Fuzzy tf_idf = new Fuzzy();
         
         
         
         
         
         //System.out.println(tf_idf.doc1length);
         
         
        model.addElement(jLabel5.getText());
        /*if(EstrCount==0&&SstrCount==0&&TstrCount==0)
        {
            //System.out.println("This Doc file belogs to any Cagegires");
            JOptionPane.showMessageDialog(null, "Message :- \n This document do not relate to these categories ", "InfoBox: " + "Title :- ", JOptionPane.INFORMATION_MESSAGE);
        }

        else
        {
            if(EstrCount>SstrCount)
            {
                if(EstrCount>TstrCount)
                {
                    //System.out.println("This Doc file belogs to Education Cagegires");
                    EduList.setModel(model);
                }
                else
                {
                    OthLIst.setModel(model);
                    
                }
            }
            else
            {
                if(SstrCount>TstrCount)
                {
                    SptList.setModel(model);
                }
                else
                {
                    OthLIst.setModel(model);
                }
            }
        
        }
        */
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        model.removeAllElements();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         NewJFrame3 f3 = new NewJFrame3();     
        this.setVisible(false);
        f3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                jTextArea1.setText(FileText);    
                new NewJFrame2().setVisible(true);
                
            }
        });
    }

    public static String FileText= null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList EduList;
    private javax.swing.JList OthLIst;
    private javax.swing.JList SptList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
