
public class Trial_Test  
{
 public int GetTFTVal()
    {
         double a=0.0;   
         int b=0;
        a = java.lang.Math.random()*10;
        b = (int)a;
        return b;
    }
    //Method Declared to calc the TF score for all the term and Calc the Len Of Doc.
    public double Calc_TE_SCore(String[] str1 , String[] str2, String[] str3,String DocName)
    {
        
        double len=0,Termval=0,TotalVal=0;
        int b=0;
       System.out.println("\n************* "+DocName+" *************\n");
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
            
            System.out.println("\n "+str1[i]+" => "+Termval);
              
        }
              TotalVal += (Termval*Termval);
        
        len = java.lang.Math.sqrt(TotalVal);
        return len;
    }
            
    public void Important() {//GEN-FIRST:event_jButton2ActionPerformed
             int EstrCount=0, SstrCount=0,TstrCount=0;
      double EduLen,SptLen,TechLen;
        String s = "Education Technology process learning knowledge";
             
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
        
        String news[] = s.split(" ");
        System.out.println("***************");
        
        // TF score for all Term and len
         EduLen = Calc_TE_SCore(Estr, Sstr, Tstr,"Education Doc");
         SptLen = Calc_TE_SCore(Sstr,Tstr,Estr,"Sports Doc");
         TechLen = Calc_TE_SCore(Tstr,Estr, Sstr ,"Techinal Doc");
        
        //TFIDF of New Document
         int TotalTerm=0,CountOfFet=0;
         double TFIDFVal =0.0, Total_TFIDF = 0.0,NewDoc_TFID=0.0;
         double Educon=0.0,Sptcos=0.0,Teccos=0.0;  
         
         for(int a=0;a<news.length;a++)
         {
             for(int b=1;b<news.length;b++)
             {
                 if(!news[a].equalsIgnoreCase(news[b]))
                 {
                     TotalTerm++;
                 }
             }
         }
         for(int a=0;a<news.length;a++)
         {
             for(int b=1;b<news.length;b++)
             {
                 if(news[a].equalsIgnoreCase(news[b]))
                 {
                     CountOfFet++;
                 }
             }
           TFIDFVal  = (CountOfFet/TotalTerm)*(CountOfFet/TotalTerm);
           Total_TFIDF +=TFIDFVal;
         }
         
         NewDoc_TFID = java.lang.Math.sqrt(Total_TFIDF);
         System.out.println("\nNewDOC_TFID is: "+NewDoc_TFID);
         
         //Cosine Similarirty  
         
        for(int a=0; a<news.length;a++)
        {
            for(int b=0; b<Estr.length; b++)
            {
                if(news[a].equalsIgnoreCase(Estr[b]))
                {
                    EstrCount++;
                }
                Educon=(EstrCount*NewDoc_TFID)/EduLen;
            }
        }
        
        
        for(int c=0; c<news.length;c++)
        {
            for(int d=0; d<Sstr.length; d++)
            {
                if(news[c].equalsIgnoreCase(Sstr[d]))
                {
                    SstrCount++;   
                }
                Sptcos=(SstrCount*NewDoc_TFID)/SptLen;
            }
        }
        
        for(int f=0; f<news.length;f++)
        {
            for(int e=0; e<Tstr.length; e++)
            {
                if(news[f].equalsIgnoreCase(Tstr[e]))
                {
                    TstrCount++;
                }
                Teccos=(TstrCount*NewDoc_TFID)/TechLen;
            }
        }
      System.out.println("******* New Feature Vector ***");
      System.out.println("Edu_IFV = "+EstrCount);
      System.out.println("Sports_IFV = "+SstrCount);
      System.out.println("Tech_IFV = "+TstrCount);
       
      System.out.println("******* Cosine Value ********");
      System.out.println("Edu_Cos = "+Educon);
     System.out.println("Sports_Cos = "+Sptcos);
     System.out.println("Tech_Cos = "+Teccos);
//       
//      System.out.println("New Doc TFID = "+NewDoc_TFID);
//       
        
      
            if(EstrCount>SstrCount)
            {
                if(EstrCount>TstrCount)
                {
                    //System.out.println("This Doc file belogs to Education Cagegires");
                }
                else
                {
                    
                }
            }
            
                if(SstrCount>TstrCount)
                {
                }
            
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        Trial_Test a = new Trial_Test();
        a.Important();
      
    
    }
}
