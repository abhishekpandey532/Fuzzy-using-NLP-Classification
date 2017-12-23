
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Fuzzy {

    int numOfWords;
    double[] idfVector;
    double[][] tfIdfMatrix;
    double[][] tfMatrix;
    String[] wordVector;
    int docLength[];
    double udocmatrix[];
    double doc1length,doc2length,doc3length,udoclength;
    
    //String undoc="Education is the process of facilitating learning, or the acquisition of Technology and skills Education";
     
    
    double cosine1,cosine2,cosine3;
           
        

    public void Fuzz(String[] docs,String undoc) {
        
        // STEP 1, scan all words and count the number of different words
        // mapWordToIdx maps word to its vector index
        
       HashMap<String, Integer> mapWordToIdx = new HashMap<>();
        int nextIdx = 0;
        for (String doc : docs) {
            for (String word : doc.split(" ")) {
                if (!mapWordToIdx.containsKey(word)) {
                    mapWordToIdx.put(word, nextIdx);
                    nextIdx++;
                }
            }
        }

        numOfWords = mapWordToIdx.size();

        // STEP 2, create word vector where wordVector[i] is the actual word
        int qw=0;
        wordVector = new String[numOfWords];
        for (String word : mapWordToIdx.keySet()) {
            int wordIdx = mapWordToIdx.get(word);
            //System.out.println(" wordIdx: "+wordIdx);
            wordVector[wordIdx] = word;
        }
        
        //Stemming and Converting here.
        /*
        ArrayList<String> tok = new ArrayList<String>();
        ArrayList<String> tokadd = new ArrayList<String>();
         
         String[] stopwords={"a", "about", "above", "above", "across", "after", "afterwards", "again", "against", "all", "almost", "alone", "along", "already", "also","although","always","am","among", "amongst", "amoungst", "amount",  "an", "and", "another", "any","anyhow","anyone","anything","anyway", "anywhere", "are", "around", "as",  "at", "back","be","became", "because","become","becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides", "between", "beyond", "bill", "both", "bottom","but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt", "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven","else", "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few", "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from", "front", "full", "further", "get", "give", "go", "had", "has", "hasnt", "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many", "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must", "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none", "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto", "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own","part", "per", "perhaps", "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she", "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something", "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their", "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon", "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru", "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "un", "under", "until", "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet", "you", "your", "yours", "yourself", "yourselves", "the"};
         
        for (String x: wordVector){
            x.toLowerCase();
            if(!Arrays.asList(stopwords).contains(x)){
                if(x.length()>0)
                    tok.add(x);
            }
        } 
        
        for(String w:tok){
            System.out.println("WWWWord :"+w);
        }
        
        PorterCheck pc=new PorterCheck();
         System.out.println("**************** Complete Stem************** \n"+pc.completeStem(tok));
         tokadd=pc.completeStem(tok);
         
         int le=wordVector.length;
         int b=0;
         for(String word:tokadd){
             wordVector[b]=word;
             b++;
         }
         numOfWords=wordVector.length;
         System.out.println("\n Num of words after change: "+numOfWords);
        
       */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     //   for(String word:wordVector)
       // System.out.println("Wordvector is:  "+word);
        
        
        // STEP 3, create doc word vector where docCountVector[i] is number of
        // docs containing word of index i
        // and doc length vector
        int[] docCountVector = new int[numOfWords];
        docLength = new int[docs.length];
        // lastDocWordVector is auxilary vector keeping track of last doc index
        // containing the word
        int[] lastDocWordVector = new int[numOfWords];
        for (int wordIdx = 0; wordIdx < numOfWords; wordIdx++) {
            lastDocWordVector[wordIdx] = -1;
        }
        for (int docIdx = 0; docIdx < docs.length; docIdx++) {
            String doc = docs[docIdx];
            String[] words = doc.split(" ");
            for (String word : words) {
                docLength[docIdx] = words.length;
                int wordIdx = mapWordToIdx.get(word);
                if (lastDocWordVector[wordIdx] < docIdx) {
                    lastDocWordVector[wordIdx] = docIdx;
                    docCountVector[wordIdx]++;
                }
            }
        }
        
        for(int i=0;i<numOfWords;i++){
            System.out.println("Word:"+wordVector[i]+"comes in :"+docCountVector[i]+" documents");
        }
        
        
        
        
        
        
        
        
        
        for(int i=0;i<numOfWords;i++){
            //System.out.println("Word:\" "+wordVector[i]+"\" comes in :"+docCountVector[i]+" documents");
        }
        
        System.out.println();
        // STEP 4, compute IDF vector based on docCountVector
        idfVector = new double[numOfWords];
        for (int wordIdx = 0; wordIdx < numOfWords; wordIdx++) {
            idfVector[wordIdx] = Math.log10(1 + (double) docs.length / (docCountVector[wordIdx]));
        }
        
        System.out.println(" ************ IDF Matrix ***************");
        for (int wordIdx = 0; wordIdx < numOfWords; wordIdx++) {
            //idfVector[wordIdx] = Math.log10(1 + (double) docs.length / (docCountVector[wordIdx]));
            System.out.println("WordIDx : "+wordIdx+" Word: "+wordVector[wordIdx]+" IDF-Val: "+idfVector[wordIdx]);
        }
        

        // STEP 5, compute term frequency matrix, tfMatrix[docIdx][wordIdx]
        tfMatrix = new double[docs.length][];
        for (int docIdx = 0; docIdx < docs.length; docIdx++) {
            tfMatrix[docIdx] = new double[numOfWords];
        }
        for (int docIdx = 0; docIdx < docs.length; docIdx++) {
            String doc = docs[docIdx];
            for (String word : doc.split(" ")) {
                int wordIdx = mapWordToIdx.get(word);
                tfMatrix[docIdx][wordIdx] = tfMatrix[docIdx][wordIdx] + 1;
            }
        }
        System.out.println("*************TF_Matrix************");
        
        for (String s : wordVector) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (int docIdx = 0; docIdx < docs.length; docIdx++) {
            for (int wordIdx = 0; wordIdx < numOfWords; wordIdx++) {
                System.out.print(tfMatrix[docIdx][wordIdx]+"\t");
            }
            System.out.println();
        }
        
        TestTipper tt=new TestTipper();
        
        System.out.println("****************************");
        int i;
        double sum=0.0;
        int currentword=0;
        for(int j=0;j<numOfWords;j++){
            sum=0.0;
            for(i=0;i<3; i++){
                //System.out.println(tfMatrix[i][j]);
                sum+=tfMatrix[i][j];
            }
            //System.out.println("Sum of column is:"+sum);
            if(sum==1.0)  {
                int k,l;
                k=i;
                l=j;
                for(int q=0;q<3;q++){
                    if(tfMatrix[q][l]==1){
                        tfMatrix[q][l]*=idfVector[currentword];
                    }
                }
            }   
            else if(sum==2) {
               // System.out.println("i:"+i+"  j:"+j);
                int k,l;
                k=i;
                l=j;
                
                for(int q=0;q<3;q++){
                    if(tfMatrix[q][l]==2){
                        tfMatrix[q][l]=1*idfVector[currentword];
                        break;
                    }
                    if(tfMatrix[q][l]==1)
                        tfMatrix[q][l]=0.5*idfVector[currentword];
                }
                //break;
            }
            else if(sum==3) {
                //System.out.println("i:"+i+"  j:"+j);
                int k,l;
                k=i;
                l=j;
                
                for(int q=0;q<3;q++){
                   if(tfMatrix[q][l]==3) {
                        tfMatrix[q][l]=1*idfVector[currentword];
                   }
                   else if(tfMatrix[q][l]>0)
                        tfMatrix[q][l]=tt.Fuzzify((int)sum, (int)tfMatrix[q][l])*idfVector[currentword];
                }
                //break;
            }
            else {
                //System.out.println("i:"+i+"  j:"+j);
                int k,l;
                k=i;
                l=j;
                
                for(int q=0;q<3;q++){
                   if(tfMatrix[q][l]>0) {
                        tfMatrix[q][l]=tt.Fuzzify((int)sum, (int)tfMatrix[q][l])*idfVector[currentword];
                   }
            }
            
        }
            currentword++;
        }
        
                System.out.println("*************New TF_Matrix************");

         //NewJFrame2 f2 = new NewJFrame2();
         //f2.jTextArea2.setText("Helllo");
        for (String s : wordVector) {
            System.out.print(s + "\t");
//       NewJFrame2.jLabel5.setText(FName);
//       filetext=jTextArea1.getText();
       // NewJFrame2.jTextArea1.append("\n");
        
        //f2.jTextArea2.append(s+"\t");
        }
 //       f2.setVisible(true);
        System.out.println();
        for (int docIdx = 0; docIdx < docs.length; docIdx++) {
            for (int wordIdx = 0; wordIdx < numOfWords; wordIdx++) {
                System.out.print(tfMatrix[docIdx][wordIdx]+"\t");
                //NewJFrame2.jTextArea1.append(tfMatrix[docIdx][wordIdx]+"\t");
           
            }
            System.out.println();
        }
        
        System.out.println("****************************");
        
        
        
         unknowndocument(undoc);
        
        
        
        
        doc1length=Doclength(0);
        doc2length=Doclength(1);
        doc3length=Doclength(2);
        
        double sumu=0.0;
        for(int j=0;j<wordVector.length;j++){
            sumu+=Math.pow(udocmatrix[j], 2);
        }
        udoclength=Math.sqrt(sumu);
        System.out.println("Document1 Length: "+doc1length);
        System.out.println("Document2 Length: "+doc2length);
        System.out.println("Document3 Length: "+doc3length);
        System.out.println("UnDocument Length: "+udoclength);
                
        //Calculate the cosine similarity of Documents with the Unknown Document
        
        //Cossine Similarity for Document 1
        double dot1,dot2,dot3;
        dot1=CosineVal(0);
        dot2=CosineVal(1);
        dot3=CosineVal(2);
        
        System.out.println("Dot 1:"+dot1);
        System.out.println("Dot 2:"+dot2);
        System.out.println("Dot 3:"+dot3);
        
        cosine1=dot1/(doc1length*udoclength);
        cosine2=dot2/(doc2length*udoclength);
        cosine3=dot3/(doc3length*udoclength);
        System.out.println("************Cosine Values*************");
        System.out.println("Cosine Values : "+cosine1);
        System.out.println("Cosine Values : "+cosine2);
        System.out.println("Cosine Values : "+cosine3);
        System.out.println("*************************");
        
        
        
        
        
        

        // normalize idfMatrix by deviding corresponding doc length
  
    }
    
    
    
    
    
    
public static void main(String[] args) {
        
        String[] docs = new String[]{"Sports skills nature", "Technology Education people","Technology devices infrastructure software"};
         //String[] docs = new String[]{"Education process facilitating learning acquisition knowledge skills value beliefs habits methods educational storytelling discussion teaching training research educators formal informal experience stages preschool kindergarten primary school secondary college university structured environment explicit purpose students classrooms curriculum country children nursery physical intellectual age compulsary elementary republic adolescence transition comprehnsive minors higher adults system profession history grammar academies fee-paying charitable foundation community degree population economies liberal arts technical vocational apprenticeshipÂ  internship institutions agriculture medicine engineering architecture technology countries significant role people areas impoverished charities Education process facilitating competitive forms laptop child dedicated infrastructure materials major corporations mission software available cost donation private public funding schools objectives growing international policy affordable poor quality development organisation demand success equity literature schooling girls boys social studies teacher activity pupil government parents perception facilities instruction language groups society socail status sustainability salaries finanacial socialization communication subjects textbooks libraries internet determination resources books media improve change abundantly perpetuating inequalities exacerbating Indigenous model method recognition communities reclaim revalue lenguage cultures economic co-peration home work interactions acquistion time youth programs establishment practical requirement management natural recreation open electronic online course tution large campus academic traditional universal minority goals economics sustainable leadership ownership improvisation grade capacity achivements strategies implementation", 
          //  "Education sports forms competitive physical activity games casual organized participation aim use maintain improve ability skills providing entertainment paricipants spectators contest sides attempting exceed other tie winner loser twosided contests tournament champion leagues annual single contestants hundreds simultaneous competing individuals racing attitude strives fair play courtesy teammates opponents ethical behaviour integrity grace victory defeat aspiration ethos opposing views necessity element professional governing bodies prerequisite recognition International Olympic Committee Accord advocate widening definition Council Europe exercise reduce impact losing school graded classified result divided comparable performance gender weight age measurement objective subjective corrected handicaps penalties gymnastics panel judges important success studio every walks life outdoor indoor athletics ancient Greece principal part advanced countries present day regular feature college curriculum various kinds boys girls practice races jumps discuss throw javelin pass afternoon useful activities football cricket hockey volleyball basketball badminton affairs held winter months high long pole different foster spirit sportsmanship student interclass tournaments relation tennis cycling disciplined civilized nation importance spends large sum money improving standard players athletes sports forms competitive Technology  collection forms India far satisfactory Government steps educational institution arrange students schools playground encourage become good engineers doctors seldom footballer",
           // "Education Technology collection techniques skills methods processes production goods services  accomplishment objectives scientific investigation Technology knowledge machines computers devices factories knowledge workings human conversion natural resources simple tools  prehistoric discovery   Neolithic Revolution available sources food invention  wheel  humans travel control environment. Developments historic times  printing press  telephone Internet lessened physical barriers  communication  allowed interact freely global scale. steady progress  military brought weapons  ever-increasing destructive power  clubs  nuclear weapons. advance deconomies  leisure class technological unwanted product pollution deplete resources, detriment influence  values  society ethical questions. notion  efficiency  terms term originally challenge traditional norms development ings, Technology  collection techniques sports forms competitive 21st century  primates  productivitY generations Amerisociologist Read Bain wrote technology tools, utensils, weapons instruments housing clothing communicating transporting skills Bain definition common scholars especially social scientists. equally prominent applied science, among scientists self Dictionaries variety definitions. practical application particular area capability Ursula Franklin, Real World lecture concept practice specific field"};
         
         String doc1,doc2,doc3;
         Fuzzy fu=new Fuzzy();
         doc1=fu.Stemmer(docs[0]);
         doc2=fu.Stemmer(docs[1]);
         doc3=fu.Stemmer(docs[2]);
         
         String udoc="Education is the process of facilitating learning or the acquisition of technology and skills education";
         
         //String udoc="sport";
         udoc=fu.Stemmer(udoc);
         System.out.println("Unknown document is:"+udoc);
         docs[0]=doc1;
         docs[1]=doc2;
         docs[2]=doc3;
         
         
         
         for(int i=0;i<3;i++)
         {
             System.out.println(docs[i]);
         }
         
         fu.Fuzz(docs,udoc);
         
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
         
        //Fuzzy tf_idf = new Fuzzy(docs);
}

    public void unknowndocument(String undoc) {
         //To change body of generated methods, choose Tools | Templates.
         System.out.println();
         Fuzzy fo=new Fuzzy();
         undoc=fo.Stemmer(undoc);
         int val;
         HashMap<String, Integer> udoc = new HashMap<>();
        int nextIdx = 0;
            for (String word : undoc.split(" ")) {
                Integer f = udoc.get(word);
                if (f == null) {
                    udoc.put(word, 1); 
                } else { 
                    udoc.put(word, f+1);
                } 
                
                /*if (!udoc.containsKey(word)) {
                    udoc.put(word, nextIdx);
                    nextIdx++;
                }
                else if (udoc.containsKey(word)) {
                    val=udoc.get(word);
                    udoc.remove(val);
                    val+=1;
                    
                    udoc.put(word,val);
                    nextIdx++;
                }*/
            }
 
         for(String word : udoc.keySet()) {
             //System.out.println("Word: "+word+" Frequency: "+udoc.get(word));
             
         }
            
         int numOfWords1 = udoc.size();

        // STEP 2, create word vector where wordVector[i] is the actual word
        String[] wordVector1 = new String[numOfWords1];
        
        String[] newwordVector1 = new String[numOfWords1];
        
        int i=0,g=0;
        for (String word : udoc.keySet()) {
            if(Arrays.asList(wordVector).contains(word)){
                newwordVector1[i] = word;
                i++;
                g++;
            }
        }
        /* 
        for(i=0;i<wordVector1.length;i++){
            if(wordVector1[i] == null)
                ;
            else {
                wordVector1[g]=wordVector1[i];
                g++;
            }
        }
        
        for(i=0;i<g;i++)
        {
            newwordVector1[i]=wordVector1[i];
        }
        */
        for(i=0;i<g;i++)
            System.out.println("Unknown Word (New Word Vector) : "+newwordVector1[i]);
        
        int max=-999;
        
        for(i=0;i<g;i++){
          if(udoc.get(newwordVector1[i])>max)
              max=udoc.get(newwordVector1[i]);
        }
        System.out.println("Maxiumum frequency is: "+max);
        
        for(i=0;i<wordVector.length;i++)
        {
            //System.out.println(wordVector[i]);
        }
        
        udocmatrix=new double[wordVector.length];
        
        for(i=0;i<wordVector.length;i++){
            if(Arrays.asList(newwordVector1).contains(wordVector[i])){
                 System.out.println("Filtered Data :"+wordVector[i]);
                System.out.println("Filtered Data :"+udoc.get(wordVector[i]));
                //System.out.println("Value :"+udoc.get(wordVector[i])/max);
                
                udocmatrix[i]=(double)udoc.get(wordVector[i])/max;
                System.out.println("Value :"+udocmatrix[i]);
                
                //System.out.println("IDF now is:"+idfVector[i]);
            }
        }
        System.out.println("Unknown Document Matrix is:");
        for(i=0;i<udocmatrix.length;i++){
            System.out.print(udocmatrix[i]+"  ");
        }
        System.out.println();
        //System.out.println("\n Word : Education Frequency: "+udoc.get("Education"));
    }

    private double Doclength(int i) {
        
        double sum=0.0;
        for(int j=0;j<wordVector.length;j++){
            sum+=Math.pow(tfMatrix[i][j], 2);
        }
        
        return (Math.sqrt(sum));
        
    
    
    }

    private double CosineVal(int i) {
        
        double sum1=0.0;
        for(int q=0;q<wordVector.length;q++)
        {
            sum1+=tfMatrix[i][q]*udocmatrix[q];
        }
       return sum1; 
        
    
    
    }
    public String Stemmer(String doc)
    {
        ArrayList<String> wordlist = new ArrayList<String>();
        ArrayList<String> wordlist1 = new ArrayList<String>();
        String[] stopwords={"a", "about", "above", "above", "across", "after", "afterwards", "again", "against", "all", "almost", "alone", "along", "already", "also","although","always","am","among", "amongst", "amoungst", "amount",  "an", "and", "another", "any","anyhow","anyone","anything","anyway", "anywhere", "are", "around", "as",  "at", "back","be","became", "because","become","becomes", "becoming", "been", "before", "beforehand", "behind", "being", "below", "beside", "besides", "between", "beyond", "bill", "both", "bottom","but", "by", "call", "can", "cannot", "cant", "co", "con", "could", "couldnt", "cry", "de", "describe", "detail", "do", "done", "down", "due", "during", "each", "eg", "eight", "either", "eleven","else", "elsewhere", "empty", "enough", "etc", "even", "ever", "every", "everyone", "everything", "everywhere", "except", "few", "fifteen", "fify", "fill", "find", "fire", "first", "five", "for", "former", "formerly", "forty", "found", "four", "from", "front", "full", "further", "get", "give", "go", "had", "has", "hasnt", "have", "he", "hence", "her", "here", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "him", "himself", "his", "how", "however", "hundred", "ie", "if", "in", "inc", "indeed", "interest", "into", "is", "it", "its", "itself", "keep", "last", "latter", "latterly", "least", "less", "ltd", "made", "many", "may", "me", "meanwhile", "might", "mill", "mine", "more", "moreover", "most", "mostly", "move", "much", "must", "my", "myself", "name", "namely", "neither", "never", "nevertheless", "next", "nine", "no", "nobody", "none", "noone", "nor", "not", "nothing", "now", "nowhere", "of", "off", "often", "on", "once", "one", "only", "onto", "or", "other", "others", "otherwise", "our", "ours", "ourselves", "out", "over", "own","part", "per", "perhaps", "please", "put", "rather", "re", "same", "see", "seem", "seemed", "seeming", "seems", "serious", "several", "she", "should", "show", "side", "since", "sincere", "six", "sixty", "so", "some", "somehow", "someone", "something", "sometime", "sometimes", "somewhere", "still", "such", "system", "take", "ten", "than", "that", "the", "their", "them", "themselves", "then", "thence", "there", "thereafter", "thereby", "therefore", "therein", "thereupon", "these", "they", "thickv", "thin", "third", "this", "those", "though", "three", "through", "throughout", "thru", "thus", "to", "together", "too", "top", "toward", "towards", "twelve", "twenty", "two", "un", "under", "until", "up", "upon", "us", "very", "via", "was", "we", "well", "were", "what", "whatever", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", "whither", "who", "whoever", "whole", "whom", "whose", "why", "will", "with", "within", "without", "would", "yet", "you", "your", "yours", "yourself", "yourselves", "the"};
        ArrayList<String> tok = new ArrayList<String>();
        ArrayList<String> tokadd = new ArrayList<String>();
         
             
                for (String word : doc.split(" ")) {
                   if(!Arrays.asList(stopwords).contains(word)){ 
                   wordlist.add(word);
                   }
            }
          for (String x: wordlist){
             if(x.length()>0){
                    x=x.toLowerCase();
                    x=x.trim();
                    x=x.replace(",","");
                    x=x.replace(".","");
                    tok.add(x);
                }
        } 
        
        //System.out.println(tok);
        
        for(String w:tok){
            //System.out.println("WWWWord :"+w);
        }
        
        PorterCheck pc=new PorterCheck();
         //System.out.println("**************** Complete Stem************** \n"+pc.completeStem(tok));
         tokadd=pc.completeStem(tok);
        
         System.out.println(tokadd);
         //System.out.println(wordlist);
         
         
         //int le=wordVector.length;
         int b=0;
         for(String word:tokadd){
             //wordVector[b]=word;
             //b++;
             wordlist1.add(word);
         }
         //numOfWords=wordVector.length;
         //System.out.println("\n Num of words after change: "+numOfWords);
        
        String woo=""; 
       for(String word:tokadd)
       {
           //System.out.println(" Tokadd Word: "+word);
           word=word.toLowerCase();
           word=word.trim();
           word=word.replace(",","");
           word=word.replace(".","");
           woo+=word+" ";
       }
        
        //System.out.println("\n ******** Woo is ******* \n"+woo);
        //System.out.println(wordlist);
        
        return woo;
    }


}