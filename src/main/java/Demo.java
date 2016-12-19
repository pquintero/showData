import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

/**
 * Created by pquintero on 12/11/16.
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("hola mundo !!");
        String appName = "Show Data";
        String master = "local";
        String path = "/Users/pquintero/Desktop/";
        String csvInput = path+"sst.csv";


        SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
        JavaSparkContext sc = new JavaSparkContext(conf);

        //JavaRDD<String> textFile = sc.textFile(csvInput);
        JavaRDD<String> textFile = sc.textFile(csvInput);
        long total = textFile.count();

        System.out.println("total -->> :"+total);


        JavaRDD<String> ncomData = textFile.filter(new Function<String, Boolean>() {
            public Boolean call(String v1) throws Exception {
                return v1.contains("ncom");
            }
        });
        long totalNcom = ncomData.count();

        System.out.println("totalNcom -->> :"+totalNcom);

        /* Para recorrer data de rdd

        for (String line : textFile.take(10000)){
            System.out.println(line);
        }
        */
    }
}
