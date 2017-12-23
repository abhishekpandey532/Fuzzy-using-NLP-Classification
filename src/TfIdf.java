import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Mohamed Guendouz
 */
public class TfIdf {
    /**
     * @param doc  list of strings
     * @param term String represents a term
     * @return term frequency of term in document
     */
    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word))
                result++;
        }
        //System.out.println("TF:"+(result/doc.size()));
        return result / doc.size();
    }

    /**
     * @param docs list of list of strings represents the dataset
     * @param term String represents a term
     * @return the inverse term frequency of term in documents
     */
    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        //System.out.println("IDF:"+(1+Math.log(docs.size() / n)));
        return (1+Math.log(docs.size() / n));
    }

    /**
     * @param doc  a text document
     * @param docs all documents
     * @param term term
     * @return the TF-IDF of term
     */
    public double tfIdf(List<String> doc, List<List<String>> docs, String term) {
        return tf(doc, term) * idf(docs, term);

    }

    public static void main(String[] args) {

        List<String> doc1 = Arrays.asList("Education","Technology","process","facilitating","learning","acquisition","knowledge","skills","value","beliefs","habits","methods","educational","storytelling","discussion","teaching","training","research","educators","formal","informal","experience","stages","preschool","kindergarten","primary","school","secondary","college","university","structured","environment","explicit","purpose","students","classrooms","curriculum","country","children","nursery","physical","intellectual","age","compulsary","elementary","republic","adolescence","transition","comprehnsive","minors","higher","adults","system","profession","history","grammar","academies","fee-paying","charitable","foundation","community","degree","population","economies","liberal","arts","technical","vocational","apprenticeshipÂ ","internship","institutions","agriculture","medicine","engineering","architecture","technology","countries","significant","role","people","areas","impoverished","charities","Education","process","facilitating",  "competitive","forms" ,"laptop","child","dedicated","infrastructure","materials","major","corporations","mission","software","available","cost","donation","private","public","funding","schools","objectives","growing","international","policy","affordable","poor","quality","development","organisation","demand","success","equity","literature","schooling","girls","boys",	"social","studies","teacher","activity","pupil","government","parents","perception","facilities","instruction","language","groups","society","socail","status","sustainability","salaries","finanacial","socialization","communication","subjects","textbooks","libraries","internet","determination","resources","books","media","improve",	"change","abundantly","perpetuating","inequalities","exacerbating","Indigenous","model","method","recognition","communities","reclaim","revalue","lenguage","cultures","economic","co-peration", "home","work","interactions","acquistion","time","youth","programs","establishment","practical","requirement","management","natural","recreation",	"open",	"electronic","online","course","tution","large","campus","academic","traditional","universal","minority","goals","economics","sustainable","leadership","ownership",	"improvisation","grade","capacity","achivements","strategies","implementation");
        List<String> doc2 = Arrays.asList("Education", "sports","forms","competitive","physical","activity","games","casual","organized","participation","aim","use","maintain","improve","ability","skills","providing","entertainment","paricipants","spectators","contest","sides","attempting","exceed","other","tie","winner","loser","twosided","contests","tournament","champion",	"leagues","annual","single","contestants","hundreds","simultaneous","competing","individuals","racing","attitude","strives","fair","play","courtesy","teammates","opponents","ethical","behaviour","integrity","grace","victory","defeat","aspiration","ethos","opposing","views","necessity","element","professional","governing","bodies",	"prerequisite","recognition","International","Olympic","Committee","Accord","advocate","widening","definition","Council","Europe","exercise","reduce","impact","losing","school","graded","classified","result","divided","comparable","performance","gender","weight","age","measurement","objective","subjective","corrected","handicaps","penalties","gymnastics","panel","judges","important","success","studio","every","walks","life","outdoor","indoor","athletics","ancient","Greece","principal","part","education","advanced","countries","present","day","regular","feature","college","curriculum","various","kinds","boys","girls","practice","races","jumps","discuss","throw","javelin","pass","afternoon","useful","activities","football","cricket","hockey","volleyball","basketball","badminton","affairs","held","winter","months","high","long","pole","different","foster","spirit","sportsmanship","student","interclass","tournaments","relation","tennis","cycling","disciplined","civilized","nation","importance","spends","large","sum","money","improving","standard","players","athletes","sports","forms","competitive","Technology ", "collection","forms","India","far","satisfactory","Government","steps","educational","institution","arrange","students","schools","playground","encourage","become","good","engineers","doctors","seldom","footballer");
        List<String> doc3 = Arrays.asList("Education","Technology ", "collection", "techniques", "skills", "methods", "processes", "production", "goods services ","accomplishment","objectives","scientific","investigation","Technology","knowledge","machines","computers","devices","factories","knowledge","workings","human","conversion","natural","resources","simple","tools"," prehistoric discovery","  Neolithic","Revolution available","sources","food","invention"," wheel ","humans","travel","control","environment.","Developments","historic","times"," printing","press"," telephone","Internet","lessened","physical","barriers"," communication ","allowed","interact","freely","global","scale.","steady","progress"," military","brought weapons ","ever-increasing","destructive","power"," clubs  nuclear","weapons.","advance","deconomies"," leisure","class","technological","unwanted","product pollution",	"deplete","resources,","detriment","influence"," values ","society","ethical","questions.","notion"," efficiency ","terms","term","originally","challenge","traditional","norms","development","ings,","Technology ", "collection", "techniques","sports","forms","competitive","21st","century"," primates ","productivitY","generations","Amerisociologist","Read","Bain","wrote","technology","tools,","utensils,","weapons","instruments","housing","clothing","communicating","transporting","skills Bain","definition","common","scholars","especially","social","scientists.","equally","prominent","applied","science,","among","scientists","self Dictionaries","variety","definitions.","practical","application","particular","area","capability","Ursula","Franklin,","Real","World","lecture","concept","practice","specific","field","technology");
        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3);

        TfIdf calculator = new TfIdf();
        
        List<String> query = Arrays.asList("Education","Technology");
        
        //HashMap<String, Integer> step3 = new HashMap<>();
        String step3[][] = new String[10][10]; 
        
        System.out.println("Query is:"+query);
        System.out.println("*************Document 1****************");
        int i=0;
        for (String word : query){
        double tfidf = calculator.tfIdf(doc1, documents, word);
        
        step3[i][0]=String.valueOf(tfidf);
        
        
        System.out.println("TF-IDF"+(word)+" = " + tfidf);
        i++;

        }
        i=0;
        System.out.println("*************Document 2****************");
        for (String word : query){
        double tfidf = calculator.tfIdf(doc2, documents, word);
        
         step3[i][1]=String.valueOf(tfidf);
        i++;

        
        System.out.println("TF-IDF"+(word)+" = " + tfidf);

        }
        i=0;
        System.out.println("*************Document 3****************");
        for (String word : query){
        double tfidf = calculator.tfIdf(doc3, documents, word);
        
          step3[i][2]=String.valueOf(tfidf);
        
            i++;
        
        System.out.println("TF-IDF"+(word)+" = " + tfidf);

        }
        System.out.println("********************");
        //Printing the TF-IDF Matrix
        for(i = 0; i < query.size(); i++)
          { 
            for(int j = 0; j < 3; j++)
              { 
                 System.out.print("    "+step3[i][j]);
              } 
                System.out.println();
           } 

        //System.out.println(query.size());
        double tfval=1.0/query.size();
        System.out.println(tfval);
        
        double iddf;
        String qtfidf[]=new String[query.size()];
        i=0;
        for(String term:query){
           
            iddf=calculator.idf(documents, term);
           //System.out.println(iddf);
           qtfidf[i]=String.valueOf(iddf*tfval);
           i++;
        }
        for(i=0;i<query.size();i++)
            System.out.println(qtfidf[i]);
        
        System.out.println("****** Cossine for Document1 ***********");
        
        
        double x=0.0,y=0.0,z;
        for(i=0;i<query.size();i++){
            x+=Math.pow(Double.parseDouble(qtfidf[i]),2);
        }
        double magquery=Math.sqrt(x);
        System.out.println(Math.sqrt(x));
        
        for(i=0;i<query.size();i++){
            y+=Math.pow(Double.parseDouble(step3[i][0]),2);
        }
        double magdoc1=Math.sqrt(y);
        System.out.println(magdoc1);
        
        System.out.println("********Similarity Measure*************");
        
        double dotproduct=0.0;
        for(i=0;i<query.size();i++){
            dotproduct+=Double.parseDouble(qtfidf[i])*Double.parseDouble(step3[i][0]);
        }
        System.out.println("Dot product is:"+dotproduct);
        
        double simdoc1;
        simdoc1=dotproduct/(magdoc1*magquery);
        
        System.out.println("Similarity for document1 and query is:"+simdoc1);
        
        //Similarity measure for Document2 and the query 
        
        y=0.0;
        for(i=0;i<query.size();i++){
            y+=Math.pow(Double.parseDouble(step3[i][1]),2);
        }
        double magdoc2=Math.sqrt(y);
        //System.out.println(magdoc2);
        
        System.out.println("********Similarity Measure*************");
        
        dotproduct=0.0;
        for(i=0;i<query.size();i++){
            dotproduct+=Double.parseDouble(qtfidf[i])*Double.parseDouble(step3[i][1]);
        }
        System.out.println("Dot product is:"+dotproduct);
        
        double simdoc2;
        simdoc2=dotproduct/(magdoc2*magquery);
        
        
        
        System.out.println("Similarity for document2 and query is:"+simdoc2);
        
        //Similarity Measure of Document3 and query
        
        y=0.0;
        for(i=0;i<query.size();i++){
            y+=Math.pow(Double.parseDouble(step3[i][2]),2);
        }
        double magdoc3=Math.sqrt(y);
        //System.out.println(magdoc3);
        
        System.out.println("********Similarity Measure*************");
        
        dotproduct=0.0;
        for(i=0;i<query.size();i++){
            dotproduct+=Double.parseDouble(qtfidf[i])*Double.parseDouble(step3[i][2]);
        }
        System.out.println("Dot product is:"+dotproduct);
        
        double simdoc3;
        simdoc3=dotproduct/(magdoc3*magquery);
        
        
        
        System.out.println("Similarity for document3 and query is:"+simdoc3);
        
        

        
    }


}
