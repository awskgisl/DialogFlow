package hello;

public class SimpleResponse {
    private final String fulfillmentText;

   public SimpleResponse(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
        
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }


   
}
