import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;

/**
 * Created by pquintero on 12/11/16.
 */
public class readCSV {

    public static void main(String[] args) {
        System.out.println("Inicio ");

        System.out.println("hola mundo !!");
        String appName = "Show Data";
        String master = "local[4]";
        String path = "/Users/pquintero/Desktop/";
        String csvInput = path+"sst.csv";

        SparkConf conf = new SparkConf().setAppName(appName).setMaster(master);
        JavaSparkContext sc = new JavaSparkContext(conf);

        /*
        JavaRDD<sst> rdd_records = sc.textFile(csvInput).map(
                new Function<String, sst>() {
                    public sst call(String line) throws Exception {
                        String[] fields = line.split(",");
                        sst sst = new sst();
                        return sst;
                    }
                }
        );*/

        JavaRDD<String> rdd_records = sc.textFile(csvInput);
        String header = rdd_records.first(); //extract header

        System.out.println("Header -->> : "+header);
        System.out.println("Total -->>  :"+rdd_records.count());

        final Double[] average = {0.0};

        JavaRDD<sst> data_sst = rdd_records.map(new Function<String, sst>() {
            public sst call(String line) throws Exception {
                if (!line.contains("type")){
                    String[] fields = line.split(",");
                    sst sst = new sst(fields);
                    //average[0] = Double.valueOf(average[0] + sst.getValueMeasurement());
                    return sst;
                }else
                {
                    return null;
                }
            }
        });

        JavaRDD<String> rdd_ncom = rdd_records.filter(s -> s.contains("ncom"));
        JavaRDD<String> rdd_hycom = rdd_records.filter(s -> s.contains("hycom"));


        long total_sst_new = data_sst.count();
        long total_rdd_ncom = rdd_ncom.count();
        long total_rdd_hycom = rdd_hycom.count();

        System.out.println("total SST " + total_sst_new);
        System.out.println("total SST " + total_rdd_ncom);
        System.out.println("total SST " + total_rdd_hycom);

        System.out.println("total ncom  + hycom "+(total_rdd_ncom+total_rdd_hycom));


    }
}
