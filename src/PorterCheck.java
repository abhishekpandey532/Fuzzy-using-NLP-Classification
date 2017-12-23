import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 
 
public class PorterCheck { 
    public static void main(String args[]) throws IOException{
        PorterAlgo pa = new PorterAlgo();
 
        //checks for vowels in a given string 
        System.out.println(pa.containsVowel("vaibhav"));
 
        //removes special characters 
        System.out.println(pa.Clean("vaibhav's book"));
 
        //check for a given suffix 
        NewString stem = new NewString();
        System.out.println(pa.hasSuffix("corresponding","ing",stem));
 
        //stemming the words 
        ArrayList<String> tok = new ArrayList<String>();
        String[] tokens = {"Sportsmanship","Education","process","facilitating","learning","acquisition","knowledge","skills","value","beliefs","habits","methods","educational","storytelling","discussion","teaching","training","research","educators","formal","informal","experience","stages","preschool","kindergarten","primary","school","secondary","college","university","structured","environment","explicit","purpose","students","classrooms","curriculum","country","children","nursery","physical","intellectual","age","compulsary","elementary","republic","adolescence","transition","comprehnsive","minors","higher","adults","system","profession","history","grammar","academies","fee-paying","charitable","foundation","community","degree","population","economies","liberal","arts","technical","vocational","apprenticeshipÂ ","internship","institutions","agriculture","medicine","engineering","architecture","technology","countries","significant","role","people","areas","impoverished","charities","Education","process","facilitating",  "competitive","forms" ,"laptop","child","dedicated","infrastructure","materials","major","corporations","mission","software","available","cost","donation","private","public","funding","schools","objectives","growing","international","policy","affordable","poor","quality","development","organisation","demand","success","equity","literature","schooling","girls","boys",	"social","studies","teacher","activity","pupil","government","parents","perception","facilities","instruction","language","groups","society","socail","status","sustainability","salaries","finanacial","socialization","communication","subjects","textbooks","libraries","internet","determination","resources","books","media","improve",	"change","abundantly","perpetuating","inequalities","exacerbating","Indigenous","model","method","recognition","communities","reclaim","revalue","lenguage","cultures","economic","co-peration", "home","work","interactions","acquistion","time","youth","programs","establishment","practical","requirement","management","natural","recreation",	"open",	"electronic","online","course","tution","large","campus","academic","traditional","universal","minority","goals","economics","sustainable","leadership","ownership",	"improvisation","grade","capacity","achivements","strategies","implementation"};
        for (String x: tokens){
            tok.add(x);
        } 
        System.out.println(completeStem(tok));
 
        
 
        System.out.println("Tokenizing the input file:");
    } 
 
    //method to completely stem the words in an array list 
    public static ArrayList<String> completeStem(List<String> tokens1){
        PorterAlgo pa = new PorterAlgo();
        ArrayList<String> arrstr = new ArrayList<String>();
        for (String i : tokens1){
            String s1 = pa.step1(i);
            String s2 = pa.step2(s1);
            String s3= pa.step3(s2);
            String s4= pa.step4(s3);
            String s5= pa.step5(s4);
            arrstr.add(s5);
        } 
        return arrstr;
    } 
} 