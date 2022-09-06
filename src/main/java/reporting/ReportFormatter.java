package reporting;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType){
        switch(formatType){
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }
    private String convertObjectToXML(Object obj){
        return "XML: <title>"+obj.toString()+"</title>";
    }
    private String convertObjectToCSV(Object obj){
        return "CSV: ,,"+obj.toString()+",,";
    }

    protected String getFormattedValue(){
        return formattedOutput;
    }

}
