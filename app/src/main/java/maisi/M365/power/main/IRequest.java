package maisi.M365.power.main;

public interface IRequest {

    public int getDelay();

    public String getRequestString();

    //get RequestBit to identify
    public String getRequestBit();

    //expected to update the textviews and the statistic class
    public String handleResponse(String[] request);

    public RequestType getRequestType();

}
