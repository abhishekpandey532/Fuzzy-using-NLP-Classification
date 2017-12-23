
import java.io.IOException;
import java.util.List;

public class TF_Val {
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
    
    public static void main(String[] args)throws IOException {
    
        
        
        
        
        
        

        
        
    }
}
