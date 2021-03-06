import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


// SAX Package.
import org.xml.sax.*;
import org.xml.sax.helpers.*;
 
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.sax.*;

//NLP Packages
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.process.TokenizerFactory;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.process.PTBTokenizer;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.util.Collection;
import java.util.List;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Form1 extends javax.swing.JFrame
{
    public Form1() 
    {
        initComponents();
    }
      /*External code to parse into xml*/
      BufferedReader in;
      StreamResult out;
 
      TransformerHandler th;
      AttributesImpl atts;

      String XmlFileName;
      String TxtFileName;
   
      String f2[]=new String[30];
      
      int i;
      int snlen=0;
      String frame2text="";
 
public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Document Classifire");

        jLabel1.setText("Path");

        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(40);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel2.setText("Sentence Level Processing");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Your First Line is here");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("Sentence Extraction");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Draw Syntax Tree");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Feature Vector");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Next Page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Reduce FV");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String filetext=null;
    String FName=null;
           
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        FName = f.getName();
        jTextField1.setText(filename);
        try
        {
            FileReader reader = new FileReader(filename);
           BufferedReader br = new BufferedReader(reader);
           jTextArea1.read(br,null);
           //doit(filename);
           br.close();
           jTextArea1.requestFocus();
                      
           filetext=jTextArea1.getText();
           // ExtStr(filetext);
            //M_tagger();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void M_tagger()
    {        
           jTextArea1.append("\n \n***************** Tagger Info *****************\n \n");
            //int j=0;
            sn=new String[s.length];
            for(i=0; i<s.length; i++)
            {
            //tagged[i] = tagger.tagString(s[i]);
                if((s[i].contains("_NN") || s[i].contains("_VB"))&& !s[i].contains("http") && !s[i].contains("pic."))
                {
                    //snew[j]=s[i];
                    System.out.println(s[i]); 
                    jTextArea1.append(s[i]+"\n");
                    sn[snlen]=s[i].toLowerCase();
                    snlen++;
                }
            }
            
        JOptionPane.showMessageDialog(null, "Message :- \n Now u can check your tagger ", "InfoBox: " + "Title :- ", JOptionPane.INFORMATION_MESSAGE);
    }
     String s[];
     String[] sn;
    public  void ExtStr(String filetext)
    {
        
           MaxentTagger tagger =  new MaxentTagger("english-left3words-distsim.tagger");
           filetext=tagger.tagString(filetext);
           s = filetext.split(" ");
           //sn=new String[s.length];
           
    }
    public void F_vector()
    {
        int i=0,jp=0;
        String[] fv=new String[3];
        
        
        TreeMap<Integer,String> sortnlp=new TreeMap<Integer,String>();  

        
        jTextArea1.append("\n ***************** Feature Vector ***************** \n ");
        System.out.println("************** Feature Vector ***********");
        System.out.println("Value of snlen: "+snlen);
        for(int q=0;q<snlen;q++)
        {
            System.out.println(sn[q]);
            //fv=sn[q].split("_");
            //hm.put(fv[0],new Integer(fv[2]));
            jTextArea1.append("\n"+sn[q]);
            
        }
        
        //find frequency of the words stored in "sn" array
        HashMap<String, Integer> nlpcount = new HashMap<>();
        int nextIdx = 0;
        int count=0;
            for (String word : sn) {
                if(count<snlen){
                Integer f = nlpcount.get(word);
                if (f == null) {
                    nlpcount.put(word, 1); 
                } else { 
                    nlpcount.put(word, f+1);
                } 
                count++;
                }
            }
            System.out.println("*************** NLP Count Vector*************");
        for(String word : nlpcount.keySet()) {
             System.out.println("Word: "+word+" Frequency: "+nlpcount.get(word));
         }
        
        /* for(String word : nlpcount.keySet()) {
            sortnlp.put(nlpcount.get(word),word); 
            //System.out.println("Word: "+word+" Frequency: "+nlpcount.get(word));
         }*/
      
         /*System.out.println("************ Treemap is ****************");
        for(Map.Entry m:sortnlp.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
        }  */
         Map<String, Integer> sortedmap = sortByValues(nlpcount);
         
         HashMap<String, Integer> finalmap = new HashMap<>();
         
          int cnt=0;
          int len=sortedmap.size();
          int index=0;
          String[] reduced=new String[30];
          
          System.out.println("After Sorting:");
          Set set2 = sortedmap.entrySet();
            Iterator iterator2 = set2.iterator();
            while(iterator2.hasNext()) {
                 Map.Entry me2 = (Map.Entry)iterator2.next();
                 System.out.print(me2.getKey() + ": ");
                 System.out.println(me2.getValue());
              //   finalmap.put(new String((String) me2.getKey()), new Integer((int) me2.getValue()));
            /*  cnt++;
              if(cnt>=(len-30)){
                reduced[index]=(String)me2.getKey();
                index++;
              }
            */
            }
            System.out.println("************ Final Reduced Vecotr **************\n");
            String[] finalstr=new String[30];
            int r=0;
            String key;
            
            List<String> content = new ArrayList<String>();
            
            ArrayList keyList = new ArrayList(sortedmap.keySet());
            for (i = keyList.size() - 1; i >= 0; i--) {
		//get key
		key = (String)keyList.get(i);
		//System.out.println("Key :: " + key);
		content.add(key);
                //finalstr[r]=key;
                //r++;
                
                //get value corresponding to key
		//int value = sortedmap.get(key);
            }
            
            String[] filter=new String[2];
            for(String wrd:content)
            {
                if(r==30)
                    break;
                filter=wrd.split("_");
                finalstr[r]=filter[0];
                r++;
                //System.out.println("\t"+wrd);
                
            }
            System.out.println("\n***************** Final String is ***************");
            for(i=0;i<30;i++) {
                if(finalstr[i].length()>0 && finalstr[i]!=null){
                frame2text+=finalstr[i]+" ";
                f2[i]=finalstr[i];
                System.out.println(finalstr[i]);
            }
            }

            
            
        
            
        
        
        //for(Map.Entry m:hm.entrySet()){  
        //    System.out.println(m.getKey()+" "+m.getValue()); 
        //}
        /* for(int j=0; j<sn.length-1;j++)
        {
            i=0;
            for(int k=0; k<sn.length-1;k++)
            {
                //if(s[j]==s[k])
                if(sn[j].equalsIgnoreCase(sn[k]))
                {i++;}
                if(k==(sn.length-2))
                {
                   sn[jp]=sn[j]+"_"+i;
                   jp++;
                   jTextArea1.append("\n"+sn[jp]+"_"+i);      
                }
            }
        }
        */
        
        
        JOptionPane.showMessageDialog(null, "Message :- \n Now u can check your Feature Vector ", "InfoBox: " + "Title :- ", JOptionPane.INFORMATION_MESSAGE);
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("");
        jTextField2.setText(filetext.substring(0, filetext.indexOf(".")));
        String TextFiedlText = jTextField2.getText();
        jTextArea1.append("\n***************** Sentence Level *****************");
        jTextArea1.append("\t \n"+TextFiedlText+"\n  \n ");
        ExtStr(jTextField2.getText());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        
        F_vector();
    
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
       System.out.println("\n **************** Reduced Feature Vector *****************");
       System.out.println(frame2text);
       jTextArea1.append("\n ************* Reduced Feature Vector ***************");
       jTextArea1.append("\n\n"+frame2text+"\n\n");
    }
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        NewJFrame2 f2 = new NewJFrame2();
       NewJFrame2.jLabel5.setText(FName);
       filetext=jTextArea1.getText();
        NewJFrame2.jTextArea1.setText(frame2text);
        this.setVisible(false);
        f2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         MaxentTagger tagger =  new MaxentTagger("english-left3words-distsim.tagger");
         System.out.println("************ FileText ********** \n "+filetext);  
         
         PorterCheck pc=new PorterCheck();
         ArrayList<String> tok = new ArrayList<String>();
         ArrayList<String> tokadd = new ArrayList<String>();
         
         String[] stopwords={"a", "about", "above", "above", "across", "after", "afterwards", "again", "against", "all", "almost", "alone", "along", "already", "also","although","always","am","among", "amongst", "amoungst", "amount",  "an", "and", "another", "any","anyhow","anyone","anything","anyway", "anywhere", "are", "around", "as",  "at", "back","be","became", "because","become","becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides", "between", "beyond", "bill", "both", "bottom","but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt", "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven","else", "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few", "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from", "front", "full", "further", "get", "give", "go", "had", "has", "hasnt", "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many", "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must", "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none", "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto", "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own","part", "per", "perhaps", "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she", "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something", "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their", "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon", "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru", "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "un", "under", "until", "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet", "you", "your", "yours", "yourself", "yourselves", "the"};
         
         for (String x: filetext.split(" ")){
            x.toLowerCase();
            if(!Arrays.asList(stopwords).contains(x)){
            tok.add(x);
            }
         } 
         System.out.println("**************** Complete Stem************** \n"+pc.completeStem(tok));
         tokadd=pc.completeStem(tok);
        filetext="";
        for(String w:tokadd){
            filetext+=w+" ";
        }
         filetext=filetext.toLowerCase();
         System.out.println("\n\n************ Before Tagging FileText Edited ********** \n "+filetext);  
         
         
         filetext=tagger.tagString(filetext);
         System.out.println("\n\n************ FileText Edited ********** \n "+filetext);  
         
         s = filetext.split(" ");
           
           M_tagger();
    }//GEN-LAST:event_jButton3ActionPerformed

      
    private static HashMap sortByValues(HashMap map) { 
       List list = new LinkedList(map.entrySet());
       // Defined Custom Comparator here
       Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o1)).getValue())
                  .compareTo(((Map.Entry) (o2)).getValue());
            }
       });

       // Here I am copying the sorted list in HashMap
       // using LinkedHashMap to preserve the insertion order
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

