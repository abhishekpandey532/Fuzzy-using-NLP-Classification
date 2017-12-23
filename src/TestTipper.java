import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;
//import net.sourceforge.jFuzzyLogic.rule.FuzzyRuleSet;

public class TestTipper {
  public static void main(String[] args) throws Exception {
    //fis.setVariable("service", 6); // Set inputs
    //fis.setVariable("food", 5);
    //fis.evaluate(); // Evaluate

    // Show output variable
    //System.out.println("Output value:" + fis.getVariable("tip").getValue()); 
    TestTipper tt=new TestTipper();
    for(int i=1;i<=9;i++){
        for(int j=0;j<=i;j++)
             System.out.println("For: "+i+","+j+" : "+tt.Fuzzify(i,j));
        System.out.println("****************");
  }
  }
  public double Fuzzify(int val1,int val2)
  {
      FIS fis = FIS.load("tipper.fcl", true); // Load from 'FCL' file
    
      fis.setVariable("service",val1);
      fis.setVariable("food",val2);
      fis.evaluate();  
      return (fis.getVariable("tip").getValue());
      //System.out.println("Output value:" + fis.getVariable("tip").getValue()); 
  
  }
}